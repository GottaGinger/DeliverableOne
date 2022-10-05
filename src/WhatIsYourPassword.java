import java.util.Scanner;

public class WhatIsYourPassword {
    
public static final int PASSWORD_MAX_LENGTH = 12;
public static final int PASSWORD_MIN_LENGTH = 7;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter password");
        System.out.print(
                "1. A password must have at least seven characters.\n" +
                "2. A password must have less than twelve characters.\n" +
                "3. A password must be at least one lowercase letter.\n" +
                "4. A password must be At least one uppercase letter.\n" +
                "5. A password must have an explination point.\n");
        String s = input.nextLine();

        if (isCorrectLength(s) && s.contains("!") && containsLowerCase(s) && containsUpperCase(s)) {
            System.out.println("Password valid and accepted");
        } else {
            System.out.println("Error");
        }

    }

    public static boolean isCorrectLength(String password) {
    	if (password.length() <= PASSWORD_MAX_LENGTH && password.length() >= PASSWORD_MIN_LENGTH) return true;
    	return false;

    }
    
    public static boolean containsLowerCase (String password) {
    	  for(int i=0; i<password.length(); i++){
              if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
            	  return true;
              }
    	  }
    	  return false;
    }
   
    public static boolean containsUpperCase (String password) {
  	  for(int i=0; i<password.length(); i++){
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
          	  return true;
        	}
  	  }
  	  return false;
    }
}
  