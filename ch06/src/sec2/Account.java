package sec2;

public class Account {

	private String number;
	private String holder;
	private int balance ;
	private int money;
	
	
	
	public Account(){}
	public Account(String number, String holder, int balance, int money){
		this.number=number; this.holder=holder;
		this.balance=balance; this.money=money;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void runDeposit(int money){
		  this.balance+=money; 
	}
	public void runWithraw(int money){
		
		if(this.balance-money>0){
			this.balance-=money;
			}else {
				System.out.println("출금액 부족");
			}
		
	}
	public int runBalance(){
		return balance;
	}
	public void printAccount(){
		System.out.println( "계좌번호 : "+ number);
		System.out.println("예금주 : " + holder);
		System.out.println("잔액 : " + balance);
	}
}

