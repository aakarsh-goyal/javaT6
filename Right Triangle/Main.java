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
      int k;
      for (int i = 0; i < n; i++)
      {
          for (k = 0; k < n-i-1; k++){
              System.out.print(" ");
          }
          for(int j = 0; j < n - k; j++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
