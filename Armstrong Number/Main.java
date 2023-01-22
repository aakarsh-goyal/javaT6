
public class Main
{
  public static void main (String[] args)
  {
      int number = 121;
      armstrong(number);
  }
  public static void armstrong(int number){
      int num1 = number;
      int num2 = 0;
      while(num1 != 0){
          num2 = num2 + (num1 % 10)*(num1 % 10)*(num1 % 10);
          num1 /= 10;
      }
      if (num2 == number){
          System.out.println("It is an armstrong number");
      }
      else{
          System.out.println("It is not an armstrong number");
      }
  }
}
