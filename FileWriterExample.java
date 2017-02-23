package com.fdmgroup.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
    public void writeToFile()
    {
           
           FileWriter fw = null;
           try {
                  fw = new FileWriter("H:/Jackesfile.txt",true);       //If true file will append the line as many times as run, If FALSE/Default will overwrite
           } catch (IOException e) {                                      //or create the file if it does not exist            

                  e.printStackTrace();
           }
           
           BufferedWriter bw = new BufferedWriter(fw);
           
           String line = "Some text is the way";
           try{
           bw.write(line,0, line.length());
           bw.newLine();
           
           } catch(IOException e){
                  e.printStackTrace();
           }
           
           try
           {
                  
                  bw.close();
                  fw.close();
           } catch (IOException e){
                  e.printStackTrace();
           }
    
    
    }
    
           
    

    public static void main(String[] args) {

           FileWriterExample fwe = new FileWriterExample();
           
           fwe.writeToFile();
           
           
           
    }



}
