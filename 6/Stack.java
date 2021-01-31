 interface IntStck
{
  void push(int item);
  int pop();
}

class DynStck implements IntStck
{
 private int stck[];
 private int tos;

 DynStck(int size)
 {
  stck=new int[size];
  tos=-1;
 }
		public void push(int item)
		{
			 if(tos==stck.length-1)
			 {
			  int temp[]=new int[stck.length*2];
			  for(int i=0;i<stck.length;i++)
			     temp[i]=stck[i];
			  stck=temp;
			  stck[++tos]=item;
			 }
			 else
			  stck[++tos]=item;
		}

public int pop()
{
  if(tos<0)
 {
   System.out.println("stack underflow");
   return 0;
 }
 else
 return stck[tos--];
}
}

class Stack
{
	  public static void main(String args[])
	  {
	    DynStck mystack1 =new DynStck(5);
	    DynStck mystack2 = new DynStck(8);
	   
	   for(int i=0;i<5;i++)
	   mystack1.push(i);

	   for(int i=0;i<20;i++) 
	   mystack2.push(i);

	  System.out.println("Stack in mystack1: ");
	  for(int i=0;i<5;i++)  
	  System.out.println(mystack1.pop());

	  System.out.println("Stack in mystack2: ");
	  for(int i=0;i<20;i++)  
	  System.out.println(mystack2.pop());
	 }
}

 
