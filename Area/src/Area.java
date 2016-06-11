import java.util.Scanner;

/**
 * Created by Leha on 05.06.2016.
 */
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        int S = (a*b)/2;
        double c = Math.sqrt(a*a + b*b);
        double P = a+b+c;
        System.out.println("Прощадь: " + S);
        System.out.println("Периметр: " + P);


    }
}
