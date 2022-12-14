package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교 연산자 (==,!=,>,>+,<,<=) -> true또는 false로 결과가 산출됨
		/* ==같다(이다)
			!= 같지 않다(다르다)
			>  크다(초과==후(날짜))
			>= 크거나 같다(이상==이후)
			<  작다(미만=전)	
			<= 작거나 같다(이하==이전) */
		System.out.println("a==b =>"+(a==b));	//false
		System.out.println("a!=b =>"+(a!=b));	//true
		System.out.println("a>b => "+(a>b));	//true
		System.out.println("a>=b =>"+(a>=b));	//true
		System.out.println("a<b => "+(a<b));	//false
		System.out.println("a<=b => "+(a<=b));	//false
		System.out.println("a 가 문자열이 맞나? => "+ a instanceof String); //true
		//논리 연산자(이항 연산)
		//	입력1		입력2		a>b && c>d		a<b || c>d
		//	0		0		0				0
		//	0		1		0				1
		//	1		0		0				1
		//	1		1		1				1
		
		//논리 연산자 (단항 연산) !(a>b)
		System.out.println("a>b && c>d => "+(a>b && c<d)); //(and:&&) false
		System.out.println("a>b || c<d => "+(a>b || c<d)); //(or:||) true 
		System.out.println("!(a>b) => "+(!(a>b)));		   // false
		// 삼항 => 조건? 참일때 식 :거짓일때 식
		System.out.println(a>=b ? "크거나 같다" : "작다");
	}

}
