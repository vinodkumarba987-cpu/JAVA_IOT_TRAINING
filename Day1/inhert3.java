
class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class inhert3 extends GrandParent{

	public static void main(String[] args) {
 		inhert3 bb= new inhert3();
 		bb.bp();
 		//bb.cancer();
	}
}