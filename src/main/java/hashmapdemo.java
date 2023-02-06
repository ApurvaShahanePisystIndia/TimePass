import java.util.*;
public class hashmapdemo
{
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	String name;
	int price;    
	int quantity;
	
	 
	public hashmapdemo(String name, int price, int quantity)
	{
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void add()
	{
	int num;
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter the Number of Element you want to add =");
    num=scan1.nextInt();
    for(int i=0;i<num;i++)
     {
    	System.out.print("Enter Name Of The Items ");
    	Integer a = scan1.nextInt();
        String b = scan1.next();
        hm.put(a, b);
     }
    for (Map.Entry<Integer, String> m : hm.entrySet()) {
        System.out.println(m.getKey() + " " + m.getValue());
        
        
    }
    }// end of add method
	public void update()
	{
		String oldname,newname;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the Old Name you want to update");
		oldname=scan1.next();
		System.out.println("Enter the  New Name you want to update");
		Integer a = scan1.nextInt();
		newname=scan1.next();
        hm.put(a, newname);
		for (Map.Entry<Integer, String> m : hm.entrySet())
	{
        System.out.println(m.getKey() + " " + m.getValue());
    }
	}
	public void delete()
	{	
		Scanner scan1 = new Scanner(System.in);
	    System.out.println("Enter the Old Key you want to Delete");
	    Integer key = scan1.nextInt();
		hm.remove(key); 
		for (Map.Entry<Integer, String> m : hm.entrySet())
		{
	        System.out.println(m.getKey()+" "+ m.getValue());
	     }
	} // end of delete 
	public void highest()
	
	{
	
		int maxValue=0;
		for (Map.Entry< String,Integer> keyValue : h.entrySet())
		{
			if(maxValue < keyValue.getValue())
			{
				maxValue = keyValue.getValue();
			}
		}
	}
			
public static void main(String args[])
{
	
	 Map<Integer,hashmapdemo> map=new HashMap<Integer,hashmapdemo>();
	    //Creating Books    
	 hashmapdemo b1=new hashmapdemo("a",5,2);    
	 hashmapdemo b2=new hashmapdemo("Oil",6,2); 
	 map.put(1,b1);
	 map.put(2, b2);
	 
	 for(Map.Entry<Integer, hashmapdemo> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        hashmapdemo b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.name+" "+b.price+" "+b.quantity);   
	    }    
	    
	   
	
}
}
