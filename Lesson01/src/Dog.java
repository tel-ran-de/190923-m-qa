public class Dog {
    private String name;
    private int age;

//    default constuctor
//    public Dog() {}

    // constructor with params
    public Dog(String name, int age) {
        this.name = name;
        if (age >= 0 && age <= 20) {
            this.age = age;
        } else {
            System.out.println("Не корректный возраст.");
        }
    }

//    name getter
    public String getName() {
        return this.name;
    }

//    age getter
    public int getAge() {
        return this.age;
    }

    public void sound() {
        System.out.println("Гав-гав-гав");
    }

    public void incAge() {
        this.age++;
    }
}
