
public enum AccountType {
	//CURRENT("CU", 1.0),
	SAVINGS,
	//DEPOSIT, 
	CREDIT;
	private String code;
	private double rate;
	
	private AccountType(/*String code, double rate*/){
	//this.code = code;
	//this.rate = rate;
	}
	public String getCode() {
	return code;
	}
	
	public double getRate() {
		return rate;
		}
}
