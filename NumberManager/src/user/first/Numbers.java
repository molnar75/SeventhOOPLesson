package user.first;

public class Numbers {
	
	double treshold = 0.001;
	private double realNum;
		
	public Numbers(double realNum) {
		super();
		this.realNum = realNum;
	}

	public double getRealNum() {
			return realNum;
	}

	public void setRealNum(double realNum) {
		this.realNum = realNum;
	}
		
	public boolean isInTreshold(double number){
		
		if(Math.abs(realNum-number)<treshold ){
			return true;
		}else
			return false;
	}

}
