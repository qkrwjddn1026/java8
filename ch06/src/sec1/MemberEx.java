package sec1;

public class MemberEx {

	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자 함수();
		Member mem1 = new Member(); //mem1을 새로 만듬
		mem1.setId("kkt");
		mem1.setPassword("1234");

		System.out.println("아이디 : " + mem1.getId());
		System.out.println("비밀번호 : " + mem1.getPassword());
		System.out.println("이름 : " + mem1.getName());
		
		
		Member mem2 = new Member("kyj","1004");
		Member mem3 = new Member("pjw","1234","aaa");
		Member mem4 = new Member("ppp","1111","박정우","abab");
		System.out.println("이름은 : " + mem4.getName());
		
		MemberContoller mc = new MemberContoller();
		mc.join("kkt", "1004", "김기태");
		mc.info();
		mc.login("kkt", "1004");
		mc.info();
		

	}

}
