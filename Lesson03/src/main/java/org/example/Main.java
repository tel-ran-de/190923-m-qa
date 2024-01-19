package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("The area of the circle = " + circle.getArea());
        System.out.println("The length of the circle = " + circle.getPerimeter());
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("The area of the rectangle = " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle = " + rectangle.getPerimeter());
    }
}