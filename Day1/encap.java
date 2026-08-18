//encapsulation basic method
public class encap {
	int a = 20;

	void m1(int b) {
		System.out.println("dfasdf "+b);
		System.out.println("dfasdf "+a);
	}

	public static void main(String[] args) {
		encap   vv = new encap();
		vv.m1(4);
	}
}