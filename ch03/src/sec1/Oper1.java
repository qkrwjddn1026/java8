package sec1;
// ���α׷�(Operation)�� ��� ����� Op-code(������)�� Operand(�ǿ�����)�� �̷����
// �ּ�(�������� ����)�� ���� 0�ּ� ��ɾ� ���� - 3�ּ� ��ɾ� ����
// �Է��׿� ���� ���� ����(unary)�� ���� ����(binay)���� �з���
// ������ ������ ���� ���, ��, ��, ��Ʈ, ����, ���� ���� ���� ����
// boolean a= true;
// boolean b = !a; -> ���� ����
// a = a + b;
// + : ����(���) -> Op-code
// a , b -> Operand
public class Oper1 {

	public static void main(String[] args) {
		int a=20, b=30, c;		   // ����
		System.out.println(a); // �� 1 �ּ� ��ɾ�
		prt();				   // �� 0 �ּ� ��ɾ�
		c= a + b;
		// ������ �����1 : +ab -> pre(fix)order (����)
		// 	       �����2 : ab+ -> post(fix)order (����)
		//	       �����3 : a+b -> in(fix) order (����)
	}

	public static void prt(){
		System.out.println("data");
	}
	
}
