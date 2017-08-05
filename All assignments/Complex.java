import java.util.*;
public class Complex {
int real,imag;
 Complex()
{
	
	
	this(0,0);
	
	
}
 Complex(int real,int imag)
{
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
