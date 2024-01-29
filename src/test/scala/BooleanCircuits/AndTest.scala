package BooleanCircuits


import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class AndTest extends AnyFlatSpec with ChiselScalatestTester {
    behavior of "And Module"
    it should s"Test And Logic for 1 case" in {
        test(new And()) { dut =>
            dut.io.a.poke(0.U)
            dut.io.b.poke(0.U)

            println(dut.io.z.peek().litValue)
            dut.io.z.expect(0.U)
        }
    }

    it should s"Test And Logic for all cases" in {
        test(new And()) { dut =>
            println("a | b | z")
            println("---------")
            for (in1 <- 0 until 2) { 
                for (in2 <- 0 until 2) {

                    dut.io.a.poke(in1.U)
                    dut.io.b.poke(in2.U)
                    dut.clock.step()

                    var z = dut.io.z.peek().litValue
                    println(s"$in1 | $in2 | $z") //fancy print formatting
                }
            }
            println("All tests complete")
        }
    }
    
}

