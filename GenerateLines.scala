

def addLine(i: Int) = "\t\t\t\tSystem.out.println(\"hey\");\n" * i


val file = s"""
    |package com.codacy.utils;
    |
    |public class Math {
    |
    |    private int magicNumber;
    |
    |    public Math(int magicNumber) {
    |        this.magicNumber = magicNumber;
    |    }
    |
    |    /**
    |     * Adds 2 numbers, unless there is a magic number on the second argument
    |     */
    |    public int magicAdd(int x, int y) {
    |        if (y == magicNumber) {
    |            ${addLine(4500)}
    |            return y - x;
    |        } else {
    |            return x + y;
    |        }
    |    }
    |
    |
    |}
    |""".stripMargin

os.write(os.pwd/"Math.java", file)
