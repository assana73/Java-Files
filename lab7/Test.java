public class Test
{ public static void main(String [] args)
  { Jenga game1=new Jenga();
	Jenga game2=new Jenga();
	Jenga game3=new Jenga();
	
	for(int i=0;i<4;i++)
	{ game1.addLevel();
	  game2.addLevel();
	}
	game2.addSide();
	
	Check.check(game1.numLevel(),5);
	Check.check(game1.sum(),15);
	Check.check(game2.numLevel(),8);
	Check.check(game2.sum(),24);
	Check.check(game3.numLevel(),5);
	
  }
}