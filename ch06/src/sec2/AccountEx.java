package sec2;

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setNumber("11-11-11");
		ac.setHolder("박정우");
		ac.setBalance(0);
		ac.runDeposit(150000);
		ac.runWithraw(90000);
		System.out.println("잔액 조회"+ac.runBalance());
		ac.printAccount();
		
		
	}

}