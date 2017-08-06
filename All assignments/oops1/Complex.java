
public class Complex {
int real,imag;
 Complex() 
{
	
	
imag=0;
real=0;
	
	
}
 Complex(int real,int imag) throws Exception
{
	 if(real<0)
		 throw new Exception("wrong choice");
	this.real=real;
	this.imag=imag;
}
 public void add(Complex c1,Complex c2)
{
	real=c1.real+c2.real;
	imag=c1.imag+c2.imag;
}
 public void sub(Complex c1,Complex c2)
 {
 	real=c1.real-c2.real;
 	imag=c1.imag-c2.imag;
 }
public void print()
{
	
	System.out.println(this);
}
@Override
public String toString()
{
	if(imag<0)
	 return String.format("%d%di", real,imag);
	else
		return String.format("%d+%di", real,imag);
}
}
