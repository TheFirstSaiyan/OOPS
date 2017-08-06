import java.util.Scanner;

public class RationalMain 
{
	public static void main(String[]args)
	{
	Scanner scanner=new Scanner(System.in);
	Rational r1=null,r2=null;
	double a,b;
	boolean flag=true;
	while(flag)
	{
	try {
		System.out.println("enter numerator aand denominator of r1");
	    a=scanner.nextDouble();
	    b=scanner.nextDouble();
		r1=new Rational(a,b);
		System.out.println("enter numerator aand denominator of r2");
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		r2=new Rational(a,b);
		Rational r3=new Rational();
		r3.add(r1, r2);
		System.out.println("the sum is");
		r3.display();
		Rational r4=new Rational();
		r4.sub(r1, r2);
		System.out.println("the difference is");
		r4.display();
		Rational r5=new Rational();
		r5.multiply(r1, r2);
		System.out.println("the product is");
		r5.display();
		Rational r6=new Rational();
		r6.divide(r1, r2);
		System.out.println("the difference is");
		r6.display();
		flag=false;
	} catch (Exception e) {
		System.out.println(e.getMessage());
		flag=true;
	}
	}
	
	}

}
