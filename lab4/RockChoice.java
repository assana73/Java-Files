/**
   A choice of Rock in Rock, Paper, Scissors, Lizard, Spock.
*/

public class RockChoice
   implements GameChoice
{
   public String toString()
   {
      return "Rock";
   }
   
   public boolean ties(GameChoice choice)
   { if(choice.isRock())
     { return true;   }
	 if(choice.isSpock())
	 { return false;   }
	 if(choice.isScissors())
	 { return false;   }
	 if(choice.isPaper())
	 { return false;   }
	 if(choice.isLizard())
	 { return false;   }
	 
	 return false;
   }

   public boolean beats(GameChoice choice)
   { if(choice.isRock())
     { return false;   }
	 if(choice.isSpock())
	 { return false;   }
	 if(choice.isScissors())
	 { return true;   }
	 if(choice.isPaper())
	 { return false;   }
	 if(choice.isLizard())
	 { return true;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   {  if(choice.isScissors())
	 { return " crushes ";   }
	 if(choice.isLizard())
	 { return " crushes ";   }
	 
	 return "";
   }
   
   boolean isRock()
   { return true;  }
   boolean isPaper()
   { return false;  }
   boolean isScissors()
   { return false;  }
   boolean isLizard()
   { return false;  }
   boolean isSpock()
   { return false;  }
}
