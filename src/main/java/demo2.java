import java.text.NumberFormat;
import java.util.Scanner;
public class demo2
{

	public static void main(String[] args) 
	{
		final int month_of_year=12;
		final int percentage=100;
		int Principal;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter the Principal Amount = ");
		 Principal=sc.nextInt();
		if(Principal>=1000 && Principal>=100000)
			break;
		System.out.println("Please Enter Amount between 1000 and 100000");
		}
		System.out.print("Enter the Annual Interest Amount = ");
		float monthinterest=sc.nextFloat();
		monthinterest=monthinterest/month_of_year/percentage;
		System.out.print("Period(Years)=");
		int years=sc.nextInt();
		int numberofpayment=years*month_of_year;
		double mortage=Principal *(monthinterest*Math.pow(1+monthinterest,years)/Math.pow(1+monthinterest,years)-1);
		String mortageFormat=NumberFormat.getCurrencyInstance().format(numberofpayment);
		System.out.println("Mortgage:"+mortageFormat);
		

	}

}
