package sec4;

public class MiddleStudent extends Student{
	private int jum4;
	
	
	
	public int getJum4() {
		return jum4;
	}

	public void setJum4(int jum4) {
		this.jum4 = jum4;
	}

	@Override
	int computeTot(int jum1, int jum2, int jum3) {
		return jum1 + jum2 + jum3 + jum4;
	}

	@Override
	double computeAvg(int jum1, int jum2, int jum3) {
		return (jum1 + jum2 + jum3 + jum4)/4;
	}

}
