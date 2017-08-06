
public class SavingsAccount extends Account{
	float rate;
	SavingsAccount(int rate,String first,String second,int year,double prin,int aNo) throws Exception
	{
	super(first,second,aNo,prin,year);
	
	this.rate=rate;
	}
	@Override
	public void calculateInterest()
	{
		System.out.println(principle*year*rate/100);
	}
	public void display()
	{
		System.out.println("details: \nname: "+firstName+lastName+"\n"+"account type : savings"+"\n"+"years:"+year);
	}
}
