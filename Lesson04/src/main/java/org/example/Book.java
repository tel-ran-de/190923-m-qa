package org.example;

public class Book implements Cloneable{
   private String name;
   private int year;
   private int[] rating = {10, 8, 7};

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Book " + this.name + " year " + this.year);
    }

    public int[] getRating() {
        return this.rating;
    }

    @Override
    public Book clone() {
        try {
            Book clone = (Book) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
