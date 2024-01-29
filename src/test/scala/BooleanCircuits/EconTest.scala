package BooleanCircuits


import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class EconTest extends AnyFlatSpec with ChiselScalatestTester {
    behavior of "Econ Module"

    it should s"Test Econ Logic for 1 case" in {
        test(new Econ()) { dut =>
            dut.io.input1.poke(1.U)
            dut.io.input2.poke(1.U)
            dut.io.input3.poke(0.U)

            println(dut.io.output.peek().litValue)
            dut.io.output.expect(1.U)
        }
    }

    it should s"Test Econ Logic for all cases" in {
        //This test also creates a waveform to look at
        test(new Econ()).withAnnotations(Seq(WriteVcdAnnotation)) { dut =>
            println("in1 | in2 | in3 | output")
            println("------------------------")
            for (in1 <- 0 until 2) { 
                for (in2 <- 0 until 2) {
                    for (in3 <- 0 until 2) {
                        dut.io.input1.poke(in1.U)
                        dut.io.input2.poke(in2.U)
                        dut.io.input3.poke(in3.U)
                        dut.clock.step()

                        var z = dut.io.output.peek().litValue
                        println(s" $in1  |  $in2  |  $in3  |  $z") //fancy print formatting
                    }
                }
            }
            println("All tests complete")
        }
    }
    
}

