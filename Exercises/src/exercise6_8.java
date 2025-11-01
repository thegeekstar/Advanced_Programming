import java.util.Scanner;

public class exercise6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = input.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }

    }
}
