
public class CreditAccount extends AbstractBankAccount{

	private int creditLimit;
	
	//default constructor for CreditAccount
	
/*	CreditAccount()
    {
    	super();
    	this.creditLimit=100;
    } */
	//overloaded constructor for CreditAccount
	CreditAccount(String name, int num,int amt)
    {
            super(name,num,amt);
            this.creditLimit=calculateCreditLimit(amt);
            setType(AccountType.CREDIT);
            
    }
	//modifier to set the account creditlimit
	 public void setcreditlimit(int num)
	    {
	    	    creditLimit = num;
	    }
	//accessor to get the account creditlimit
	 public int getcreditlimit ( ) {
	   	 
	    	return creditLimit;
	    }
	 //print method 
	 public void print() {
		 System.out.println("\nBank Name : " + getBankName() +
				 "\nAccount Holder : " + accountname +
				 "\nAccount Number : " + accountnum +
				 "\nAccount balance: " + balance +
				 "\nCredit Limit : " + creditLimit+
		 "\nAccount Type: "+getType());
	      }
	 @Override
	 public void deposit(int amt) {
	 balance=balance+amt;
	 }//end method deposit
	 
	 private static int calculateCreditLimit(int amt) {
	    	if(amt>1 && amt<=2000)
	    	return 100;
	    	else if(amt<=4000)
	    	return 200;
	    	else
	    	return 300;
	    	//endif
	    	}
	@Override
	public int getbalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
	return super.toString() +
	"\nCredit Limit : " + creditLimit;
	}//end method toStrin
}
