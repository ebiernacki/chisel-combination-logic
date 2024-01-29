package BooleanCircuits

import chisel3._

//Implement the code for a 1 bit Xor Module 
class Xor extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))

        val z = Output(UInt(1.W))
    })

    
}
