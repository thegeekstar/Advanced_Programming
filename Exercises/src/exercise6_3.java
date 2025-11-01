import java.util.Scanner;

public class exercise6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Line: ");
        String line = input.nextLine();



        uppercasePrinter(line);
        secLetterPrinter(line);
        vowelReplace(line);
        vowelCounter(line);
        vowelPositionFinder(line);


    }

    public static void uppercasePrinter(String line) {
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch); //Baraye Mesal "Zanjan National Univercity" Ro in chap mikone: "ZNU"
            }
        }
        System.out.println();
    }

    public static void secLetterPrinter(String line){
        int letterIndex = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (Character.isLetter(ch)) {
                if (letterIndex % 2 == 0) {
                    System.out.print(ch);
                }
                letterIndex++;
            }
        }
        System.out.println();
    }

    public static void vowelReplace(String line){
        String newLine = "";

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                newLine += "_";
            } else {
                newLine += ch;
            }
        }

        System.out.println(newLine);
    }

    public static void vowelCounter(String line){

        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void vowelPositionFinder(String line){
        int letterIndex = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print(letterIndex + " ");
            }
            letterIndex++;
        }
        System.out.println();
    }
}
