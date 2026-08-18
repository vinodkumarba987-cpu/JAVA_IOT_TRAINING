//encapsulation using get set method
class Parents {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class encap2 extends Parents {

	public static void main(String[] args) {
		encap2 test = new encap2();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}