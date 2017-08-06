
public class Account {
	int accountNumber,year;
	double principle;
	String firstName,lastName;
	Account() throws Exception
	{
		this(null,null,1,1,1);
	}
	Account(String first,String second,int aNo,double prin,int y)throws Exception
	{
		if(y<1||prin<=0)
			throw new Exception("invalid details");
		accountNumber=aNo;
		principle=prin;
		year=y;
		firstName=first;
		lastName=second;
	}

	public void calculateInterest()
	{}
	

}
