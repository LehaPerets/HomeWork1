import java.util.Scanner;

/**
 * Created by Leha on 05.06.2016.
 */
public class Deck {

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);
        int A= scannerA.nextInt();
        int B= scannerB.nextInt();
        int C= scannerC.nextInt();
        int D = B*B - 4 *A*C;
        if (A == 0){
            System.out.println("Коэф. при первои слогаемом не может быть равен 0");
        }
        else if (D>0 ){
            System.out.println("x1= " + ((-B + Math.sqrt(D))/2*A) + "x2= " + ((-B - Math.sqrt(D))/2*A));
        }
        else {
            if (D == 0) {
                System.out.println("x1=x2= " + -B / 2 * A);
            }
            else System.out.println("Нет корней");
        }
    }
}
