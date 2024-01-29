package BooleanCircuits

import chisel3._
import chisel3.stage._
import circt.stage._

class And extends Module {
	val io = IO(new Bundle{
		val a = Input(UInt(1.W))
		val b = Input(UInt(1.W))

		val z = Output(UInt(1.W))
	})

  	io.z := io.a & io.b
}
    

/**
* An object extending App to generate the Verilog code.
*/
object AndMain extends App {
	ChiselStage.emitSystemVerilog(new And, firtoolOpts = Array("-o=generated/And.sv")) //puts it in a folder called generated under then name And.sv
}


