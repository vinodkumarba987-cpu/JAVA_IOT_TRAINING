
class GrandParent
{
	void bp()
	{
		System.out.println(" Grandparent");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println("Parent");
	}
	
}

public class inheritance2 extends Parent{

	public static void main(String[] args) {
 		inheritance2  bb= new inheritance2();
 		bb.bp();
 		bb.cancer();
	}
}