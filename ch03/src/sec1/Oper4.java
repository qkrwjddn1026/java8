package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//�� ������ (==,!=,>,>+,<,<=) -> true�Ǵ� false�� ����� �����
		/* ==����(�̴�)
			!= ���� �ʴ�(�ٸ���)
			>  ũ��(�ʰ�==��(��¥))
			>= ũ�ų� ����(�̻�==����)
			<  �۴�(�̸�=��)	
			<= �۰ų� ����(����==����) */
		System.out.println("a==b =>"+(a==b));	//false
		System.out.println("a!=b =>"+(a!=b));	//true
		System.out.println("a>b => "+(a>b));	//true
		System.out.println("a>=b =>"+(a>=b));	//true
		System.out.println("a<b => "+(a<b));	//false
		System.out.println("a<=b => "+(a<=b));	//false
		System.out.println("a �� ���ڿ��� �³�? => "+ a instanceof String); //true
		//���� ������(���� ����)
		//	�Է�1		�Է�2		a>b && c>d		a<b || c>d
		//	0		0		0				0
		//	0		1		0				1
		//	1		0		0				1
		//	1		1		1				1
		
		//���� ������ (���� ����) !(a>b)
		System.out.println("a>b && c>d => "+(a>b && c<d)); //(and:&&) false
		System.out.println("a>b || c<d => "+(a>b || c<d)); //(or:||) true 
		System.out.println("!(a>b) => "+(!(a>b)));		   // false
		// ���� => ����? ���϶� �� :�����϶� ��
		System.out.println(a>=b ? "ũ�ų� ����" : "�۴�");
	}

}