package sec4;

public class Ex4 {

	public static void main(String[] args) {
		//랜덤 수 : 아무수나
		int a=0, b=0;
		while(a+b!=5){
		a = (int)( Math.random()*6)+1; //double a= Math.random(); ->0~1 까지의 아무 수 이걸 int 형변환 -> 0 -> *6+1
		b = (int)( Math.random()*6)+1;
		System.out.println("("+ a+","+b+")");
		}
		
		
		// 로또 번호 추첨
		for(int i=0;i<6;i++){
			int su = (int) (Math.random()*45)+1;
			System.out.println(su);
		}
	}
}
