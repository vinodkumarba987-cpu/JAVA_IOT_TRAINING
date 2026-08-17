package java_training;

public class Demo {
	int a=100;
	static int c=199;
	void m1() {
		System.out.println("m1: "+a);
	}
	public Demo() {
		int b=150;
		System.out.println("Constructor :"+b);
	}
	public static void main(String[]args) {
		Demo test= new Demo();
		test.m1();
		System.out.println("Call "+test.a);
		System.out.println(c);
		System.out.println(Demo.c);
	}
	
	

}
