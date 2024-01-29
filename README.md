# Chisel Projects Repository

**Author:** Eric Biernacki(ebiernacki@wustl.edu) under the advisement of Professor Ron Cytron(cytron@wustl.edu)

This repository contains all the projects I have created in [Chisel](https://www.chisel-lang.org/) for the Digital Design Course at WUSTL.

Below are links to setup guides and instructions to run the projects. All projects were created for the Basys3 Delevopment Board with and 100MHz internal clock. 

## External Setup Guides and Running the Projects

- [Setup Guide 1](https://docs.google.com/document/d/13pX-4cFuGuj_i7VRhmksyf7YL6-qXiF8-O9J9m_yVfI/edit?usp=sharing)
- [Setup Guide 2](https://docs.google.com/document/d/1-muYy8XSGP4EbMIbLuwTEscIj1UC-u8HU5glcBpIFUo/edit?usp=sharing)
- [Setup Guide 3](https://docs.google.com/document/d/1O-y1rnS1V_Bjyc2GwYd9C6Gq1IsqVcxacy2lTD6tHME/edit?usp=sharing)


**Getting the Examples:!!!!!! make this repo right for push/pull access!!!!!**
```bash
$ git clone https://github.com/ebiernacki/chisel-projects.git
```

- **Needed Tools (Thorough walkthrough located in the Setup Guides):**
    - Recent version of Java (JDK 8 or later)
    - Scala build tool sbt
    - Scala Metals VSCode Extension
    - Vivado or other toolchain (I used Vivado 2020.2)


- **Running the Examples: **
    - To generate Verilog files for the And Module:
        ```bash
        sbt
        runMain BooleanCircuits.AndMain
        ```





