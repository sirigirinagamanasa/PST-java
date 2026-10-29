
class Parent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class");
    }
}

public class Week7_Task7_JavaInheritance1 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.displayParent();
        obj.displayChild();
    }
}

