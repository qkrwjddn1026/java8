package sec2;

public class Product {
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	public Product() { }
	public Product(String pid, String pname){ 
		this.pid=pid; this.pname=pname;
	}
	public Product(String pid, String pname, int amount, int price){
		this.pid=pid; this.pname=pname;
		this.amount=amount; this.price=price;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int calcMoney(){
		int money= amount*price;
		return money;	
	}
	public String calcRank(){
		if(price>=100000) return "고가";
		else if(price>=50000) return "중저가";
		else return "저가";
		
		//    ==
		/*String rank="";
		
		if(this.price>=10000){
			rank="고가";
		} else if(this.price>=50000){
			rank="중저가";
		} else {
			rank="저가";
		}
		return rank;*/	
	}
	public void printImg(){
		System.out.println("이미지 : " +img);
	}
	public void printProduct(){
		System.out.println("아이디 : "+ pid);
		System.out.println("제품명 : "+ pname);
		System.out.println("제품수량 : "+ amount);
		System.out.println("제품가격 : "+ price);
		System.out.println("제품이미지 : "+ img);
	}

}
