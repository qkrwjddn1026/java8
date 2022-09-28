package sec3;

public class MichelinTire extends Tire {
	public MichelinTire(String location, int maxRotation){
		super(maxRotation, location);
	}

	@Override
	public boolean roll(){
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation){
			System.out.println(location + "MichelinTire 수명 : "+ (maxRotation-accumlatedRotation));
			return true;
		} else {
			System.out.println("***"+location + " MichelinTire 펑크 *****");
			return false;
		}
	}
}


