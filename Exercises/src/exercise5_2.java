package Exercises.src;

import java.util.Scanner;
//Khoda Vakili Khodam Neveshtam!

public class exercise5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        float x = input.nextFloat();
        if (x < 1 && x > 0) {
            System.out.println("Small Positive!");
        } else if (x > 1000000) {
            System.out.println("Large Positive!");
        } else if (x > 1 && x < 1000000){
            System.out.println("Positive!");
        }

        if (x < 0 && x > -1) {
            System.out.println("Small Negative!");
        } else if (x < -1000000) {
            System.out.println("Large Negative!");
        } else if (x < -1 && x > -1000000){
            System.out.println("Negative!");
        }

        if (x == 0) {
            System.out.println("Zero!");
        }
    }
}
// 0 ta 100 In Code Ro Khodam Neveshtam


