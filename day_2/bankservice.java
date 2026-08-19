class banking {
	static void withdrawMoney(int balance, int amount) throws Exception {
		checkBalance(balance, amount);
		System.out.println("Withdrawal successful");
	}
	static void checkBalance(int balance, int amount) throws Exception {

		if (amount > balance) {
			throw new Exception("Insufficient Balance");
		}
		System.out.println("Balance is sufficient");
	}
}
public class bankservice {

	public static void main(String[] args) {

		try {
			banking.withdrawMoney(2000, 5000);
		} catch (Exception e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

	}
} 
