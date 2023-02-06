
public class pratice1 {

	static int add(int a,int b)
	{
		while(b!=0)
		{
			int carry=a&b; // used bitwise and
			a=a^b;         // used bitwise or
			b=carry<<1;    // used left shift 
		}
		return a;
	}
	public static void main(String args[])
	{
		
		System.out.println(add(5,4));
	}

}
/*binary of 5 :0101
binary  of 4:0100
step 1: a and b
         0101
		 0100
		-------
		 0100-----> (4) carry
		 
Step 2: a Xor b
         0100
         0101
        --------
         0001------>(1)	=a
step 3: Left shift
        0100<<1
        1000---->(8)=b      
        
             Now got new a=1 and b=8;
             carry= 0001 ND 1000
Step 4:   0001
		  1000
		 ------
		 0000----->(0)
		 x=0001 
		   1000
		   -----
		  1001--->(9)
Step 5: y=0000<<1;
so now y is o tho loop wont run now ..

*/