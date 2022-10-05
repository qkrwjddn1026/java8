package sec1;
//중첩 클래스 : 클래스 내부에 클래스가 있는 클래스로 외부 클래스와 내부 클래스로 구분한다.
public class OuterClass {	// 외부 클래스
	int field1;
	public OuterClass(){}	//생성자
	public void method1(){
		System.out.println("외부 클래스");
	} //멤버 메소드
	
	//내부(멤버) 클래스 Inner
	class Inner{
		int field1;	//내부 클래스의 멤버 필드
		public Inner(){} //내부 클래스의 생성자
		public void method1(){
			System.out.println("내부 클래스");
		} //내부 클래스의 멤버 메소드
	}
	//내부(멤버) 클래스 Inner2
	static class Inner2{
		int field1;
		static int field2;
		public Inner2(){} // 내부 정적 클래스의 생성자
		public void method1(){
			System.out.println("내부 정적 클래스");}
		static public void method2(){
			System.out.println("내부 정적 클래스2");
		} //내부 정적 클래스의 멤버 메소드
	}
}