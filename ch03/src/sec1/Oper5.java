package sec1;

public class Oper5 {
	public static void main(String[] args) {
		// 비트(2진수) 연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d => "+ e);         //c,d 모두 2진수로 : c=011110 d=101000 2의3승자리가 &이기 때문에 값 -> 8
		System.out.println("c | d => "+ f);         //2진수 or -> 62
		System.out.println("~(c & d) => "+ g);		//~ = 1의 보수: +1 (2진수 보수) -> -9 
		System.out.println("c ^ d => "+ h);			//배타적 OR(eXclusi OR) = 서로 입력이 다를때 1 (110110) -> 54
		System.out.println("d >> 2  => "+ (d >>2));	//오른쪽 시프트 : 2진수로 오른쪽으로 2번 밀어라 101000 -> 010100 -> 001010 ->10
		System.out.println("d << 2  => "+ (d <<2)); //왼쪽 시프트(Shift) ->160
		System.out.println("d >>> 2 => "+(d >>>2)); //오른쪽 이중시프트		->10
		System.out.println("d <<< 2 는 존재하지 않음 ");		//왼쪽 이중시프트 연산자가 없음
		//연산시 부정과 불능 그리고 예외처리
		//System.out.println(a / 0);	//Not a Number => NaN(부정)
		//System.out.println("k" / 4);	//Not a Number 
		//System.out.println('k' / 4);
		//System.out.println(a % 0);	//Infinity(불능)
		try{	//예외처리
			//실행해야할 구문
			int k = 20;
			System.out.println(k / 0);			//실행해야할 구문
		} catch(ArithmeticException e1){	
			System.out.println("산술연산에 오류가 존재함");//실행해야할 구문이 오류 발생시 처리해야할 내용
			//e1.printStackTrace();
		}
	}

}
