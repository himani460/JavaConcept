//import java.sql.SQLException;

class M5// Parent 
{
	int a= 100;
	public  void m6() 
	{
		System.out.println("hello Priyanka");
	}
}
class M7 extends M5 //Child
{
	public void m6()
	{
		
		System.out.println("Hello Himani");
	}
	
	
	/*static   void m6(M5 m)// Downcasting.
	{
		M7 d= (M7)m;
		System.out.println("hello Priyanka 123 ");
	}*/
}

public class Overriding{

	public static void main(String[] args) throws Exception {
		/*M5 obj= new M7();*/ // Parent to Child is possible
		/* M7 obj1= (M7) new M5();*/// Child to Parent is not possible // Cannot convert from parent to child.
		/* M7 obj1= (M7) new M5();*/// ClassCastException
		/*	M5 m= new M7();
	M7.m6(m);*/ // Downcasting
		
		
		M7 d= new M7();
		M5 m=(M5) d;
		m.m6();



	}

}
