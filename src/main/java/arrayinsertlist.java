import java.util.*;  
public class arrayinsertlist
{  
	ArrayList<String> alpha=new ArrayList<String>();
	ArrayList<Integer> price=new ArrayList<Integer>();
	ArrayList<Integer> quantity=new ArrayList<Integer>();
public void add()
{		
		int num;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the Number of Element you want to add =");
	    num=scan1.nextInt();
	    for(int i=0;i<num;i++)
         {
	    	System.out.print("Enter Name Of The Items ");
        	 String itemname;
        	 itemname=scan1.next();
        	 alpha.add(itemname);
        	 
        	 System.out.print("Enter The Rate Of The Items ");
        	 int itemprice;
        	 itemprice=scan1.nextInt();
        	 price.add(itemprice);
        	         	 
        	 System.out.print("Enter The Quantity Of The Items ");
        	 int qty;
        	 qty=scan1.nextInt();
        	 quantity.add(qty);
       	  }
	    System.out.print(alpha);
	    System.out.print(price);
	    System.out.print(quantity);
} // end of add function 

public void delete() // Delete by name 
{	
	String name;
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter the Name you want to Delete =");
    name=scan1.next();
    alpha.removeIf( itemname -> itemname.equals(name));
    System.out.println(alpha);
    
}
public void update()
{
	String itemname,newName;
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter the Name you want to update =");
	itemname=scan1.next();
    System.out.println("Enter the New Name  =");
    newName=scan1.next();
    alpha.set( alpha.indexOf(itemname),newName);
    System.out.println(alpha);
   
    
    
}
public void view()
{
	System.out.print(alpha);
	System.out.print(price);
    System.out.print(quantity);
}
public static void main(String args[])
 {  
	 Scanner sc=new Scanner(System.in);
	 arrayinsertlist a=new arrayinsertlist(); 
	 int choice = 0;

	    System.out.println("\n");
    while(choice != 8) 
    {
      System.out.println("\n");
		  System.out.println("\n");
		  System.out.println("\n");
	      System.out.println("1. Add ");
          System.out.println("2. Update ");
          System.out.println("3. Delete ");
          System.out.println("4.  View ");
          System.out.println("5. High Price ");
          System.out.println("6. Lowest  Price ");
          System.out.println("7. Bill ");
          System.out.println("8. Exit ");
          System.out.println("Choose any one : ");
          choice = sc.nextInt();
          System.out.println("You Have Selected "+choice);
	      System.out.println("\n");
	      switch(choice)
        {
               case 1 :a.add();
            		break;
            case 2 :a.update();
               
                break;
            case 3 :a.delete();
			break;
            case 4:a.view();
            break;
            
        }
    }
	 //creating a new class 
	 a.add();  
	 a.update();
	 a.delete();// creating obj of the class 
 }                                           //end of main 
 }                                          //end of class 
	 
	 
	 
	 





















	 
	 
	 
  /*ArrayList<String> list=new ArrayList<String>();//Creating array list 
//Adding object in array list  
      list.add("Mango");//Adding object in array list    
          
      System.out.println(list);
      
      //update array list
      list.set(1, "Dates");
      System.out.println(list);
       // end of for 
      
      //delete array list item
      list.remove("Banana");
      System.out.println(list);
      */
      
