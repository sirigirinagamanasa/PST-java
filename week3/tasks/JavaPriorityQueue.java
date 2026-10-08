import java.util.PriorityQueue;

class Student implements Comparable<Student> {

    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student other) {

        if (this.cgpa != other.cgpa) {
            return Double.compare(other.cgpa, this.cgpa);
        }

        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cgpa;
    }
}

public class JavaPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(1, "Alice", 9.1));
        pq.add(new Student(2, "Bob", 8.7));
        pq.add(new Student(3, "Charlie", 9.5));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}