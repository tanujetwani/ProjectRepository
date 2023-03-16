package com.simplilearn.filehandling;
 
import java.io.* ;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		File f= new File("Lab1.txt");
		
		Scanner sc= new Scanner(System.in);
						
		try {
		
		f.createNewFile();
		
		if(f.exists())
		{
			System.out.println("File, Lab1.txt,  is created.");
		}
 		
		else
		{
			System.out.println("File, Lab1.txt,  is not created");
		}
		
		}
		
		catch( Exception e) {
			
			System.out.println("An Exception occurred while creating file");
			e.printStackTrace();                                              //try-catch to handle IOException
		}
		// Writing to File "Lab1.txt"
		
		System.out.println("Writing to file, Lab1.txt ");
		
		
		 try {	
		
		 FileWriter fr = new FileWriter("Lab1.txt", false);
		 
		 System.out.println("Enter the text to write to the file: ");
		 
		 String text= sc.nextLine();
		 
		 fr.write(text);
		 		 	
		 //fr.write("This is a new file, Lab1.txt, and we are writing some content in this file");
		 
		 fr.write("\n");
		 
		 System.out.println("File writing done");
		 
		 fr.close();
		// fr.flush();
		 
		}
		
		catch(Exception e) {
			
			System.out.println("An exception occurred while writing to file.");
			e.printStackTrace();
	   }
		 
			
		
		 
	//Reading from file
		 System.out.println();
		 System.out.println("-------Reading from File Lab1.txt------------------------");
		 
				 
		 try {
			 
		 FileReader fr= new FileReader(f);
		 
		 int i = fr.read();
		 
		 while(i!= -1) {
			 
			 System.out.print((char)i);
			 i=fr.read();
			 
		 }//End of while
		 
		 System.out.println();
		 
	       fr.close();
		 	
	}
		 
		 catch(Exception e) {
		
			 System.out.println("An Exception occurred while reading file ");
			 e.printStackTrace();
}
	
		 
		 
		 //Appending to file
		 
		 System.out.println("--------------Appending to File, Lab1.txt------------------");
		 	
		 System.out.println();
		 System.out.println("Enter text to append to file, Lab1.txt");
		 
		 String append = sc.nextLine();
		try
		{
		 FileWriter fr2= new FileWriter("Lab1.txt", true);    //true will not remove the old content ...will append to file.
				 
		 fr2.write(append);
        
		 System.out.println("File Appending done");
		 
		 fr2.close();
		 
		}
	
	    catch(Exception e)
		{
	    	System.out.println("An exception occurred while appending to file.");
		
            e.printStackTrace();		
		}
	}
	
}
