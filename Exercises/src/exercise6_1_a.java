import java.util.Scanner;

public class exercise6_1_a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The Sum of Even Numbers Between 2 & 100 is " + sum);
    }
}
