/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize tax and subtotal
        double subtotal;
        double tax = 0;
        //ask the user the order amount
        System.out.print("What is the order amount? ");
        int order = in.nextInt();
        //make sure to include this in order to get the String input
        in.nextLine();
        //ask the user to input what state they live in
        System.out.print("What is the state? ");
        String state = in.nextLine();
        //now check if the user lives in Wisconsin by checking if they inputted "WI"
        if(state.equals("WI") || state.equals("wi") || state.equals("Wi") || state.equals("wI")) {
            //calculate subtotal
            subtotal = 1.00 * order;
            //tell the user their subtotal
            System.out.printf("The subtotal is $%.2f.%n", subtotal);
            tax = subtotal * 0.055;
            //tell the user their tax amount
            System.out.printf("The tax is $%.2f.%n", tax);
        }
        //now tell the user their total
        double total = tax + order;
        System.out.printf("The total is $%.2f.", total);
    }
}
