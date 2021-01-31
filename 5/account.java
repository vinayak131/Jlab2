import Balance.*;
class account
{
public static void main(String args[])
{
Balance current[]=new Balance[3];
current[0]=new Balance("SBI1234","Eshan",1234);
current[1]=new Balance("SBI5678","Archan",-5678);
current[2]=new Balance("SBI9012","Chandan",1234);
for(int i=0;i<3;i++)
current[i].display();
}
}
