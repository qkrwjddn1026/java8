package sec2;

import java.util.Scanner;

public class Condition2 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("성명 : ");
		String name = sc.next(); //문자열
		System.out.print("\n점수 : ");
		int jum = sc.nextInt();	//정수
		String pan ="";
		/* if(조건식1) {
			조건식1이 만족할 때 실행할 문장;
			}else if(조건식2){
			조건식1이 만족하지 않으며, 조건식2가 만족할 때 실행
			}else {
			모든 조건이 만족하지 않을 경우 실행할 문장;
			}
								*/
		if(jum>=90){			//else if
			pan="A";
		} else if(jum>=80){		//80~89
			pan="B";
		} else if(jum>=70){		//70~79
			pan="C";
		} else if(jum>=60){		//60~69
			pan="D";
		} else {				//60미만
			pan="집에가";
		}
		System.out.println("당신의 이름은 "+ name + "이며, 점수는" + jum + "이고, 학점은" + pan + "입니다" );
		sc.close();
	}
}
