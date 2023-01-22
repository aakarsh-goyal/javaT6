/*
author: AG
date created: 22 January 2023
*/

public class Main
{
  public static void main (String[] args)
  {
     int n = 20;
     print_series(20);
  }
  public static void print_series(int n){
      for (int i = 1; i <= n; i++){
          System.out.print(i*i*i - i*i + ((i == n)?"":", "));
      }
  }
}
