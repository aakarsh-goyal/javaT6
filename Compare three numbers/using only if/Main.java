
public class Main
{
  public static void main (String[] args)
  {
      int a = 1, b = 2, c = 3;
      if (a > b){
          if (a > c){
              System.out.println(a);
          }
          if (c > a){
              System.out.println(c);
          }
      }
      if (b > a){
          if (b > c){
              System.out.println(b);
          }
          if (b < c){
              System.out.println(c);
          }
      }
  }
}
