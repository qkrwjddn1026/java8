package sec2;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student("김기태",90,80,90);

		/*System.out.println("이름\t총점\t평균\t학점\t판정");
		System.out.println(stu.name+"\t"+stu.calcTot()+"\t"+stu.calcAvg()+"\t"+stu.calcHak()+"\t"+stu.calcRes() );*/	
		
		System.out.println(" 이름 : " + stu.name);
		System.out.println(" 총점  : " + stu.calcTot());
		System.out.println(" 평균  : " + stu.calcAvg());
		System.out.println(" 학점 : " + stu.calcHak());
		System.out.println(" 판정 : " + stu.calcRes());
	
	
		
		

	}
}