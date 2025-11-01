import java.util.Scanner;

public class exercise6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }

            System.out.print(" ");

            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }


    }
}
