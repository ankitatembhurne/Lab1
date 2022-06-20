package com.ankita.service;

import com.ankita.model.Employee;
import java.util.Random;

public class CredentialService {
    public char[] generatedPassword() {
    	String capitalLetters  =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    	String number = "0123456789";
    	String specialCharacters = "!@#$%^&*()";
    	
    	String values = capitalLetters +  smallLetters + number + specialCharacters;
    	
    	Random random = new Random();
    	char[] password = new char[8];
    	for (int i=0; i<8; i++)  {
    		
    		password[i] = values.charAt(random.nextInt(values.length()));
    		
    	}
    	return password;
    }
    	
   public String generatedEmailAddress(String frisrName,String lastName, String  department) 
   {
		 return frisrName + lastName + "@" + department + ".abc.com" ;
		  }


public void showCredentials(Employee employee, String generatedEmail, char[] generatedPassword) {
	System.out.println("Dear" + employee.getFirsrName() + "your  generated credentials are as follows");
	System.out.println("Email---" + generatedEmail);
	System.out.println("Password--" + "");
	System.out.println(generatedPassword); 
}
	
}
	
