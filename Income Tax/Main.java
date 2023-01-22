
public class Main
{
  public static void main (String[] args)
  {
    double salary = 249999;
    double tax = calculate_tax (salary);
    double surcharge = calculate_surcharge (tax);
    double total_tax = tax + surcharge;
    System.out.println ("Tax: " + total_tax);
  }
public static double calculate_tax (double salary)
{
  double tax = 0;
  if (salary >= 1000000)
    {
      tax = tax + (salary - 999999) * 0.3;
      salary = salary - 999999;
    }
  if (salary >= 500000)
    {
      tax = tax + (salary - 499999) * 0.2;
      salary = salary - 499999;
    }
  if (salary >= 250000)
    {
      tax = tax + (salary - 249999) * 0.05;
      salary = salary - 249999;
    }
  return tax;
}

public static double calculate_surcharge (double tax)
{
  double surcharge = 0;
  surcharge = tax * 0.04;
  return surcharge;
}
}
