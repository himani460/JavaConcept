abstract class M1
{	
abstract public  void hello();
public  void hello1()
{
	System.out.println("Going for Market with Papa");	
}
public void hello2()
{
	System.out.println("Going for Market Second time");
	
}
}
public class Firstclass  extends M1{
	
	  public  void hello()
	{
		System.out.println("Going for Market");
		
	}
	  public void hello2()
	  {
	  	System.out.println("Going for Market Second time with my papa");
	  	
	  }
	  public void hello3()
	  {
	  	System.out.println("Going for Market Second time with my papa with mummy");
	  	
	  }

	public static void main(String[] args) {
		
		M1 obj = new Firstclass();
		obj.hello();
		obj.hello1();
	//	obj.hello3();

	}

}
