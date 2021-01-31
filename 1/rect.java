import java.util.Scanner;
class Rectangle
{
double width,length,area;
String color;
void set_length()
{
Scanner ob= new Scanner(System.in);
System.out.println("\n Enter the Area of Length:");
length=ob.nextDouble();
}
void set_width()
{
Scanner ob= new Scanner(System.in);
System.out.println("\n Enter the Area of Width:");
width=ob.nextDouble();
}
void set_color()
{
Scanner ob= new Scanner(System.in);
System.out.println("\n Enter the Area of Color:");
color=ob.next();
}
double find_area()
{
area=length*width;
return area;
}
void compare(Rectangle ob)
{
if(area==ob.area && color.equals(ob.color))
System.out.println("Matching Rectangle\n");
else
System.out.println("Non Matching Rectangles\n");
} 
} 
 class rect
{
public static void main(String args[])
{
double area;
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();

System.out.println("Enter the 1st Area dimension\n");
r1.set_length();
r1.set_width();
r1.set_color();
area=r1.find_area();
System.out.println("\n2nd Area Rectangle:"+area);

System.out.println("Enter the 2nd Area dimension\n");
r2.set_length();
r2.set_width();
r2.set_color();
area=r2.find_area();
System.out.println("\n2nd Area Rectangle:"+area);

r1.compare(r2);
}
}                                  
