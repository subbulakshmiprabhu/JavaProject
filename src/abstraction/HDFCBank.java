package abstraction;

public class HDFCBank extends Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC banks rate of interest");
		
	}

	
	public void hdfcMethod() {
		System.out.println("hdfcMethod");
	}
	
	public static void main(String[] args) {
		HDFCBank h = new HDFCBank();
		h.rateOfInterest();
		h.hdfcMethod();
	}
}
