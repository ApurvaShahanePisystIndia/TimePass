package hashmapdemo;
class A{
	public int methodA(int a,int b)
	{
		System.out.println("In a");
		return a+b;
	}
}

public class Test3
{
 
	public static void main(String[] args) {
		int ans;
		A a=new A ();
		ans = a.methodA(Integer.MAX_VALUE,Integer.MAX_VALUE);
		System.out.println(ans);

	}

}
