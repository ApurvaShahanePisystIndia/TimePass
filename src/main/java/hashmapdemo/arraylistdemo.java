package hashmapdemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylistdemo 
{

	ArrayList<ArrayList<String>> Grocery=new ArrayList<ArrayList<String>>();
	ArrayList<String> Priceqty ;
	public void add()
	{
		
		String productname;    
		String price,quantity;
		int Number_Of_Product;
		Scanner scan1=new Scanner(System.in);
		System.out.print("Enter the Number of Product =");
		Number_Of_Product=scan1.nextInt();
	    for(int i=0;i<Number_Of_Product;i++)
	     {
	    	 Priceqty=new ArrayList<String>(); 
	    	 scan1 = new Scanner(System.in);
	    	 System.out.print("Enter Name Of The Product= ");
	    	 productname=scan1.nextLine();
	    	 System.out.print("Enter the Price = ");
	    	 price=scan1.nextLine();
			 System.out.print("Enter the Quantity = ");
			 quantity=scan1.nextLine();
			 Priceqty.add(productname);
			 Priceqty.add(price);
			 Priceqty.add(quantity);
			 Grocery.add(Priceqty);
	     }
	    System.out.println(".................................................");
	    
} // end of add
	public void view()
	{
		System.out.println("....................The view function started....................... ");
	    
	    Iterator itr=Grocery.iterator();//getting the Iterator  
	    while(itr.hasNext())
	    {  
	     System.out.println(itr.next());
	    }
	    System.out.println(".................................................");
}// end  of view
	
	
	 public void update()
		{
			System.out.println("...................The update function started.....................");
			String innervalue,outervalue,updatequantity;
			Scanner scan1=new Scanner(System.in);
			
			System.out.print("Enter Inner Index you want to Change");
			innervalue=scan1.nextLine();
			
			System.out.print("Enter Inner Outer Index you want to Change");
			outervalue=scan1.nextLine();
			
			
			System.out.print("Enter the new Quantity");
			updatequantity=scan1.nextLine();
			
			
			Grocery.get(Integer.parseInt(innervalue)).set(Integer.parseInt(outervalue),updatequantity);	
			System.out.println("The Updated map="+Priceqty);
			System.out.println(".................................................");
} // end of update
	public static void main(String args[])
	{
		arraylistdemo hashobj =new arraylistdemo();
		Scanner scan1 = new Scanner(System.in);
		 int choice = 0;

		    System.out.println("\n");
	 while(choice != 5) 
	 {
		      System.out.println("1. Add ");
		      System.out.println("2. view ");
		      System.out.println("3. Update ");
		      System.out.println("4. remove ");
		      System.out.println("Choose any one : ");
		      choice = scan1.nextInt();
		      System.out.println("You Have Selected "+choice);
		      System.out.print("\n");
		      switch(choice)
		      {
	            case 1 :hashobj.add();
	         			break;
	            case 2 :hashobj.view();
	 						break;
	            case 3 :hashobj.update();
					break;0 
		      }
	 }
		
}// end of main 
} //end of class


