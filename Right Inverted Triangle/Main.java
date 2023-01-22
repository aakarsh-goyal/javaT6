
public class Main
{
  public static void main (String[] args)
  {
      int n = 5;
      right_tri(5);
  }
  public static void right_tri(int n){
      for (int i = 0; i < n; i++)
      {
          for (int k = 0; k < i; k++){
              System.out.print(" ");
          }
          for(int j = n-i; j > 0; j--){
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
