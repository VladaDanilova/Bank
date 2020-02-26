
public class Account extends AbstractBankAccount {

	// class variables
		String accountname;
	    int accountnum;
	    int balance;
	    private int bonusValue;
	    private AccountType type;
	    
	    //default constructor for Account
	  /*  Account()
	    {
	    	this.accountname="EMPTY";
	    	this.accountnum=0;
	    	this.balance=0;
	    } */
	    
	    //overloaded constructor for Account
	    Account(String name, int num,int amt, AccountType type)
	    {
	    	super(name, num, (amt + calculateInitialBonusValue(amt)));
	    	setaccountname(name);
	    	setaccountnum(num);
	    	setbalance(amt + calculateInitialBonusValue(amt));
	    	this.type = type;
	    	setType(AccountType.SAVINGS);
	    }
	    
	    private static int calculateInitialBonusValue(int amt) 
		{
			if(amt >= 1 && amt <= 100)
			return 10;
			else if(amt <= 300)
			return 20;
			else
			return 30;
			//endif
			}
	    
	    
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	if(amt>100)
	    		balance=balance+(amt + (int)(bonusValue * 0.1));
	    		else
	    		balance=balance+amt;
	    }
	    //make a withdrawal from the balance
	    public void withdraw(int amt)
	    {
	    	    balance=balance-amt;
	    }
	    //modifier to set the accountname
	    public void setaccountname(String name)
	    {
	    	    accountname = name;
	    }
	  //modifier to set the accountnumber
	    public void setaccountnum(int num)
	    {
	    	    accountnum = num;
	    }
	  //modifier to set the balance
	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }
	  //accessor to get the accountname
	    public String getaccountname ( ) {
	    	 
	    	return accountname;
	    }
	    
	  //accessor to get the accountnumber
	    public int getaccountnum ( ) {
	   	 
	    	return accountnum;
	    }
	  //accessor to get the account balance
	    public int getbalance ( ) {
	      	 
	    	return balance;
	    }
	    
	    public String getBankName() {
	    	
	    	return InterfaceBankAccount.BANK;
	    	
	    	}
	    
	    //print method 
	    public void print() {
	        System.out.println("\nBank Name : " + getBankName() +
	        		"\nAccount Holder : " + accountname +
	        		"\nAccount Number : " + accountnum +
	        		"\nAccount balance: " + balance);
	      }
	    
	    @Override
	    public String toString() {
	    return super.toString();
	    }//end method toString
	    
	  /*  @Override
		public String toString() {
		return super.toString();
	    } */
	}
