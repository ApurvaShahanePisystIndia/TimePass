import java.util.Scanner;
public class demo {
	public static void main(String args[])
	{
		/*int a=10;
		//int a=0;
		//int a=-8
		
		if(a>0)
		{
			System.out.println("Number is Positive");
			
		}
		else if(a==0)
		{
			
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Number is Negative");
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name= ");
		String name=sc.nextLine();
		
		System.out.println("Your age is "+name);
		
		
			int temp=1;
			if(temp>30)
			{
				System.out.println("It is a hot day");
				System.out.println("Keep Drinking Water");
			}
			else if(temp>20 && temp<=30)
			{
				System.out.println("Its Normal Day");
			}
			else
			{
				System.out.println("Its a cold day");
			}
			*/
		
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the Number= ");
			int num=sc.nextInt();
			if(num%5==0)
			{
				System.out.println("Its a  Fizz");
				
			}
			else if(num%3==0)
			{
				System.out.println("Its a  Buzz");
				
			}
			else if(num%5==0 && num%3==0)
			{
				System.out.println("Its a  FizzBuzz");
				
			}	
			else
			{
				System.out.println("There is no change="+num);
				
			}
		
		
		
		
		
	}

}
