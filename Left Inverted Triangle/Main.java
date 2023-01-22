/*
author: AG
date created: 22 January 2023
*/

public class Main
{
  public static void main (String[] args)
  {
      int n = 5;
      right_tri(5);
  }
  public static void right_tri(int n){
      for (int i = n; i > 0; i--)
      {
          for(int j = 0; j < i; j++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
