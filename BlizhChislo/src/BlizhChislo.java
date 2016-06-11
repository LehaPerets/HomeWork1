import java.util.Scanner;

/**
 * Created by Leha on 05.06.2016.
 */
public class BlizhChislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        int a = 10;
        if (Math.abs(n - a) < Math.abs(b - a)) {
            System.out.println("Ближе: " + n);}
            else if (Math.abs(n - a) == Math.abs(b - a)) System.out.println("Одинаковое расстояние");
         else System.out.println("Ближе: " + b);
    }


}
