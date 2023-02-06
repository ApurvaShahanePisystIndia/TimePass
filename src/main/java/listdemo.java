package hashmapdemo;
import java.util.Scanner; 
public class listdemo 
{
	  public static void main(String[] args) 
	  { int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of rows you want =");
		  num=sc.nextInt();
		  System.out.println(num);
		  //Pattern 1
		  for(int i=1;i<=num;i++)
		   {
			   for(int j=1;j<=i;j++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
			   
		   }
		 
		  System.out.println("\n");
		  System.out.println("\n");
		  
		//Pattern 2
	      for (int i = 1; i <= num; i++) {
	          for (int j = 1; j <=num - i; j++) {
	              System.out.print(" ");
	          }
	          for (int k = 1; k <= i; k++) {
	              System.out.print("*");
	          }
	          System.out.println("");
	      }
	      
	      System.out.println("\n");
		  System.out.println("\n");
		  
		 //Pater number 3 
	  for(int i=1;i<=num;i++)
	   {
		   for(int j=num;j>=i;j--)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	  	
	   }
	  System.out.println("\n");
	  System.out.println("\n");
	  
	
	  
      //Pattern 4 
      for(int i=1;i<=num;i++)
      {
          for(int j=1;j<i;j++)
          {
              System.out.print(" ");
          }
          for(int k=i;k<=num;k++) 
          {
              System.out.print("*");
          }
          System.out.println("");
      }
      System.out.println("\n");
	  System.out.println("\n");
	  
	  //Pattern 6
	  for(int i=num;i>0 ;i--)
      {
   for(int j=0;j<num-i;j++)
       
              {
                      System.out.print(" ");
              }
              for(int j=0;j<(i*2)-1;j++)
       
              {
                      System.out.print("*");
              }
             System.out.println("");
      }     
	  
	  System.out.println("\n");
	  System.out.println("\n");
	  
	  
	  // Pattern 9
	  for (int i = 1; i <= num; i++) {
          for (int j = 1; j <=num - i; j++) {
              System.out.print(" ");
          }
          for (int k = 1; k <= i; k++) {
              System.out.print("*");
          }
          System.out.println("");
      }
	  for(int i=1;i<=num;i++)
      {
          for(int j=1;j<i;j++)
          {
              System.out.print(" ");
          }
          for(int k=i;k<=num;k++) 
          {
              System.out.print("*");
          }
          System.out.println("");
      }
      System.out.println("\n");
	  System.out.println("\n");
      
	  //Pattern 9
	  
	  for(int i=1;i<=num;i++)
	   {
		   for(int j=num;j>=i;j--)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	  	
	   }
	  
	  System.out.println("\n");
	  System.out.println("\n");
	  //Pattern 8
	  for(int i=1;i<=num;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  for(int i=1;i<=num;i++)
	  {
		  for(int j=num;j>i;j--)
		  {
			  System.out.print("*"); 
		  }
		  System.out.println();
	  }
	  System.out.println("\n");
	  System.out.println("\n");
	  
	  //Square
	  for(int i=1;i<=4;i++)
	  {
		  for(int j=1;j<=4;j++)
		  {
			  System.out.print("*"); 
		  }
		  System.out.println();
	  }
	  System.out.println("\n");
	  System.out.println("\n");
	  
	  // Triangle widout space
	  for (int i = 0; i < num; i++)
	  {

		  for (int j = num - i; j > 1; j--) 
		  { //Loop for blank space

		  System.out.print(" "); //Print Space

		  }

		  for (int j = 0; j <= i; j++)
		  { //loop for star

		  System.out.print("* "); //Print Star
   
		  }

		  System.out.println(); //Newline 
      }// end of for loop 
	  
	  System.out.println("\n");
	  System.out.println("\n");
	  
	  for( int i=1;i<=num;i++)
	  {
		  for(int j=num;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print("*");
		  }
		  for(int l=2;l<=i;l++)
				  {
			  		System.out.print("*");
				  }
		  System.out.println();
	  }
	  
	    
         
	 
	  int count = num - 1;
      for (int k = 1; k <= num; k++) {
          for (int i = 1; i <= count; i++)
              System.out.print(" ");
          count--;
          for (int i = 1; i <= 2 * k - 1; i++)
              System.out.print("*");
          System.out.println();
      }
      count = 1;
      for (int k = 1; k <= num - 1; k++) {
          for (int i = 1; i <= count; i++)
              System.out.print(" ");
          count++;
          for (int i = 1; i <= 2 * (num - k) - 1; i++)
              System.out.print("*");
          System.out.println();
      }  // Pattern number 7
      System.out.println("\n");
      System.out.println("\n");
      
      //Pattern 10
      for (int i = 1;i <=num; i++)
      {
          for (int j=num-1;j>=i;j--)
          {
              System.out.print(" ");
          }
          // Print star in decreasing order
          for (int k=1;k<=num; k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
      
      	System.out.println("\n");
      	System.out.println("\n");
	   //Pattern 11
      for (int i = 1; i <=num; i++)
      {
          for (int j = 1; j <= i-1; j++)
          {
              System.out.print(" ");
          }
          // Print star in decreasing order
          for (int k = 1; k <=num; k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
      System.out.println("\n");
      System.out.println("\n");
      
      //Pattern 13
      for (int i = 1; i <= num; i++)
      {
          for (int j = 1; j < i; j++)
          {
              System.out.print(" ");
          }

          for (int k = i; k <=num; k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
      for (int i =num-1; i >= 1; i--)
      {
          for (int j = 2; j <=i; j++)
          {
              System.out.print(" ");
          }

          for (int k = i; k <=num; k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
      System.out.println("\n");
      System.out.println("\n");
      
      
      
     //pattern 14
      for (int i = 1; i <=num; i++)
      {
          for (int j = 1; j < i; j++)
          {
              System.out.print(" ");
          }

          for (int k = i; k <=num; k++)
          {
              System.out.print("* ");
          }
          System.out.println();
      }
      for (int i =num-1; i >= 1; i--)
      {
          for (int j = 1; j < i; j++)
          {
              System.out.print(" ");
          }

          for (int k = i; k <=num; k++)
          {
              System.out.print("* ");
          }
          System.out.println();
      }
      System.out.println("\n");
      System.out.println("\n");
      //Pattern 15
      /*for (int i=1; i<=num; i++)
      {
          for (int j=1; j<=i; j++)
          {
        	  if
          }*/
}// end of main 
}// end of class 

/*
1   Done
2	Done
3   Done
4	Done
5   Done
6	Done
7   Done 
8	Done
9	Done
10	Done
11	Done
12
13 Done
14 Done 
15
16*/