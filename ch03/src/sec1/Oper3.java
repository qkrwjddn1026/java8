package sec1;

public class Oper3 {

	public static void main(String[] args) {
		// ���ڿ� ����
		byte a ='K',b='i',c='m';
		int d=1004;
		
		System.out.println("a="+a); 
		System.out.println("b="+b); // -> �ƽ�Ű�ڵ�
		System.out.println("c="+c);             
		System.out.println(a+b+c+1004);//������ ���� ����� ����
		System.out.println("kim"+d);   //���ڿ� ����
		//���� ������
		int k=1, l=1, m=1, n=1;
		System.out.println();
		System.out.println(k++); //��� : 1 -> ���: 2   => ��������
		System.out.println(k);
		System.out.println(++l); //��� : 2 -> ��� : 2  => ��������
		System.out.println(l);
		System.out.println(m--); // ��� : 1 -> ��� : 0
		System.out.println(m);
		System.out.println(--n); // ��� : 0 -> ��� : 0
		System.out.println(n);
		// ���� ������
		int p=20, r=30;
		p+=2; //p=p+2 ->22
		r-=2; //r=r-2 ->28
		System.out.println(p);
		System.out.println(r);
		p*=2; //p=p*2 ->44
		r/=2; //r=r/2 ->14
		System.out.println(p);
		System.out.println(r);
	}
}