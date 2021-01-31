class Player
{
String name;
int age;
int jersy_no;
int no_of_matches;
	Player(String a,int b,int c,int d)
      {
	name=a;
	age=b;
	jersy_no=c;
	no_of_matches=d;
      }
	void display()
	{
 		System.out.println("NAME="+name+"\nAGE="+age+"\nJERSY NO.="+jersy_no+"\nNO. OF MATCHES"+no_of_matches);
	}
}

class Cricket_Player extends Player
{
int man_of_match;
	Cricket_Player(String a,int b,int c,int d,int e)
	{
 	super(a,b,c,d);
	man_of_match=e;
	}
		void displayC()
		{
			System.out.println("**********Information of  Cricket Player****************\n");
			super.display();
			System.out.println("NO. OF MAN OF MATCH AWARDS WON:"+man_of_match);
		}
}

class Football_Player extends Player
{
int goals_scored;
	Football_Player(String a,int b,int c,int d,int e)
	{
	 super(a,b,c,d);
	 goals_scored=e;
	}	
		void displayF()
		{
			System.out.println("*********Info: Football Player**********");
			super.display();
			System.out.println("NO. OF GOALS SCORED=\n"+goals_scored);
		}
}

class Hockey_Player extends Player
{
int red_cards;
		Hockey_Player(String a,int b,int c,int d,int e)
		{
		super(a,b,c,d);
		red_cards=e;
		}

		void displayH()
		{
			System.out.println("*************INFO: HOCKEY PLAYER****************");
			super.display();		
			System.out.println("NO. OF RED CARDS FACED\n"+red_cards);
		}
} 


class play
{
	public static void main(String args[])
	{
		Cricket_Player cr=new Cricket_Player("Sachin",42,99,420,200);
		Football_Player fb=new Football_Player("Ronaldo",37,46,200,199);
		Hockey_Player hc=new Hockey_Player("Dhanraj",45,23,432,21);
		
		cr.displayC();
		fb.displayF();
		hc.displayH();
	}
}
