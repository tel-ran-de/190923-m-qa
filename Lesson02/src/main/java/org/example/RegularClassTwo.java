package org.example;

public class RegularClassTwo implements IOne, IThree{
    @Override
    public void one() {
        System.out.println("ten");
    }

    @Override
    public void three() {
        System.out.println("eleven");
    }
}
