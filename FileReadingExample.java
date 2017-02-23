package com.fdmgroup.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
	
	public void readTheFile()
    {
           
           FileReader fr=null;
           try {
                  fr = new FileReader("H:/jackesfile.txt");                     //Reads files character by character
           } catch (FileNotFoundException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
           }                                                                                        
           BufferedReader br = new BufferedReader(fr);                   //Puts the characters into a book - much faster than FileReader
           
           String line=null;
           try {
                  
                  while((line = br.readLine()) != null)
                  {
                	  System.out.println(line);
                  }  
           } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
           }
           
           System.out.println(line);
           
           
           
    }
    
    
    
    public static void main(String[] args) {

           FileReadingExample fre = new FileReadingExample();
           fre.readTheFile();
           
           
           
           
    }


}
