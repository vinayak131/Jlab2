class Shape
{
	double lnt,bdt,a;
	Shape(double l)
	{
		lnt=l;
	}
	Shape(double l,double b)
	{
		lnt=l;
		bdt=b;
	}
	
	void area(double l)
	{
		a=l*l;
		System.out.println("Area length="+a);
	}
	void area(double l,double b)
	{
		a=l*b;
		System.out.println("Area of Rectangle is="+a);
			}
}
class overload
{
	public static void main(String args[])	
	{
		Shape s1=new Shape(5.000);
		Shape s2=new Shape(5.000,6.000);

		s1.area(s1.lnt);
		s2.area(s2.lnt,s2.bdt);
	
		/*System.out.println("Now if we pass only the length for Rectangle");
		s2.area(s2.lnt);*/
	}
}
		
