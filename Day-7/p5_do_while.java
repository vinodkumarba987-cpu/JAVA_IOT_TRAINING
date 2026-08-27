public class p5_do_while{
	static void withdraw(int n) {
		 do{
			n=n-2000;
			System.out.println("balance ($"+n+")");
		}while(n!=0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withdraw(10000);
	}
}