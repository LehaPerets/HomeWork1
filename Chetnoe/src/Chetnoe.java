/**
 * Created by Leha on 05.06.2016.
 */

import java.util.Scanner;

public class Chetnoe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y % 2 == 0) {
            System.out.println("Chet");
        } else System.out.println("Nechet");

    }
}