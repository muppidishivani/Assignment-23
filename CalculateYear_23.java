package com.web.java;

import java.util.Scanner;

public class CalculateYear_23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	      
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

       
        int currentYear = java.time.Year.now().getValue();
        int yob = currentYear - age;
        int yt= yob+ 100;

       
        
        System.out.println("You will turn 100 years old in the year " + yt+ ".");

        scanner.close();
    }

}

