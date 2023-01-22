/*
author: AG
date created: 22 January 2023
*/

public class Main
{
  public static void main (String[] args)
  {
      int a = 1, b = 2, c = 3;
      if (a > b){
          if (a > c){
              System.out.println(a);
          }
          else{
              System.out.println(c);
          }
      }
      else{
          if (b > c){
              System.out.println(b);
          }
          else{
              System.out.println(c);
          }
      }
  }
}
