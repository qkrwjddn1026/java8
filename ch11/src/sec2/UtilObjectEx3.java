package sec2;

import java.util.Objects;

public class UtilObjectEx3 {
	public static void main(String[] args) {
		Student s1 = null;
		Student s2 = new Student(4,"정진석");
		Student s3 = new Student(5,"지각생");
		
		System.out.println();
		if(Objects.isNull(s1)){
			System.out.println("s1 이 null입니다.");
		}else{
			System.out.println("s1이 아닙니다.");
		}
		
	}

}
