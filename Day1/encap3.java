//encapsulation using "this." key word
public class encap3 {
	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		encap3 abc = new encap3();
		abc.m1(4, 3);
		abc.m2();
	}
}