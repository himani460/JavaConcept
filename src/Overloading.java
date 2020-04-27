 class M3
{
	 public int h1(int a, int b)
	 {
	System.out.println("The Number is integer");
	System.out.println(a+b);
	return a + b;
	
}
	 public double h1(int a, int b,int c )
	 { 
		 System.out.println("The Number is integer with 3 values");
		 return a + b+c;
	 }
}
public class Overloading {

	public static void main(String[] args) {
		M3 obj3 = new M3();
		obj3.h1(10, 15);
		obj3.h1(10, 15,40);
	}

}
