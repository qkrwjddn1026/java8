package sec3;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation){
		super(maxRotation, location);
	}

	@Override
	public boolean roll(){
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation){
			System.out.println(location + "KumhoTire 수명 : "+ (maxRotation-accumlatedRotation));
			return true;
		} else {
			System.out.println("***"+location + " KumhoTire 펑크 *****");
			return false;
		}
	}
}


