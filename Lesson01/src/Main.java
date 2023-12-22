import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cat tom = new Cat();
//        System.out.println("Cat name: " + tom.getName());
//        System.out.println("Cat age: " + tom.getAge());
//        tom.sound();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите возраст: ");
//        int age = sc.nextInt();
//        tom.setAge(age);

//        tom.age = sc.nextInt();

//        tom.setName("Tom");
//        tom.setAge(5);
//
//        Cat barsik = new Cat();
//        barsik.setName("Barsik");
//        barsik.setAge(8);
//
//        System.out.println("Cat name: " + tom.getName());
//        System.out.println("Cat age: " + tom.getAge());
//        System.out.println("Cat name: " + barsik.getName());
//        System.out.println("Cat age: " + barsik.getAge());
//
//        tom.setAge(10);
//        tom.setName("Jerry");
//
//        System.out.println("Cat name: " + tom.getName());
//        System.out.println("Cat age: " + tom.getAge());
//        tom.sound();
//        barsik.sound();

        Dog spike = new Dog("Spike", 8);
        System.out.println("Dog name: " + spike.getName());
        System.out.println("Dog age: " + spike.getAge());
        spike.sound();
        spike.incAge();
        System.out.println("Dog name: " + spike.getName());
        System.out.println("Dog age: " + spike.getAge());
    }
}