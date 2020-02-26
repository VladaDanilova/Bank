
public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
   /* Account A1 = new Account("Sanjay Gupta",11556,300);
    	// Using default constructor
	Account A2 = new Account();
	Account A3 = new Account();
	
	//Set values of Instances created using default constructor
	A2.setaccountname("He Xai");
	A2.setaccountnum(22338);
	A2.setbalance(500);
	
	A3.setaccountname("Ilya Mustafana");
	A3.setaccountnum(44559);
	A3.setbalance(1000);
	
	// Print accounts
	A1.print();
	A2.print();
	A3.print();*/
	
	// Instantiate 3 accounts
	// Using constructor with values
	Account a1 = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
	Account a2 = new Account("He Xai",22338,500, AccountType.SAVINGS);
	Account a3 = new Account("Ilya Mustafana",44559,1000, AccountType.SAVINGS);
	// Print accounts
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println("TEST");
	JavaBank.displayAccountDetails(a1);
	

}
}
