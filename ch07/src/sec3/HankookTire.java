package sec3;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(maxRotation, location);
	}

	@Override
	public boolean roll(){
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation){
			System.out.println(location + "Hankook Tire 수명 : "+ (maxRotation-accumlatedRotation));
			return true;
		} else {
			System.out.println("***"+location + " Hankook Tire 펑크 *****");
			return false;
		}
	}
}
