package BooleanCircuits

import chisel3._

//5 bit parity module
class Parity extends Module{
    val io = IO(new Bundle{
        val in1 = Input(UInt(1.W))
        val in2 = Input(UInt(1.W))
        val in3 = Input(UInt(1.W))
        val in4 = Input(UInt(1.W))
        val in5 = Input(UInt(1.W))

        val out = Output(UInt(1.W))
    })
    
    
}
