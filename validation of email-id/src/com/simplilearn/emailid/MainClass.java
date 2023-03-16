package com.simplilearn.emailid;

import java.util.Scanner;

public class MainClass {
	
	  public static int searchemail(String[] listemailids, String inputid) {
		   
		  int length= listemailids.length;
		  int found=0;
		  
		  for(int i=0 ; i<length ; i++) {
			   
			  if(listemailids[i].equalsIgnoreCase(inputid))
				  
			  { found=1;
			    break;
			  }
			  
			  }  //end of for
		  
		  
		  return found;
		  
		  
		  
	  }
	
	
	  
	  public static void main(String[] args) {
	
   String[] emailids= {"sumit@gmail.com","tanu@hotmail.com","harry@rediff.com","amit123@gmail.com","riya.verma@hotmail.com"};
	
	int found=0;
	
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
     
	String inputid=" ";
	
	System.out.println("Enter an email-id to search : ");
	
	inputid= sc.nextLine();
	
	found= searchemail(emailids, inputid);
	
	if(found==1) {
		System.out.println("Emailid "+ inputid + " has been found");
	}
	
	else {
		System.out.println("Emailid "+inputid +  "  has not been found");
	}
		
		
	}
	
	
	
	
	
}
