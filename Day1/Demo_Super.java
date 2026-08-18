class parent
{
   int a =10;
		   int b =20;
}
//Using Super Keyword
public class Demo_Super extends parent {
	int a=20;
	int b =30;
	
	void add(int a , int b)
	{
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Demo_Super jj = new Demo_Super();
	jj.add(2, 3);
	
}
}