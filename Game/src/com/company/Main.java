package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int g;
        int c;

        String lose;
        String win;

        String [] arr1 = {"Better luck next time.", "Try again.", "No way.", "Guess you're just unlucky.", "Today's not your day.", "I wouldn't buy a lottery ticket if I were you."};
        String [] arr2 = {"Good job!", "You're great!", "Now you're ready to buy a lottery ticket!", "Amazing! You got it!", "Bravo!!!", "We got a genius over here!"};

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Game! Instructions are simple. Guess a number between one and ten. " +
        "Guess correctly and you win!");


        System.out.println("OK. Now take a guess!");

        do {
            g = in.nextInt();
            c = rand.nextInt(10) + 1;
            System.out.println(c);

            if ( g == c) {
                int rWin = rand.nextInt(arr2.length);
                System.out.println(arr2[rWin]);
                System.out.println("You are a winner!!!");
            }
            else {
                int rLose = rand.nextInt(arr1.length);
                System.out.println(arr1[rLose]);
            } } while ( g != c);



        }



    }

