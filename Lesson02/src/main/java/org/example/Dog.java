package org.example;

public abstract class Dog extends Animal{

    @Override
    public boolean getIsAge() {
        return false;
    }

    @Override
    public void sound() {
        System.out.println("Woh-woh-woh");
    }

    public void walk() {
        System.out.println("The dog is walking");
    }
}
