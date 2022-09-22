package sec2;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		System.out.println("제품코드 : ");
		pd.setPid(sc.next());
		System.out.println("제품이름 : ");
		pd.setPname(sc.next());
		System.out.println("제품수량 : ");
		pd.setAmount(sc.nextInt());
		System.out.println("제품가격 : ");
		pd.setPrice(sc.nextInt());
		System.out.println("이미지 : ");
		pd.setImg(sc.next());
		
		System.out.println("제품코드\t제품명\t제품수량\t제품가격\t이미지");
		System.out.println(pd.getPid()+"\t"+pd.getPname()+"\t"+pd.getAmount()+"\t"+pd.getPrice()+"\t"+pd.getImg());
		
		
		
		/*pd.setPid("a01");
		pd.setPname("냉장고");
		pd.setAmount(3);
		pd.setPrice(80000);
		pd.setImg("icetank01.jpg");
		pd.printProduct();*/
		
		

	}

}
