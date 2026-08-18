class parent
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class polymorph extends parent {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		polymorph test = new polymorph();// object
		test.marry();
		test.property();
	
	}
}
