import java.util.ArrayList; 

public class CustomerAccount  {
   
	  private String number;
	  private double balance;
	  
	private ArrayList<AccountTransaction> transactionList;

	//Blank Constructor
	public CustomerAccount()
	{
		this.number = "";
		this.balance = 0;
		this.transactionList = new ArrayList<>();
	}
	
	//Constructor with Details
	public CustomerAccount(String number, double balance, ArrayList<AccountTransaction> transactionList)
	{
		this.number = number;
		this.balance = balance;
        this.transactionList = (transactionList == null) ? new ArrayList<>() : transactionList;
	}
	
	//Accessor methods
	
	public String getNumber()
	{
		return this.number;
	}
	
	

	
	public double getBalance()
	{
		return this.balance;
	}
	
	public ArrayList <AccpuntTransaction> getTransactionList()
	{
		return this.transactionList;
	}

	//Mutator methods
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setTransactionList(ArrayList<AccountTransaction> transactionList)
	{
		this.transactionList = (transactionList == null) ? new ArrayList<>() : transactionList;
	}
	
	
	
}
