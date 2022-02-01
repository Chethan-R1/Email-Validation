package com.email;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static final String PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@"+
		"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
public static void main(String args[]){ 
	ArrayList<String> email = new ArrayList<String>();	
	email.add("chethan53@yahoo.com"); 
	email.add("chethan85@gmail.com"); 
	email.add("chethan80@.com");
	email.add("chethan45@gmail.com.a");

	Pattern pattern = Pattern.compile(PATTERN);
	for (String value : email){
	  Matcher matcher = pattern.matcher(value);
	  if(matcher.matches()){
		  System.out.println("Email "+ value +" is valid");
	  }else{
		  System.out.println("Email "+ value +" is invalid");
	  }		  
	}
}
}
