/**
 * Created by Leha on 06.06.2016.
 */
public class Peremenye {
    public static void main(String[] args) {

        int age, height, weight, birthday, a, mask;
        age = 28;
        height = 186;
        weight = 86;
        birthday = 93;
        a = (age) | (height << 8) | (weight << 16) | (birthday << 24);

        mask = 0b11111111;

        System.out.printf("Age: %d, height: %d, weight: %d, birthday: %d ",
                mask & a,
                mask & a >>> 8,
                mask & a >>> 16,
                mask & a >>> 24);

    }

}
