import java.util.Scanner;

public class MenuDriven
{	
	int a,b,c;

	public void add()
	{   Scanner sc = new Scanner(System.in);
		System.out.print("Enter The first Number=");
		a=sc.nextInt();
		System.out.print("Enter The second Number=");
		b=sc.nextInt();
		c=a+b;
		System.out.print("The Addition is ="+c);
		
	}
	public void sub()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The first Number=");
	a=sc.nextInt();
	System.out.print("Enter The second Number=");
	b=sc.nextInt();
	c=a-b;
	System.out.print("The substration is ="+c);
	}
	public void div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The first Number=");
		a=sc.nextInt();
		System.out.print("Enter The second Number=");
		b=sc.nextInt();
		c=a/b;
		System.out.print("The Division is ="+c);
		}
	public void multi()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The first Number=");
		a=sc.nextInt();
		System.out.print("Enter The second Number=");
		b=sc.nextInt();
		c=a*b;
		System.out.print("The Multiplication is ="+c);
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int choice = 0;
		    MenuDriven a=new MenuDriven();
	    System.out.println("\n");
	    while(choice != 5) 
	    {
		      System.out.println("\n");
			  System.out.println("\n");
			  System.out.println("\n");
		      System.out.println("1. Add ");
	          System.out.println("2. sub ");
	          System.out.println("3. multi ");
	          System.out.println("4. Div ");
	          System.out.println("5. Exit ");
	          System.out.println("Choose any one : ");
	          choice = sc.nextInt();
	          System.out.println("You Have Selected "+choice);
		      System.out.println("\n");
		      switch(choice)
		      {
		      case 1 :a.add();
		      		  break;
		      case 2: a.sub();
		      			break;
		      case 3 :a.multi();
      		  break;
		      case 4: a.div();
      			break;
		          
		      	
		      	
		      }
	    }
	}
	
}