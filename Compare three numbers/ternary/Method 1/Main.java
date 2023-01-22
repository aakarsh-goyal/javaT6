/*
author: AG
date created: 22 January 2023
*/

public class Main
{
  public static void main (String[] args)
  {
    int a = 1, b = 2, c = 3;
    int max = (a > b && a > c) ? a : (b > c && b > a ? b:c);
    System.out.println(max);
  }
}
