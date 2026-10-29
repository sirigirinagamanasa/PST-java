import java.util.ArrayList;
import java.util.Scanner;

public class week10_task4_StudentMarksArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter mark: ");
            marks.add(sc.nextInt());
        }

        System.out.println("Student Marks: " + marks);

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.size();

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}