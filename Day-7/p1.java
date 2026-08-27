public class p1 {
	static void methodm1() {
			System.out.println("Inside Methodm1");
			methodm2();
			System.out.println("Back to Methodm1");
		}
		static void methodm2() {
			System.out.println("Inside Methodm2");
	}
		public static void main(String[] args) {
			System.out.println("Inside Main");
			System.out.println("Back to Main");
		}
}