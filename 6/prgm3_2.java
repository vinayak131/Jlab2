import java.util.*;
import java.io.*;
interface stack
{
	void push(int a);
	void pop();
}
class DynamicArray implements stack
{
	int[] st;
	int top = -1, size;
	DynamicArray(int s)
	{
		size = s;
		st = new int [s];
	}
	public void push(int a)
	{
		top++;
		stackFull();
		st[top]=a;
	}
	public void pop()
	{
		
			System.out.println("Deleted element is:\t"+st[top]);
			top--;
	}
	void display()
	{
		int i;
		for(i=0;i<=top;i++)
			System.out.println(st[i]);
	}
	boolean stackFull()
	{
		if(top == size)
		{
			System.out.println("Increasing Stack Size\n");			
			int[] nstr = new int[size*2];
			for(int i =0; i<size;i++)
				nstr[i] = st[i];
			this.st = nstr;
			size = size*2;
			return true;
		}
		return false;
	}
	boolean stackEmpty()
	{
		if(top == -1)
		{
			System.out.print("No elements to delete.\nEmpty Stack\n");
			return true;
		}
		return false;
	}
}
class prgm3_2
{
	public static void main(String args[])
	{	
	int size;
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter the max size of stack:\t");
	size=ob.nextInt();
	DynamicArray obj = new DynamicArray(size);
	while(true)
	{
		System.out.println("\t\tChoose\n\t\t1. Add Element\n\t\t2. Delete Element\n\t\t3. Display\n\t\t4. Exit\n");
		System.out.print("Enter choice:\t");
		int choice=ob.nextInt();
		switch(choice)
		{
			case 1:System.out.println("Enter the element to add to array:\t");
				int a=ob.nextInt();
				obj.push(a);
				break;
			case 2:if(obj.stackEmpty())
					System.out.println("Stack is empty. Please add elements\n");
				else
					obj.pop();
				break;
			case 3:if(obj.stackEmpty())
					System.out.println("Stack is empty. Please add elements\n");
				else
				{
					System.out.println("The elements of stack are:\n");
					obj.display();
				}
				break;
			case 4:System.out.println("\n\t\tDestroying the stack. Values can no longer be accessible.\n\tThe Program is terminated\n");
				System.exit(0);
			default:System.out.println("Please Re-enter\n");
		}
	}
	}
}
