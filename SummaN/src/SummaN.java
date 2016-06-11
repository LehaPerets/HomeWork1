import java.util.Scanner;

/**
 * Created by Leha on 02.06.2016.
 */
public class SummaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; n != 0; n /= 10) {
            sum = sum + (n % 10);
        }
        System.out.println("summa: " + sum);

    }
}
