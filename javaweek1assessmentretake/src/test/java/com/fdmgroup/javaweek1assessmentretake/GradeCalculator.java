package com.fdmgroup.javaweek1assessmentretake;

public class GradeCalculator {
	
	 private String result;

	public String getClassification(double mark) {
		
		  if (mark>90){
              result = "distinction";
              
       }else if (mark>80){
              result =  "merit";
              
       }else if (mark>=75){
              result = "pass";
       
       }else if(mark<75){
              result = "fail";
              
       }return result;
	}

}
