package org.example;

import java.lang.ref.WeakReference;

public class BookMain {
    public static void main(String[] args) {
        Book pinokkio = new Book("Pinokkio", 1950);
        pinokkio.print();
//        Book miracle = pinokkio;
        Book miracle = pinokkio.clone();
        miracle.setName("Miracle");
//        Book miracle1 = new Book("Miracle", 1960);
        miracle.print();
        System.out.println("Pinokkio - " + pinokkio.hashCode());
        System.out.println("Miracle - " + miracle.hashCode());
//        System.out.println(pinokkio.hashCode() == miracle.hashCode());
        pinokkio.print();
        System.out.println(pinokkio.getRating().hashCode());
        System.out.println(miracle.getRating().hashCode());

//        WeakReference weakReference = new WeakReference<>();
    }
}
