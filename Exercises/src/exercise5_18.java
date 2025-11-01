import java.util.Arrays;
import java.util.Scanner;

public class exercise5_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 Names: " );
        String[] words = new String[3];
        words[0] = input.next();
        words[1] = input.next();
        words[2] = input.next();
        Arrays.sort(words);
        System.out.println("Sorted by First Name: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
