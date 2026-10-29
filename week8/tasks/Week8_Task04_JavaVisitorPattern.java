
interface Shape {
    void accept(Visitor visitor);
}

interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

class Circle implements Shape {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Rectangle implements Shape {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class ShapeVisitor implements Visitor {
    public void visit(Circle circle) {
        System.out.println("Visiting Circle");
    }

    public void visit(Rectangle rectangle) {
        System.out.println("Visiting Rectangle");
    }
}

public class Week8_Task04_JavaVisitorPattern {
    public static void main(String[] args) {
        Visitor visitor = new ShapeVisitor();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.accept(visitor);
        rectangle.accept(visitor);
    }
}

