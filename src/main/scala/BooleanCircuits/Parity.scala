package BooleanCircuits

import chisel3._

//Here is the set up for a 5 bit parity module
//Use the Xor Module to find the parity of the input (whether the number of 1's is even or odd)
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
