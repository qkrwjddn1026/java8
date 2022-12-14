package sec2;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		System.out.println("점수 입력 : ");
		Scanner sc = new Scanner(System.in); //키보드에서 입력 받을때  ctrl+shift+o
		int num = sc.nextInt(); // 정수
	/*	if(조건식){
			참일때 실행문;
		} else{
			거짓일때 실행문;
		} 				*/
		
		if(num>=80) {
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		
		//명령문이 한 줄이면, {}(중괄호) 생략 가능
		if(num<60) System.out.println("재평가"); 
		else System.out.println("과목이수");
		
		//else없이 진행하는 경우
		String str = "탈락";
		if(num>80) str="합격";
		System.out.println(str);
		
		//삼항 연산자
		String str2 = (num>=80) ?  "합격" : "불합격";
		System.out.println(str2);
		
		
		sc.close();						//콘솔 결과창에 마우스 클릭 후 점수 입력(Scanner) -> 합격or불합격 출력 
	}
}
