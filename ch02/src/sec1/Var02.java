package sec1;

public class Var02 {	//scope: �����Ǵ� ������ �ñ�
	int a=10, b=20;   //���� ����

	public static void main(String[] args) {
		int a=100, b=200, c= 300; 	//���� ����
		System.out.println("a: "+a);
		tot(a, b);	//�޼��� ȣ��

	}

	public static void tot(int f, int g){  //�Ű����� - �޼��� ȣ��� �ν�
		System.out.println("a+b="+(f+g));
	}
	
}
