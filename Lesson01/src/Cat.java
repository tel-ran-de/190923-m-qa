public class Cat {
    private String name;
    private int age;

//    public Cat() {}

// name setter
    public void setName(String name) {
        this.name = name;
    }

//    name getter
    public String getName() {
        return this.name;
    }

//    age setter
    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else  {
            System.out.println("Вы ввели некорректные данные");
        }
    }

//    age getter
    public int getAge() {
        return this.age;
    }

//    method sound
    public void sound() {
        System.out.println("Мур-мур-мур");
    }
}
