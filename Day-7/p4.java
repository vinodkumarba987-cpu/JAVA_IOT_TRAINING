
public class p4 {
	static void withdraw(int n) {
		if(n==0) {
			System.out.println("Calling Count(" + n+ ")");
			return;
		}else {
			System.out.println("Calling Count(" + n+ ")");
			withdraw(n - 2000);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withdraw(10000);
		
	}
}