package com.junaeid.core.typecasting;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 123;
        long b = a;
        double d = b;

        System.out.println("int value: " + a);
        System.out.println("long value: " + b);
        System.out.println("double value: " + d);

        double dbl = 135.14;
        long lng = (long) dbl;
        int integer = (int) lng;
        byte byt = (byte) integer;

        System.out.println("----------------------------");

        System.out.println("double value: " + dbl);
        System.out.println("long value: " + lng);
        System.out.println("integer value: " + integer);
        System.out.println("byte value: " + byt);

    }
}
