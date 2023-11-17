package com.coderscampus;

import java.util.Random; 

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Guess the number between 1 and 100: ");
        
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        if (userGuess > 100 || userGuess < 1) {
            System.out.println("Your guess is not between 1 and 100, please try again.");
        }

        for (int i = 1; i <= 5; i++) {
            if (userGuess == randomNumber) {
                System.out.println("You win!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Please pick a higher number");
            } else {
                System.out.println("Please pick a lower number");
            }
            
            if (i == 5) {
                System.out.println("You lose. The number was " + randomNumber);
            } else {
                System.out.println("Guess again: ");
                userGuess = scanner.nextInt();
            }
        }
        
        scanner.close();
    }
}