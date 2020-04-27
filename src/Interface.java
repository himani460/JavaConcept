interface M2
{
	void hello();
}
class Happy implements M2
{
	public void hello()
	{
	System.out.println("Go to the office");
}
}
class Happy1 implements M2
{
	public void hello()
	{
	System.out.println("Go to the office and class");
}
}
 class Interface  {

	public static void main(String[] args) {
		Happy1 obj1= new Happy1();
		obj1.hello();
	}
}
