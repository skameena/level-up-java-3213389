package com.linkedin.javacodechallenges;
import java.util.Scanner;

public class PasswordComplexityCheck {

  public static boolean isComplexPassword(String password){
    // int passLen = password.length();
    // boolean hasLower = false, hasUpper = false, hasNumber = false;
    // if( passLen > 6){
      
    //    for(int i=0;i< passLen;i++ ){
    //     String charval = password.substring(i,i+1);
    //      if(charval.matches("[0-9]")){
    //       hasNumber = true;
    //      }
    //      else{
    //        if (password.contains(charval.toLowerCase())) {
    //          hasLower = true;
    //        }
    //        if (password.contains(charval.toUpperCase())) {
    //          hasUpper = true;
    //        }

    //      }
        
    //    }
       return password.length()> 6 && password.matches(".*\\d.*") &&
              password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") ;
    // }
    // return false;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the password");
    String passString = scanner.next();
    System.out.println("is Password Complex ?"+ isComplexPassword(passString));
    scanner.close();
  }
  
}
