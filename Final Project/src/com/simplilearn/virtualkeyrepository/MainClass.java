package com.simplilearn.virtualkeyrepository;
import java.util.Scanner;
import java.io.File;
import java.lang.*;

public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user_choice; 
		//int user_choice_2=0;
		
		//Code to display the welcome screen
		System.out.println("                      Application Name : Virtual Key for repositories");
		System.out.println("                      -------------------------------------------------");
		System.out.println("                            Developer Details: Tanu Jetwani");
		System.out.println("                      -------------------------------------------------");
		System.out.println();
		System.out.println("Following options are available in main menu : ");
		System.out.println();
		System.out.println("1.Returns the current file names in ascending order.");
		System.out.println("2.Takes to menu for adding, deleting and searching files");
		System.out.println("3.Exits the application");
		System.out.println();
		
		//Accepting the input from user
		while (true) {
			try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an option from the main menu list : ");
		user_choice= sc.nextInt();
			
			
					//Taking to the appropriate choice
		switch(user_choice) {
		
		case 1:{ 
			    System.out.println("---------------------------------------------------------------");
			    System.out.println("Case1: Returns the current file names from current directory  in ascending order");
			    
               
               System.out.println();
               String dir= System.getProperty("user.dir");  
			 	System.out.println("current directory:" + dir);
			 	
			 	File directory= new File(dir);  //Getting files from root directory
			 	String[] arr= directory.list();
			 	
			 	if (arr==null) {
			 		 System.out.println("Directory is empty");
			 	 }
			 	 
			 	 else {
			 		   //String arr[] = {18, 2, 31, 5, 16, 77, 53, 32, 4};
			 		   MergeSortasc ob = new MergeSortasc();
			 		   System.out.println();
			 		   System.out.println("Files in the random order:");
			 		   ob.printArray(arr);

			 		  // MergeSortasc ob = new MergeSortasc();
			 		   ob.sort(arr, 0, arr.length-1);

			 		   System.out.println("\nFiles Sorted in ascending order");
			 		   ob.printArray(arr);
			 			
			 		} //End of else
			     break;
		}
	    case 2 :{
	    	      System.out.println("Following options are available:");
	    	      System.out.println("a. Add a file to the current directory.");
	    	      System.out.println("b. Delete a user specified file from the current directory list.");
	    	      System.out.println("c. Search a user specicified file from the main directory.");
	    	      System.out.println("d. Navigate back to the main menu.");
	    	 
	    	  while (true) {
	    		 // int user_choice_2=0;  
	    		  String user_choice_2=""; 
	    		  
	    		  try { 
	    	     Scanner sc1 = new Scanner(System.in);
	    	     
	    	      System.out.print("Enter an option from the menu above:");
	    	     // int user_choice_2;
	    	  /*  user_choice_2=sc1.nextInt();*/
	    	      user_choice_2=sc1.next();
	    	      
	    	      switch(user_choice_2) {
	    	      
	               case "a": {
	    	    	        System.out.println();
	    	    	        System.out.println("Case a: Adding a file to the  current directory");
	    	    	        System.out.println("-----------------------------------------------");
	    	    	        AddFile af= new AddFile();
	    	    			af.addFile();
	    	    			break;
	    	              }
	    	      
	      	      case "b" : {
	    	    	         System.out.println();
	    	    	         System.out.println("case b: Delete a user specified file from the current directory");
	    	    	         System.out.println("----------------------------------------------------------------");
	    	    	         SearchingFile s=new SearchingFile();
	    	    	         int found=0;
	    	    	         String file;
	    	     			 System.out.print("Enter the filename to delete: ");
	    	     			 Scanner sc2 = new Scanner(System.in);
	    	     			 file=sc2.nextLine();
	    	     			 
	    	     			String dir= System.getProperty("user.dir");
	    	    			
	    	    			System.out.println("current directory: "+ dir);
	    	    			
	    	    			File directory= new File(dir);
	    	    			
	    	    			String[] flist= directory.list();
	    	    				    	    			                               	    			
	    	    			 if (flist==null) {
	    	    				 System.out.println("Directory is empty");
	    	    			 }
	    	    			 
	    	    			 else {
	    	    				 
	    	    			//	 for(String x:flist)
	    	    				//System.out.println(x);
	    	    			
	    	    			found=s.searchFile(flist,file);
	    	    			 }
	    	    			 
	    	    			if(found==1) {
	    	    		    	 System.out.println("File " + file  + " has been found");
	    	    		    	 
	    	    		    	 DeleteFile df = new DeleteFile();
	    	    		    	 df.deleteFile(file);
	    	    			}
	    	    			 else {
	    	    		    	 System.out.println("File " +file+ " not found.");
	    	    		    	 }
	    	    	         break;
	    	               }    //End of Case2
	    	     
	                  case "c" : { System.out.println();
	    	    	         System.out.println("case c:Searching a user specified file from the current directory");
	    	    	         System.out.println("------------------------------------------------------------------");
	    	    	         SearchingFile s1=new SearchingFile();
	    	        		 int found=0;
	    	        		
	    	        		 Scanner sc3 = new Scanner(System.in);
	    	        		     
	    	        		    
	    	        		String file;
	    	        		System.out.print("Enter the filename to search: ");
	    	        		file=sc3.nextLine();
	    	        		
	    	        		String dir= System.getProperty("user.dir");
	    	    			
	    	    			System.out.println("current directory: "+ dir);
	    	    			
	    	    			File directory= new File(dir);
	    	    			
	    	    			String[] flist= directory.list();
	    	    			
                           
	    	    			 if (flist==null) {
	    	    				 System.out.println("Directory is empty");
	    	    			 }
	    	    			 
	    	    			 else {
	    	    				 found=s1.searchFile(flist,file);
	    	    			 }
	    	    		
	    	    			 
	    	     			if(found==1) {
	    	     		    	 System.out.println("File " + file + " has been found");
	    	     			}
	    	     			 else {
	    	    		    	 System.out.println("File " +file+ " not found");
	    	    		    	 }
	    	    			
	    	    	         break;
	    	                }
	    	      
	               case "d" : {
	    	    	         System.out.println("Navigating back to the main menu");
	    	    	         break;
	    	               }
	    	       
	    	      default : {
	    	    	         System.out.println("Invalid option");
	    	    	        // System.out.println("user_choice_2: " +user_choice_2);
	    	    	        break;
	    	    	         }
	    	      }           //End of nested switch
	    	      
	    	     } //End of try block
	    	     
	    	     catch(Exception e) {
	    	    	 
	    	    	System.out.println("Invaild Input.");
	    	    	//System.out.println("user_choice_2: " + user_choice_2);
	    	     }
	    	   
	              if(user_choice_2.equals("d")) { break;}   // breaks from while loop when choice is 4 and goes back to the main menu. 
	    	
	    	  }  //End of while loop     
	    	      break;
	             }
	     
	    case 3 :{
	    	       System.exit(0);
	    	       
	            }
	    
	   default :{
		          System.out.println("Invalid option");
		          break;
	             }
	        
		}               //End of switch
		
			}  //End of try block
			
		catch(Exception e) {
			System.out.println("Invalid Input");
		}

		
				
		} //End of while
		
		} //End of main
		
		

	}  //End of class


