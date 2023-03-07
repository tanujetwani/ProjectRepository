package com.simplilearn.virtualkeyrepository;

import java.io.File;
import java.util.Scanner;

public class AddFile {

	public void addFile(){
		
		 System.out.print("Enter the file to be added:");
		 Scanner sc= new Scanner(System.in);
		 String file= sc.nextLine();
		 
			 
		 File f= new File(file);  //Creating file object 
		 try {
		 f.createNewFile();
		}
		
		catch(Exception e) {
			System.out.println("Exception occured while creating the file");
			e.printStackTrace();
			
		}
		 if(f.exists()) {
		 System.out.println("File "+f + " has been added in the current directory at path " + f.getAbsolutePath());
		 System.out.println();
		 }
		 
		 else {
			 System.out.println("unable to add the file "+ f);
		 }
	}
		
	
	/*public static void main(String[] args) {
            
		AddFile af= new AddFile();
		af.addFile();
	}
*/

	
	
}