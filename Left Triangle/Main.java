/*
author: AG
date created: 22 January 2023
*/

public class Main
{
  public static void main (String[] args)
  {
      int n = 5;
      left_tri(n);
  }
  public static void left_tri(int n){
      for(int i = 1; i <= n; i++){
          for(int j = 0; j < i; j++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
