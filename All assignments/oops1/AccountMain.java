
public class AccountMain {
public static void main(String[]args)
{
	try
	{
	SavingsAccount savingsAccount=new SavingsAccount(20,"hari","naaraayan",4,1000,1234);
	CurrentAccount currentAccount=new CurrentAccount("hari","naaraayan",3,2000,1234);
	savingsAccount.display();
	System.out.print("SI for savings Account is ");
	savingsAccount.calculateInterest();
	currentAccount.display();
	System.out.print("SI for current Account is ");
    currentAccount.calculateInterest();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

}
}
