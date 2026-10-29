
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing report");
    }
}

public class Week8_Task06_JavaInterface {
    public static void main(String[] args) {
        Printable p1 = new Document();
        Printable p2 = new Report();

        p1.print();
        p2.print();
    }
}

