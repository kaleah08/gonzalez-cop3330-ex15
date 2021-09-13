package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

       Scanner input = new Scanner(System.in);
       System.out.print("What is the password? ");
       String userInput = input.next();

       if(userInput .equals("abc$123")){

           System.out.println("Welcome!");
       }
       else{

           System.out.println("I don't know you.");

       }




    }
}
