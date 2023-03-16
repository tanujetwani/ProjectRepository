package com.simpli.calculator;

public class Arithcalculator {
	
	       float num1, num2;
	       
	       public Arithcalculator(float a, float b ) {
	    	   
	    	   this.num1=a;
	    	   this.num2=b;
	       }
	
        public  void sum() {
		
		      float sum = num1+num2;
		      System.out.println(" The sum is " + sum);
	     }
	
	    public void subtract() {
		
		      float subtract= num1-num2;
		      System.out.println("The result is  "+ subtract);
	     }
	
	    public void multiply() {
		
		       float product = num1*num2;
		       System.out.println("Product is "+ product);
	     }
	
	    public void divide() {
		
		       float divide = (float)(num1/num2) ;
		       System.out.println("Result is "+ divide);
	      }


}
