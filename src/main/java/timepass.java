import java.util.*;
public class timepass
{
	HashMap<String,HashMap<String,Integer>> grocery=new HashMap<>();
	HashMap<String,Integer> innermap=new HashMap<String,Integer>();
public void add()
{
	int Quantity,Price,num;
	String itemname;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number of Item =");
	num=sc.nextInt();
	for(int i=0;i<num;i++)
    {
		HashMap<String,Integer> innermap=new HashMap<String,Integer>();
		System.out.print("Enter the Name of Item =");
		itemname=sc.next();
		System.out.print("Enter the Number of Price of Item =");
		Price=sc.nextInt();
		System.out.print("Enter the Number of Quantity of Item =");
		Quantity=sc.nextInt();
		innermap. put("Price",Price);
		innermap.put("Quantity",Quantity);
		grocery.put(itemname,innermap);
    }
		System.out.println(grocery);
} // end of add method

public void update()
{
	/*String oldname,newname;
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter the Old Name you want to update");
	oldname=scan1.next();
	System.out.println("Enter the  New Name you want to update");
	Integer a = scan1.nextInt();
	newname=scan1.next();
	//grocery.put(newname,innermap);*/
	
	Scanner sc=new Scanner(System.in);
	int b;
	System.out.println("The Update Function Started ");
	String oldname;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Old key Name you want to Change");
	oldname=sc.next();
	System.out.println("Enter the  new Quanity you want to update");
	Quantity=sc.nextInt();
	
	
	
	
	
	innermap.replace("oldname",Quantity);
	System.out.println("The Updated map="+innermap);
	
	
	
}
public void delete()
{
	String itemnam;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name of Item you want to delete =");
	itemnam=sc.next();
	grocery.remove(itemnam); 
	for (Map.Entry<String,HashMap<String,Integer>> m : grocery.entrySet())
	{
        System.out.println(m.getKey()+" "+ m.getValue());
     }
}

/*public void max()
{	int maxValue=0;
	ArrayList<Integer> mhighest=new ArrayList<Integer>();
	mhighest.add(1);
	mhighest.add(10);
	mhighest.add(5);
	mhighest.add(55);
	mhighest.add(100);
	System.out.println("THe elemnet in the list are ="+mhighest);
	for(int i = 0; i < mhighest.size(); i++)
	{
		if(maxValue < mhighest.get(i))
		{
			maxValue = mhighest.get(i);
		}
		}*/

public void high()
{
	
	int ac;
       
        System.out.println(grocery.values());
        System.out.println("All Keys "+grocery.keySet());
        
        ArrayList<HashMap<String,Integer>> PriceAndQuantiy =new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        grocery.values();
        for(int i=0;i<grocery.size();i++)
        {
        	
        	System.out.println(grocery.values(i));
       	 }
        	
        
        
        
        for(int i=0;i<=PriceAndQuantiy.size();i++)
        {
        	ArrayList<Integer> valuesList =new ArrayList<>();
            //valuesList = (ArrayList<Integer>)PriceAndQuantiy.get(i).values();
        	System.out.println(PriceAndQuantiy.get(i).values());  
        		//System.out.println(PriceAndQuantiy.get(i).values());
        	    //al.add(ac);
        	
        }
}
public static void main(String args[])
{
	timepass t=new timepass();
	Scanner scan1 = new Scanner(System.in);
	 int choice = 0;

	    System.out.println("\n");
 while(choice != 6) 
 {
	      System.out.println("1. Add ");
	      System.out.println("2. Update ");
	      System.out.println("3. Delete ");
	      System.out.println("4. max ");
	      System.out.println("5. high ");
	      System.out.println("6. Exit ");
	      System.out.println("Choose any one : ");
	      choice = scan1.nextInt();
	      System.out.println("You Have Selected "+choice);
	      System.out.print("\n");
	      switch(choice)
	      {
            case 1 :t.add();
         			break;
            case 2 :t.update();
 						break;
            case 3 :t.delete();
 						break;
            //case 4:t.max();
				//break;
            case 5:t.high();
			break;
				
            case 6:System.out.println("Program Ended!!!!!!!!!!!!!"); 
            default:
                System.out.println("Looking as if wrong input given ???");
                	break;
                	
	
}// end of switch
} // end of while 
}// closing of main class 
} // closing of class 
