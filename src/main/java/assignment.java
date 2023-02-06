//import java.util.*;
//import java.util.Scanner;
//public class assignment
//{
//	ArrayList<String> grocery=new ArrayList<String>();
//	ArrayList<String> name=new ArrayList<String>();
//	ArrayList<String> price=new ArrayList<String>();
//	ArrayList<Integer> quantity=new ArrayList<>();
//	String itemname;
//	String qty;
//	//int num;
//		public void add()
//		{		
//				int num;
//				Scanner scan1 = new Scanner(System.in);
//				Scanner scan2 = new Scanner(System.in);
//				Scanner scan3 = new Scanner(System.in);
//				Scanner scan4 = new Scanner(System.in);
//			    System.out.println("Enter the Number of Element you want to add =");
//			    num=scan1.nextInt();
//			    for(int i=0;i<num;i++)
//                 {
//                	 //String itemname;
//                	 itemname=scan1.next();
//                	 grocery.add(itemname);
//                	 
//                	 System.out.println("Enter The Rate Of The Items ");
//                	 Float itemprice;
//                	 itemprice=scan2.nextFloat();
//                	 price.add(itemprice);
//                	 
//                	 System.out.println("Enter The Quantity Of The Items ");
//                	 int qty;
//                	 qty=scan3.nextInt();
//                	 quantity.add(qty);
//                	 
//                 }
//                 System.out.println(grocery);
//                 System.out.println(price);
//                 System.out.println(quantity);
//                 
//            }
//		public void view()
//		{
//			System.out.println(grocery);
//            System.out.println(price);
//            System.out.println(quantity);
//		}
//		public void update()
//		{
//			 String name;
//			 
//			 Scanner scan1 = new Scanner(System.in);
//        	 name=scan1.next();
//        	 int quanty;
//        	 
//        	 
//        	 Scanner scan4 = new Scanner(System.in);
//        	 quanty=scan4.nextInt();
//        	 
//        	 for(int i = 0; i<grocery.size();i++) 
//        	 {
//        	 
//        		if (grocery.get(i).equals(name))
//        		{
//				
//        			quantity.set(i, quanty);
//        			System.out.println(quantity);
//        		}
//		
//			}
//		}
//		public static void main(String[] args) 
//	{
//		    Scanner scan = new Scanner(System.in);
//		    int choice = 0;
//		    assignment a=new assignment();
//		    System.out.println("\n");
//		    while(choice != 8) 
//		    {
//		      System.out.println("\n");
//			  System.out.println("\n");
//			  System.out.println("\n");
//		      System.out.println("1. Add ");
//	          System.out.println("2. View ");
//	          System.out.println("3. Update ");
//	          System.out.println("4. Delete ");
//	          System.out.println("5. High Price ");
//	          System.out.println("6. Lowest  Price ");
//	          System.out.println("7. Bill ");
//	          System.out.println("8. Exit ");
//	          System.out.println("Choose any one : ");
//	          choice = scan.nextInt();
//	          System.out.println("You Have Selected "+choice);
//		      System.out.println("\n");
//		      switch(choice)
//		        {
//	               case 1 :a.add();
//	            		break;
//	            
//	            case 2 :a.view();
//        					break;
//	                
//	            case 3 :a.update();
//	               
//	                break;
//	                
//	            case 4 : System.out.println("  ");
//	                
//	                break;
//	            
//	            case 5 : System.out.println("      ");
//	                
//	                break;
//	            case 6 : System.out.println("      ");
//                
//                break;
//	            case 7 : System.out.println("      ");
//                
//                break;
//	            case 8 :System.exit(0);
              
               
//	        }
//		
//	}
//
//}
//}
//
///* myMethod() is the name of the method
//static means that the method belongs to the Main class and not an object of the Main class.
// You will learn more about objects and how to access methods through objects later in this tutorial.
//void means that this method does not have a return value. 
//You will learn more about return values later*/
//
//// Menu  driven Program Using while loop 