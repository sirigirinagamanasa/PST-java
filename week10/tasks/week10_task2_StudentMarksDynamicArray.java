import java.util.Scanner;

public class week10_task2_StudentMarksDynamicArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[2];
        int size = 0;

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter mark: ");
            int mark = sc.nextInt();

            if (size == marks.length) {

                int[] newMarks = new int[marks.length * 2];

                for (int j = 0; j < size; j++) {
                    newMarks[j] = marks[j];
                }

                marks = newMarks;
            }

            marks[size] = mark;
            size++;
        }

        System.out.println("Student Marks:");

        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}