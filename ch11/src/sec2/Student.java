package sec2;

public class Student {
	public int sno;
	public String sname;
	public Student(){}
	public Student(int sno){this.sno=sno;}
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	public void finalieze(){
		System.out.println("소멸");
	}
}
