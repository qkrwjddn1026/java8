package sec2;

public class Cast1 {

	public static void main(String[] args) {
		int a=1004, b; //4byte
		short c, d; 	//2byte
		long e=100, f ;
		byte q, h; //1byte
		b= 65538;
		//c = a; -> a��  int �̹Ƿ�  short�� c�� ������ ������ �ȵ�
		c= 500;
		a = c;	//short -> int = �ڵ� �� ��ȯ(auto casting)
		d = (short) b; // �� ��ȯ �����ڿ� ���� �� ��ȯ(force casting)
		System.out.println("d="+d);
		System.out.println("b="+b);
		/* e�� 100*/
		e = b;
		/* e�� 65538*/
		f = a + c;
		a = (int)(f + c);
		
		

	}

}
