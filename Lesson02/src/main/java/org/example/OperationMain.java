package org.example;

public class OperationMain {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 10;
        double d = 10.5;
        double e = 12.8;

        System.out.println(Operation.sum(a, b));
        System.out.println(Operation.sum(a, b, c));
        System.out.println(Operation.sum(d, e));
    }



}
