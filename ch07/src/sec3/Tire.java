package sec3;

public class Tire {
	// 멤버 필드
	public int maxRotation; // 최대 회전수 (타이어 수명)
	public int accumlatedRotation; // 누적 회전수
	public String location;
	// 생성자
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	} 
	
	public boolean roll(){
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation){
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumlatedRotation));
			return true;
		} else {
			System.out.println("****"+location+" Tire 펑크 *****");
			return false;
		}
	}
	
	
}
