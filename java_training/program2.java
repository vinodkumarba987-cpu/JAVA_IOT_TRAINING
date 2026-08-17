package java_training;

public class program2 {
	void sub(int a,int b) {
		int result = a-b;
		System.out.print("by subraction : "+result);
	}
	public static void main () {
		program2 test =new program2();
		int a=6;
		int b=4;
		test.sub(a,b);
	}

}

