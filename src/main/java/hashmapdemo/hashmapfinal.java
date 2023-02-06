package hashmapdemo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashmapfinal 
{
	HashMap<String,Integer> innermap=new HashMap<String,Integer>();
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		int num,b;
		System.out.print("Enter the number of element=");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
	  {
		System.out.print("Enter Name Of The Items ");
		String a = sc.next();
		b = sc.nextInt();
		innermap.put(a, b);
	  }
	System.out.println("Added Successfully="+innermap);
	}
	public void update()
	{
		int b;
		System.out.println("The Update Function Started ");
		String oldname;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the Old key Name you want to Change");
		oldname=scan1.next();
		System.out.println("Enter the  new key you want to update");
		b = scan1.nextInt();
		innermap.replace(oldname,b);
		System.out.println("The Updated map="+innermap);
		System.out.println("\n");
	} // end of update
	
	public void maxvalue()
	{
		int maxValue=0;
		for (Map.Entry< String,Integer> keyValue : innermap.entrySet())
		{
			if(maxValue < keyValue.getValue())
			{
				maxValue = keyValue.getValue();
			}
		}
		  System.out.println("The Max value is ="+maxValue);
	}    // end of maxvalue function
	
	public void minvalue()
	{
		int minValue=0;
		for (Map.Entry< String,Integer> minvalue : innermap.entrySet())
		{
			if(minValue < minvalue.getValue())
			{
				minValue = minvalue.getValue();
			}
		}
	} // end of minvalue function 
	
	public void total()
	{
		int sum = 0;
		for (int f : innermap.values())
		{
			sum += f;
		}
		System.out.println("The Total of all values is ="+sum);
	}
	public static void main(String args[])
	{
		hashmapfinal hobj=new hashmapfinal();
		Scanner scan1 = new Scanner(System.in);
		int choice = 0;
		System.out.println("\n");
		while(choice != 6) 
		{
	      System.out.println("1. Add ");
	      System.out.println("2. Update ");
	      System.out.println("3. maxvalue ");
	      System.out.println("4. minvalue ");
	      System.out.println("5. total ");
	      System.out.println("6. Exit ");
	      System.out.println("Choose any one : ");
	      choice = scan1.nextInt();
	      System.out.println("You Have Selected "+choice);
	      System.out.print("\n");
	      switch(choice)
	      {
            case 1 :hobj.add();    break;
            case 2 :hobj.update(); break;
            case 3 :hobj.maxvalue();break;
            case 4:hobj.minvalue(); break;
            case 5:hobj.total();    break;
            		
	} // switch close
} //while closing
} // main closing 
}// class closing 






















