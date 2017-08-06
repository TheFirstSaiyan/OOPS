
public class Rational {

	private double num,den;
	Rational()
	{}
	Rational(double n,double d)throws Exception
	{
		if(d==0)
			throw new IllegalArgumentException("cannot have zero as denominator");
		else
		{
			num=n;
			den=d;
		}
	}
	public double findHCF(double d1,double d2)
	
	{
		double a=Math.abs(d1);
		double b=Math.abs(d2);
if(a==0)
{
	if(d1<0&&d2<0||d1>0&&d2>0)
	return d2;
	else 
		return -1*d2;
}
if(b==0)
{
	if(d1<0&&d2<0||d1>0&&d2>0)
		return d1;
		else 
			return -1*d1;
}
if(a<b)
{
	return findHCF((b%a),a);	
}
else
	return findHCF(b,(a%b));
		 
	}
	public void display()
	{
		
		
		Rational result=new Rational();
		result=simplify(this);

		System.out.println(result.num+"/"+result.den);
	}
	public void add(Rational r1,Rational r2)
	{
		double lcm=r1.den*r2.den/findHCF(r1.den,r2.den);
				
		num=r1.num*lcm/r1.den + r2.num*lcm/r2.den;
		
		den=lcm;
	
		
	}
	public void sub(Rational r1,Rational r2)
	{
		double lcm=r1.den*r2.den/findHCF(r1.den,r2.den);
		
		num=r1.num*lcm/r1.den - r2.num*lcm/r2.den;
		
		den=lcm;

		
		
	}
	public void divide(Rational r1,Rational r2)
	{
		num=r1.num*r2.den;
		den=r1.den*r2.num;
	}
	public void multiply(Rational r1,Rational r2)
	{
		num=r1.num*r2.num;
		den=r1.den*r2.den;
	}
	public Rational simplify(Rational r)
	{
		
			
		double hcf=findHCF(r.num,r.den);
		r.num=r.num/hcf;
		r.den=r.den/hcf;
		if(r.num<0&&r.den<0)
		{
			r.num=-1*r.num;
		    r.den=-1*r.den;
		}
		
		else if(r.den<0){
		      r.num*=-1;
		      r.den=Math.abs(r.den);
			}
		
		
		return r;

			}
}
			
				
		
		
	
	
	

