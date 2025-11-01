import java.util.Scanner;

public class exercise6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = input.nextLine();
        for( int i = word.length() - 1; i >= 0; i-- ) {
            char ch = word.charAt(i);
            System.out.print(ch);
        }
    }
}
