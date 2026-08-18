

public class overloading {
	void m1() {
		System.out.println("method 1");
	}
	void m1(int a) {
		System.out.println("method1 overloaded");
	}
	public static void main(String[] args) {
		overloading test = new overloading();// object
		test.m1();
		test.m1(3);
	}
}
