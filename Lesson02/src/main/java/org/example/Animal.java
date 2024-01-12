package org.example;

public abstract class Animal {
    boolean isAge;

    public Animal() {
        this.isAge = false;
    }

    public abstract boolean getIsAge();

    public abstract int returnValue();

    public void sound(){
        System.out.println("Animal's sound");
    }
}
