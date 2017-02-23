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
                                                                          //read a multiple lines store in a repository and then display
           String line=null;
           try {
                  //br.readline means read the line  -------->1 read the line 
                  while((line = br.readLine()) != null)     //2 line = put into line variable
                  {                                         //3 != is it not equal to null? 
                	  System.out.println(line);             //if yes  - stop loop
                  }                                         //if not -  keep going  
           } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
           }
           try {
			fr.close(); // to close the file reader
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           try {
			br.close(); // to close the buffer reader
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
