package Exercises.src;

import java.util.Scanner;

public class exercise5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of your asset: ");
        int asset = input.nextInt();
        float tax = 0;

        if (asset < 0){
            System.out.println("Asset negative!");
        } else if (asset > 0 && asset < 50000){
            tax = (float)asset / 100;
        } else if (asset > 50000 && asset < 75000){
            tax = ((float)asset / 100)*2;
        } else if (asset > 75000 && asset < 100000){
            tax = ((float)asset / 100)*3;
        } else if (asset > 100000 && asset < 250000){
            tax = ((float)asset / 100)*4;
        } else if (asset > 250000 && asset < 500000){
            tax = ((float)asset / 100)*5;
        } else if (asset > 500000){
            tax = ((float)asset / 100)*6;
        }

        System.out.println("You have to pay this much tax: " + tax + "$");
    }
}

