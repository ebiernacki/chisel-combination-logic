package BooleanCircuits

import chisel3._
import chisel3.stage._
import circt.stage._

class Econ extends Module {
    val io = IO(new Bundle{
        val input1 = Input(UInt(1.W))
        val input2 = Input(UInt(1.W))
        val input3 = Input(UInt(1.W))

        val output = Output(UInt(1.W))
    })
    
    val andModule = Module(new And)

    andModule.io.a := io.input1
    andModule.io.b := io.input2

    val orModule = Module(new Or)
    orModule.io.a := andModule.io.z
    orModule.io.b := io.input3


    io.output := orModule.io.z
}

object EconMain extends App {
	ChiselStage.emitSystemVerilog(new Econ, firtoolOpts = Array("-o=generated/Econ.sv"))
}

