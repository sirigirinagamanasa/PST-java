import java.util.*;

public class DiagonalDifference {

    static int diagonalDifference(int[][] arr) {

        int n = arr.length;
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            left += arr[i][i];
            right += arr[i][n - 1 - i];
        }

        return Math.abs(left - right);
    }

    public static void main(String[] args) {

        int[][] arr = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        System.out.println(diagonalDifference(arr));
    }
}