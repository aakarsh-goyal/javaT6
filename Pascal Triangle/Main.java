public class Main
{	public static void main(String[] args) {
	int i,j, rows=6;
	for(i = 0; i < rows; i++) 	{ 
		for(j = 0; j < rows-i; j++)
		{
			System.out.print(" ");
		}
		for(j = 0; j <= i; j++)
		{
			System.out.print(" "+ncr(i, j));
		}
		System.out.println();
 	}
	}
public static int ncr(int n,int r)
 {	return fact(n) / ( fact(n-r) * fact(r) );    }
public static int fact(int num)
 {	int factorial;	
for(factorial = 1; num > 1; num--)
{		
factorial *= num;	}	
return factorial;    } 
}