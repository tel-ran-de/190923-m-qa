package org.example;

public class AllTypeClass {
    public static void main(String[] args) {
        RegularClass regularClass = new RegularClass();
        RegularClassTwo regularClassTwo = new RegularClassTwo();
        regularClass.one();
        regularClass.two();
        regularClass.three();
        regularClassTwo.one();
//        regularClassTwo.two();
        regularClassTwo.three();
    }
}
