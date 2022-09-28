package sec4;

public abstract class Student {
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	//추상화된 메서드 : abstract 가 기술되어 있는 메서드로서 반환타입, 메서드명, 매개변수 등만 기술되어야 하며, 구현내용은 기술하지 않고, 상속 받는 서브 클래스에서 반드시 구현내용을 기술해야함.
	abstract int computeTot(int jum1,int jum2,int jum3);  //추상화 -abstract
	
	abstract double computeAvg(int jum1,int jum2,int jum3);
	
	//일반 멤버 메서드
}
