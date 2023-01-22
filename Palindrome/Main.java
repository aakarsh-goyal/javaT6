/*
author: AG
date created: 22 January 2023
*/

public class Main
{
  public static void main (String[] args)
  {
      int number = 121;
      palindrome(number);
  }
  public static void palindrome(int number){
      int num1 = number;
      int num2 = 0;
      while(num1 != 0){
          num2 = num2*10 + num1 % 10;
          num1 /= 10;
      }
      if (num2 == number){
          System.out.println("It is a palindrome");
      }
      else{
          System.out.println("It is not a palindrome");
      }
  }
}
