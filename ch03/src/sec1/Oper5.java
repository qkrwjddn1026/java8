package sec1;

public class Oper5 {
	public static void main(String[] args) {
		// ��Ʈ(2����) ����
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d => "+ e);         //c,d ��� 2������ : c=011110 d=101000 2��3���ڸ��� &�̱� ������ �� -> 8
		System.out.println("c | d => "+ f);         //2���� or -> 62
		System.out.println("~(c & d) => "+ g);		//~ = 1�� ����: +1 (2���� ����) -> -9 
		System.out.println("c ^ d => "+ h);			//��Ÿ�� OR(eXclusi OR) = ���� �Է��� �ٸ��� 1 (110110) -> 54
		System.out.println("d >> 2  => "+ (d >>2));	//������ ����Ʈ : 2������ ���������� 2�� �о�� 101000 -> 010100 -> 001010 ->10
		System.out.println("d << 2  => "+ (d <<2)); //���� ����Ʈ(Shift) ->160
		System.out.println("d >>> 2 => "+(d >>>2)); //������ ���߽���Ʈ		->10
		System.out.println("d <<< 2 �� �������� ���� ");		//���� ���߽���Ʈ �����ڰ� ����
		//����� ������ �Ҵ� �׸��� ����ó��
		//System.out.println(a / 0);	//Not a Number => NaN(����)
		//System.out.println("k" / 4);	//Not a Number 
		//System.out.println('k' / 4);
		//System.out.println(a % 0);	//Infinity(�Ҵ�)
		try{	//����ó��
			//�����ؾ��� ����
			int k = 20;
			System.out.println(k / 0);			//�����ؾ��� ����
		} catch(ArithmeticException e1){	
			System.out.println("������꿡 ������ ������");//�����ؾ��� ������ ���� �߻��� ó���ؾ��� ����
			//e1.printStackTrace();
		}
	}

}