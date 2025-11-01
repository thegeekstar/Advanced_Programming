import java.util.ArrayList;
import java.util.Scanner;

public class exercise6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers: ");
        int number = input.nextInt();
        numbers.add(number);

        findMinMax(numbers);
        countEvenOdd(numbers);
        superSum(numbers);
        duplicatePrinter(numbers);

    }

    public static void findMinMax(ArrayList<Integer> list) {
        if  (list.size() == 0) {
            System.out.println("No Numbers Found");
            return;
        }
        int min = list.get(0);
        int max = list.get(0);
        for (int n : list) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }

    public static void countEvenOdd(ArrayList<Integer> list) {
        int evenCount = 0;
        int oddCount = 0;
        for (int n : list) {
            if (n % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even Numbers: " + evenCount + " Odd Numbers: " + oddCount);
    }

    public static void superSum(ArrayList<Integer> list) {
        int total = 0;
        System.out.print("Cumulative Sum: ");
        for (int n : list) {
            total += n;
            System.out.print(total + " ");
        }
        System.out.println();
    }

    public static void duplicatePrinter(ArrayList<Integer> list) {
        if  (list.size() == 0) return;

        System.out.print("Duplicate Numbers: ");
        int prev = list.get(0);
        boolean printed = false;

        for (int i = 1; i < list.size(); i++) {
            int curr = list.get(i);
            if (curr == prev && !printed) {
                System.out.print(curr + " ");
                printed = true;
            } else if (curr != prev) {
                printed = false;
            }
            prev = curr;
        }
        System.out.println();
    }
}
