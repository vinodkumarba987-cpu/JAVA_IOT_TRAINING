package java_training;

public class program1 {
	void add(int a,int b) {
		int result = a+b;
		System.out.print("Sum : "+result);
	}
	public static void main () {
		program1 test =new program1();
		int a=2;
		int b=3;
		test.add(a,b);
	}

}
