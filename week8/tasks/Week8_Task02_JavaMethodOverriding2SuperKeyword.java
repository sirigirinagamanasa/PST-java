
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display();
        System.out.println("Child class method");
    }
}

public class Week8_Task02_JavaMethodOverriding2SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

