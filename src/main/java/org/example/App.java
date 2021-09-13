/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int x, y;
        System.out.print("What is the first number? ");
        x = in.nextInt();
        System.out.print("What is the second number? ");
        y = in.nextInt();

        System.out.println(x + " + " + y + " = " + ( x + y ));
        System.out.println(x + " - " + y + " = " + ( x - y ));
        System.out.println(x + " * " + y + " = " + ( x * y ));
        System.out.println(x + " / " + y + " = " + ( x / y ));

        in.close();
    }
}