/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String principal, rate, years, compounded;
        double princ, rat, year, comp;
        double base, exp, total;

        System.out.print("What is the principal? ");
        principal=sc.nextLine();
        System.out.print("What is the rate? ");
        rate=sc.nextLine();
        System.out.print("What is the number of years? ");
        years=sc.nextLine();
        System.out.print("What is the number of times the interest is compounded per year? ");
        compounded=sc.nextLine();


        princ=Double.parseDouble(principal);
        rat=Double.parseDouble(rate);
        year=Double.parseDouble(years);
        comp=Double.parseDouble(compounded);

        base=1+(rat/(comp*100));
        exp=comp*year;
        total=princ*Math.pow(base,exp);

        System.out.printf("%.2f invested at %.2f%% for %.1f years compounded %.1f times per year is $%.2f.", princ, rat, year, comp, total);

    }
}