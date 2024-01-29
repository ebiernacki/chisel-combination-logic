# Chisel Combinational Logic Repository
This repo contains some quick combinational logic scala files and their test cases. You'll also find the bones for an Xor and Parity Module to complete and the test cases to run with it

Below are links to setup guides and instructions to run the projects. 

## External Setup Guides and Running the Projects

- [Java, Sbt and Chisel Guide](https://docs.google.com/document/d/13pX-4cFuGuj_i7VRhmksyf7YL6-qXiF8-O9J9m_yVfI/edit?usp=sharing)
- [GTKWave Guide](https://docs.google.com/document/d/1-muYy8XSGP4EbMIbLuwTEscIj1UC-u8HU5glcBpIFUo/edit?usp=sharing)
- [Vivado Guide](https://docs.google.com/document/d/1O-y1rnS1V_Bjyc2GwYd9C6Gq1IsqVcxacy2lTD6tHME/edit?usp=sharing)


**Getting the Examples:**
```bash
$ https://github.com/ebiernacki/chisel-combination-logic.git 
```

- **Needed Tools (Thorough walkthrough located in the Setup Guides):**
    - Recent version of Java (JDK 8 or later)
    - Scala build tool sbt
    - Scala Metals VSCode Extension
    - Vivado or other toolchain (I used Vivado 2020.2)


- **Testing the Examples: **
    - To generate Verilog files for the And Module:
        ```bash
        sbt
        testOnly BooleanCircuits.AndTest
        ```





