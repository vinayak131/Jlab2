package Balance;
public class Balance
{
String Ac_no;
String Name;
float deposit;
float Balance=10000;
public Balance(String a,String b,float c)
{
Name=b;
Balance+=c;
Ac_no=a;
}
public void display()
{
if(Balance>0)
System.out.println("ACCOUNT NUMBER="+Ac_no+"\nNAME="+Name+"\nBALANCE="+Balance);
else
System.out.println("ACCOUNT IS EMPTY\n");
}
}
