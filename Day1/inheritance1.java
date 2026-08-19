class Parent
{
	void cancer()
	{
		System.out.println("Line 1");
	}
	void bp()
	{
		System.out.println(" Line 2");
	}
}
public class inheritance1 extends Parent{

	public static void main(String[] args) {
 		inheritance1 bb= new inheritance1();
 		bb.bp();
 		bb.cancer();
	}
}