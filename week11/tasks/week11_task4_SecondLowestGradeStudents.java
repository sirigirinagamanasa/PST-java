import java.util.*;

public class week11_task4_SecondLowestGradeStudents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] grades = new double[n];

        TreeSet<Double> uniqueGrades = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter grade: ");
            grades[i] = sc.nextDouble();
            sc.nextLine();

            uniqueGrades.add(grades[i]);
        }

        double secondLowest = uniqueGrades
                .higher(uniqueGrades.first());

        System.out.println("Second Lowest Grade: " + secondLowest);

        System.out.println("Students:");

        TreeSet<String> result = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            if (grades[i] == secondLowest) {
                result.add(names[i]);
            }
        }

        for (String name : result) {
            System.out.println(name);
        }

        sc.close();
    }
}