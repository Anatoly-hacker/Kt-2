import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n > 0 && (n & (n - 1)) == 0){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
