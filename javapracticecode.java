package ATB6X_LEARNING_SELENIUM.Selenium;

import java.util.Scanner;

public class javapracticecode {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the upper limit for the Fibonacci series: ");
	        int upperLimit = scanner.nextInt();
	        
	        // Close the scanner
	        scanner.close();
	        
	        printFibonacciSeries(upperLimit);
	    }

	    public static void printFibonacciSeries(int upperLimit) {
	        int a = 0;
	        int b = 1;
	        
	        System.out.println("Fibonacci series up to " + upperLimit + ":");
	        while (a <= upperLimit) {
	            System.out.print(a + " ");
	            
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        
	        System.out.println(); 
	    }
	}