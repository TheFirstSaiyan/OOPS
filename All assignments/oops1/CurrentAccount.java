
public class CurrentAccount extends Account {

	float rate=15;
	CurrentAccount(String first,String second,int year,double prin,int aNo) throws Exception
	{
	super(first,second,aNo,prin,year);
	}
	@Override
	public void calculateInterest()
	{
		System.out.println(principle*year*rate/100);
	}
	public void display()
	{
		System.out.println("details: \nname: "+firstName+lastName+"\n"+"account type : current"+"\n"+"years:"+year);
	}
}
