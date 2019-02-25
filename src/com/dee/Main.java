package com.dee;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//      int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue =  2_147_483_647;

//        byte has a width of 8
//        byte max = 127 min = -128
        byte myByteValue = 2;

//        short has a width of 16
//        short max = 32767 min = -32768
//        twice the space of a byte but half the space as an int
        short myShortValue = -32768;



//        long has a width of 64 - double the width of int
//        +- 2^63
        long myLongValue = 100L;
//        System.out.println(Math.pow(2,63));

    }
}
