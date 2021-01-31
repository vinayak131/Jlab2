import java.io.*;
import java.lang.*;
import java.util.Scanner;

interface stack
{
 int size=10;
 
 void push(int n);
 int pop();
}

class Istack implements stack
{
 int a[]=new int[10];
 int top;
 Istack()
 {
  top=-1;
 }

 public void push(int n)
 {
  if(top>=size)
  System.out.println("Stack Full");
  else
  {
   top++;
   a[top]=n;
  }
 }

 public int pop()
 {
  
  int t=a[top];
  top=top-1;
  return(t);
  
 }
}

class Appstack
{
 public static void main(String args[])
 {
  int a,b,i;
  Istack s=new Istack();
  Scanner myscan=new Scanner(System.in);
  System.out.println("---------------Stack operations\n------------------");
  
  for(;;)
  {
   System.out.println("1:PUSH\n2:POP\n3:DISPLAY\n4:EXIT");
   System.out.println("Enter your choice");
   int p=myscan.nextInt();
   switch(p)
   {
    case 1 :
            System.out.println("Enter the element to pushed");
            a=myscan.nextInt();
            s.push(a);
            break;
   case 2 :
           if(s.top==-1)
           System.out.println("Stack Underflow");
           else
           System.out.println("Poped element is "+s.pop());
           break;   
  case 3 :
          if(s.top==-1)
          System.out.println("Stack Empty");
          else
          for(i=0;i<=s.top;i++)
          System.out.println(s.a[i]);
          break;
 case 4 :
          break;
   }
   if(p>3)
   break;
 }
}
}  
