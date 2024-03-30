
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            arr[i][0] = 1;
            if (i > 0) {
                arr[i][i] = 1;
            }
        }

        for (int i = 2; i < num; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(Arrays.toString(Arrays.copyOf(arr[i], i + 1)));
        }
    }
}




