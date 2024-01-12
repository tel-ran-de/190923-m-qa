package org.example;

public class RegularClass implements IOne, ITwo, IThree{
    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }

    @Override
    public void three() {
        System.out.println("three");
    }
}
