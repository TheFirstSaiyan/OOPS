import java.util.Scanner;

public class ComplexMain {
	public static void main(String[] args) 
	{
		Complex c1 = null;
		 Complex c2 = null;
		 boolean flag=true;
		 while(flag)
		 {
		try{
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter c1");
			int a=scanner.nextInt();
			int  b=scanner.nextInt();
			c1=new Complex(a,b);
			System.out.println("enter c2");
			a=scanner.nextInt();
			b=scanner.nextInt();
		    c2=new Complex(a,b);
		    c1.print();c2.print();
		    flag=false;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			flag=true;
			
		}
		 }
		Complex c3=new Complex();
		c3.add(c1, c2);
		System.out.println("the sum is ");
		c3.print();
		Complex c4=new Complex();
		System.out.println("the difference is ");
		c4.sub(c1,c2);
		c4.print();
		
		
	}

}
