
public class Tes2 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		String s2 = new String("Hello");
		
		if (s1==s2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equal");
	
		}
		int num=5;
		System.out.println();
		System.out.println(num++);
		System.out.println(++num);
		
		System.out.println(num--);
		System.out.println(--num);
		System.out.println("-------------------------------");
		num+=5;
		System.out.println(num);
		num-=5;
		System.out.println(num);
		
	}
}
