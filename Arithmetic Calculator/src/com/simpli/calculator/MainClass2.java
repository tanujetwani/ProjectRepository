package com.simpli.calculator;

import java.util.Scanner;

public class MainClass2 {
	
public static void main (String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number1: ");
		float num1= sc.nextFloat();
		System.out.println("Enter number2: ");
		float num2= sc.nextFloat();
		
		Arithcalculator c1 = new Arithcalculator(num1,num2);
		
		System.out.println("Enter the operation to be done (+ , - , * , / ) : ");
		Scanner sc1= new Scanner(System.in);
		String operation= sc1.nextLine();
		
				
		switch(operation) {
		
		case "+" : {
			            c1.sum() ;
		               break;
		}
		
		
		case "-" : {
			                c1.subtract();
			                break;
		}
		
		case "*" : {
			
			              c1.multiply();
			                break;
		}
		
		case "/" : { 
			             c1.divide();
			              break;
		}
		
			
		 default : { System.out.println("Invalid Input.");
		}
		
		}   //End of switch-case 	
		
	
	}   //End of main

}// End of class
