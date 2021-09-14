/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex06;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        String curAge, retAge;
        int yearsLeft, curYear, retYear;
        Date curDate = new Date();
        curYear = curDate.getYear() + 1900;
        System.out.print("What is your current age? ");
        curAge = newScanner.nextLine();
        System.out.print("At what age would you like to retire? ");
        retAge = newScanner.nextLine();
        yearsLeft = Integer.parseInt(retAge) - Integer.parseInt(curAge);
        retYear = curYear + yearsLeft;
        System.out.printf("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.", yearsLeft, curYear, retYear);
    }
}
