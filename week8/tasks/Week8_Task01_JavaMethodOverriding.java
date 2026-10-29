
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Week8_Task01_JavaMethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();
        d.sound();
    }
}

