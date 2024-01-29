package BooleanCircuits

import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class ParityTest extends AnyFlatSpec with ChiselScalatestTester {
    behavior of "Parity Module"

    it should s"Test Xor Logic for all cases" in {
        test(new Xor()) { dut =>
           println("a | b | z")
            println("---------")
            for (in1 <- 0 until 2) { 
                for (in2 <- 0 until 2) {

                    dut.io.a.poke(in1.U)
                    dut.io.b.poke(in2.U)
                    dut.clock.step()

                    var z = dut.io.z.peek().litValue

                    val expected = in1 ^ in2
                    dut.io.z.expect(expected.U)
                    println(s"$in1 | $in2 | $z") //fancy print formatting
                }
            }
        }
        println("XOr Test Complete")
    }

    it should s"Test Parity Logic for a random 5 bit case" in {
        test(new Parity()) { dut => //even = 0, odd = 1

            //randomly generate input
            val rand1 = scala.util.Random.nextInt(2)
            val rand2 = scala.util.Random.nextInt(2)
            val rand3 = scala.util.Random.nextInt(2)
            val rand4 = scala.util.Random.nextInt(2)
            val rand5 = scala.util.Random.nextInt(2)
            
            //poke the values as UInts
            dut.io.in1.poke(rand1.U)
            dut.io.in2.poke(rand2.U)
            dut.io.in3.poke(rand3.U)
            dut.io.in4.poke(rand4.U)
            dut.io.in5.poke(rand5.U)


            //Calculate expected value
            val isEven = (rand1 + rand2 + rand3 + rand4 + rand5) % 2
            println("In1 | In2 | In3 | In4 | In5 | Out")
            println(s" $rand1  |  $rand2  |  $rand3  |  $rand4  |  $rand5  |  $isEven ")
            dut.io.out.expect(isEven.U)
            
        }
        println("Random Parity Test Complete")
    }
    
}

