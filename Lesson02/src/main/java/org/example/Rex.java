package org.example;

public class Rex extends Dog {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean getIsAge() {
        return true;
    }

    @Override
    public int returnValue() {
        return 2;
    }

    @Override
    public void sound() {
        System.out.println("Rex says woh");
    }

    @Override
    public void walk(){
        System.out.println("Rex is walking");
    }

    public void swim() {
        System.out.println("Rex is swimming");
    }

    public void init(int age) {
        setAge(age);
        System.out.println("Rex is " + getAge() + " years old");
        sound();
        walk();
        swim();
    }
}
