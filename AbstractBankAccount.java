
public abstract class AbstractBankAccount {

	public final String BANK= "JavaBank";
	
	
	protected String accountname;
	protected int accountnum;
	protected int balance;
	private AccountType type;
	
	public String getBankName(){
	return BANK;
	}
	public String getAccountName(){
		return accountname;
	}
	public void setAccountName(String name){/*code*/}
	public int getAccountNum(){
		return accountnum;
	}
	public void setAccountNum(int num){/*code*/}
	public int getBalance(){
		return balance;
	}
	
	//constructor for AbstractBankAccount
	public AbstractBankAccount(String name, int num, int amt)
	{
	accountname=name;
	accountnum=num;
	balance=amt;
	}
	
	
	public void setBalance(int num){/*code*/}
	public void withdraw(int amt ){/*code*/}
	
	public abstract void deposit(int amt);
	//public abstract void withdraw(int amt);
	public abstract int getbalance();
	//public abstract String getBankName();
	
	@Override
	public String toString()
	{
	return "\n\nBank Name : " + getBankName() +
	"\nAccount Holder : " + accountname +
	"\nAccount Number : " + accountnum +
	"\nAccount balance: " + balance+
	"\nAccount Type : " + this.getType() ;
	}//end method toString
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	
}
