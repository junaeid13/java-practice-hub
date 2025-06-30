package com.junaeid.strings;

public class StringPractice {
    public static void main(String[] args) {

        //String Literal
        String stringLiteral1 = "Hello";
        String stringLiteral2 = "World";

        System.out.println(stringLiteral1);
        System.out.println(stringLiteral2);

        //String Object
        String stringObject1 = new String("Hello");
        String stringObject2 = new String("World");

        System.out.println(stringObject1);
        System.out.println(stringObject2);

        //Concatenate string with + sign
        System.out.println(stringLiteral1 + "" + stringLiteral2);
        System.out.println(stringObject1 + "" + stringObject2);

        String stringNum1 = "3";
        String stringNum2 = "4";
        System.out.println(stringNum1 + stringNum2); //34


        int num1 = 6;
        int num2 = 5;
        System.out.println(num1 + num2); // 9
        System.out.println(stringNum1 + stringNum2); //34

        System.out.println(4 + 5 + "6");//4 + 5 = 9 + "6" = "96"
        System.out.println(4 + "5" + 6); //4 + "5" = "45" + 6 = "456"
        System.out.println("4" + 5 + 6); //"4" + 5 = "45" + 6 = "456"
    }

}
