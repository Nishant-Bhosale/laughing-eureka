package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    var scanner = new Scanner(System.in);
        System.out.println("Enter Some Input: ");
        var userInput = "";
        while(!userInput.equalsIgnoreCase("quit")){
            userInput = scanner.nextLine();
            String response = "Your Input was " + userInput;
            System.out.println(response);
        }

        scanner.close();
    }
}
