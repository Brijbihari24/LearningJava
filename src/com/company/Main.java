package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

     // variables
     String name = "Ajit";

     String brother = "Sujit";

     String best = brother;

        System.out.println(best);

    // Data types - 1. primitive ( for normal values) 2.Non-primitives ( for complex values/reference)

//        1. primitive types

//        byte - 1 [-128 to 127]
//        short -2
//        int - 4 1,2,3,4
//        long - 8
//        float - 4 3.14
//        double - 8
//        char - 2 a,b,c
//        boolean - 1 true/false

//        Exaxmple's -

        int phone = 1234567890;
        byte age = 12;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char city = 'a';
        boolean isAdult = true;

//        Non-primitive types -
//        Strings -
//        1. Concatinate

        String name1 = "Ajit";

        String name2 = "chotu";

        String name3 = name1 + " and " + name2;

        System.out.println(name3);

//        2.CharAt

        String name4 = "Sujit";
        System.out.println(name4.charAt(0));
        System.out.println(name4.charAt(1));

//        3.Length

        String name5 = "Brijbihari Awadhiya";
        System.out.println(name5.length());

//        4.replace

        String name6 = "ajit";
        String name7 = name6.replace("a","su");
        System.out.println(name7);

//        5.substrings

        String name8 = "ajit and chotu";
        System.out.println(name8.substring(0,4));

//        Arrays

        int[] marks = new int[3];
        marks[0] = 70;
        marks[1] = 40;
        marks[2] = 90;

        System.out.println(marks[0]);

//        length
        System.out.println(marks.length);

//        sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

//        If we know the elements of array already then
        int[] peopleAge = {16, 28, 21, 35};

//        2D-Array
        int[][] studentsMarks = {{23, 35, 19},{25,42,14}};
        System.out.println(studentsMarks[1][1]);

//        casting , 2-types 1.Implecit casting 2.Explecit casting
//        1.Implecit casting

        double price = 100.00;
        double finalPrice  = price + 18;
        System.out.println(finalPrice);

//        2.Explecit casting

        int p = 100;
        int fP = p + (int)19.99;
        System.out.println(fP);

//        constant

        int Age = 30;
        Age = 31;
        Age = 32;

        final float PI = 3.14F;
//        PI = 1.1F; when we declare constant we use "final" keyword and constants are written in upperlater

//        Operators 4-types
//        1.Arithmatic operators
//        2.Assignment operators
//        3.Logical operators
//        4.Comparison operators
//


    }
}
