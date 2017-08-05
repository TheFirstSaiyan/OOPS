
public class ComplexMain {
	public static void main(String[] args)
	{
		Complex c1=new Complex(12,14);
		Complex c2=new Complex(1,-5);
		c1.print();c2.print();
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
