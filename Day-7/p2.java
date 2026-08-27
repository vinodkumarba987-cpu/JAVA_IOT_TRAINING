public class p2 {
	static void count(int n) {
		if (n == 0) {
			return ;
		}
		System.out.println("Calling Count(" + n+ ")");
		count(n - 1);
		System.out.println("Returning from count(" + n + ")");
	}
	public static void main(String[] args) {
		count(5);
	}
}