package sec4;

public class Ex8 {

	public static void main(String[] args) {
		// 2중 for문을 활용하여 아래와 같은 형태의 구구단을 출력
		/*
		 * 2*1=2 3*1=3 ............ 9*1=9
		 * 2*2=4 3*2=6 ............
		 * ........................
		 * 2*9=18 ................. 9*9=81
		 */
				for(int a=1;a<10;a++){
					for(int b=2;b<10;b++){
						System.out.print(b+"*"+a+"="+(a*b)+("\t"));
					}
					System.out.println();
				}
				System.out.println("\n");
				System.out.println("수열 - 팩토리얼의 합계 출력");
				
				int mul=1;
				long res=0;
				for(int a=1;a<=10;a++){
					mul*=a;
					res+=mul;
						
				}
				System.out.println("10! = " + res);
				

			}

		}
