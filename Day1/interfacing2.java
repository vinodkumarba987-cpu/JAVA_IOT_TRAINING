interface Atm {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class interfacing2 implements Atm, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		interfacing2 v = new interfacing2();
		v.min();
		v.depo();
	}
}