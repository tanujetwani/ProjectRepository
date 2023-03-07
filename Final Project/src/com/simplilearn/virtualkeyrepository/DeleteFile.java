package com.simplilearn.virtualkeyrepository;

import java.io.File;

public class DeleteFile {
	
	
	public void deleteFile(String file) {
		
		 try {
		    	File f= new File(file);    //Converting String file to File object
		    	if(f.delete())
		    	{System.out.println("File " + file + " deleted");}
		    	else {
		    		System.out.println(" Deletion Failed");
		    	}
		    }
		    
		    catch (Exception e) {
		    	System.out.println("Exception occured while deleting.");
		    }
		    
		
		
	}

}
