package BooleanCircuits

import chisel3._
import chisel3.stage._
import circt.stage._


class Or extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))

        val z = Output(UInt(1.W))
    })

    io.z := io.a | io.b 

    //xor logic
	///io.z := (io.a | io.b) & !(io.a & io.b)

}

object OrMain extends App {
	ChiselStage.emitSystemVerilog(new Or, firtoolOpts = Array("-o=generated/Or.sv"))
}
