import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
	{
		int num,n;
		long factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		if(num<0)
	        System.out.println("\n!!! Factorial of a negative number doesn't exist !!!");
	    else if(num==0)
	        System.out.println("\nFactorial of "+num+": "+factorial);
	    else
	    {
	    	n=num;
		    while(n>0)
			{
	            factorial*=n;
				n--;
			}
		    System.out.println("\nFactorial of "+num+": "+factorial);
		}
	}
}
