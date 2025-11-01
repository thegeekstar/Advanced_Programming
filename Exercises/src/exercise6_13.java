import java.util.Scanner;

public class exercise6_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String binary = "\n";

        while (number > 0) {
            int remainder = number % 2;
            binary = binary + remainder;
            number = number / 2;
        }

        for (int i = 0; i < binary.length(); i++) {
            System.out.println(binary.charAt(i));
        }
    }
}
