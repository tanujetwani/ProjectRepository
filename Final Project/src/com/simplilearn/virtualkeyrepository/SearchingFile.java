package com.simplilearn.virtualkeyrepository;

import java.io.File;

import java.util.Scanner;

public class SearchingFile {
		public int searchFile(String[] flist, String file) {	
	
	
     int found=0;
     
     int length= flist.length;
     //int length= flist.size();
     //System.out.println("length:" + length);
     
     for(int i=0; i< flist.length ; i++)
     {     
    	 if(file.equals(flist[i])) {
    		 found=1;
    	 }
    	 
     }
     
     return found;
	}	
	
   	
}	 

     

