package sec4;

public class Ex6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println("\n");
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		for(int i=0;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
