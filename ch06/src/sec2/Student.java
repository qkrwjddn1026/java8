package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	
	
	
	
	public Student(){}
	public Student(String name){
		this.name=name;
	};
	public Student(String name, int kor,int eng,int mat){
		this.name=name;  this.kor=kor;
		this.eng=eng;  this.mat=mat;
	}
	
	public int calcTot() {
		int tot= kor+eng+mat;
		return tot;
	}
	
	public double calcAvg() {
		double avg = (double)(kor+eng+mat)/3;
		return avg;
	}
	
	public String calcHak() {
		String hak = "";
		double avg = this.calcAvg();
		if(avg>=90){
	 		   hak="A";
	 	   } else if(avg>=80){
	 		   hak="B";
	 	   } else if(avg>=70){
	 		   hak="C";
	 	   } else {
	 		   hak="D";
	 	   } 
		
		return hak;
	}
	
	public String calcRes() {
		String res="";
		double avg = this.calcAvg();
		if(avg>=80){
			res="합격";
		} else {
			res="불합격";
		}
		return res;
	}		
}
