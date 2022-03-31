package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String a1,a2;
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your first text: ");
        a1 = s.nextLine();
        System.out.println("Please Enter your second text: ");
        a2= s.nextLine();

        a1=a1.concat(a2);

        System.out.println("The texts are:"+ a1);
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.equalsIgnoreCase(a2));
    }
}