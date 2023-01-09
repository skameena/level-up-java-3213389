package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class EvenOrOdd{

  public static boolean checkEvenOrOdd(int value){
    
    return value % 2 == 0;   
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Integer Value");
    int num = scanner.nextInt();
   
      System.out.println("Entered Integer Value is even? "+ checkEvenOrOdd(num) );
    


  }
}