import java.util.Scanner;

public class exercise6_1_e {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int number = input.nextInt();
        while (number != 0) {
            int digit = 0;
            digit = number % 10;
            if  (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("The sum of Odd Digits of the Number is " + sum);
    }
}
