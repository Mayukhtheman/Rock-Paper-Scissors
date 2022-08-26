package com.company;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter 0 for rock");
        System.out.println("Enter 1 for paper");
        System.out.println("Enter 2 for scissor");
        Scanner sc = new Scanner(System.in);
        double d = Math.random()*3;
        int p = (int)Math.floor(d);
//        System.out.println(p);
        System.out.println("Enter your number");
        int u = sc.nextInt();
        switch (u) {
            case 0 -> System.out.println("You selected rock");
            case 1 -> System.out.println("You selected paper");
            case 2 -> System.out.println("You selected scissor");
            default -> System.out.println();
        }
        switch (p) {
            case 0 -> System.out.println("Computer selected rock");
            case 1 -> System.out.println("Computer selected paper");
            case 2 -> System.out.println("Computer selected scissor");
            default -> System.out.println();
        }
        if(u==p)
            System.out.println("Its a tie!");
        else if(u==0 && p==1) // rock && paper
            System.out.println("You lose!");
        else if(u==1 && p==0) // paper && rock
            System.out.println("You win!");
        else if(u==2 && p==0) // scissor && rock
            System.out.println("You lose!");
        else if(u==0 && p==2) // rock && scissor
            System.out.println("You win!");
        else if(u==1 && p==2) // paper && scissor
            System.out.println("You lose!");
        else if(u==2 && p==1) // scissor && paper
            System.out.println("You win!");
        else
            System.out.println("Dude enter a valid number");
    }
}
