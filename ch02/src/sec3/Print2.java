package sec3;

public class Print2 {
	public static void main(String[] args) {
		int a=100;
		float b=3.14f;
		String c="kim";
		System.out.printf("�������� %d�� ���� ������ %f�� �ݿ��Ͽ� ���� ���̰� %f ��. %s�� ��Ģ", a , b, a*a*b, c);
		System.out.printf("%n10���� %d�� 8������ %o�� ", a, a);
		System.out.printf("%n10���� %d�� 16������ %x ��", a, a);
		
				//%d : ���� , %f : �Ǽ� , %s:���ڿ�  ,%b :2����  ,%o : 8���� , %x : 16����
		
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
		byte result = byteValue + byteValue;
	    int result = 5 + byteValue; 			
	    float result = 5 + floatValue;			
	    double result = 5 + doubleValue;	
				

	}

}