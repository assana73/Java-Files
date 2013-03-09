/**
   A choice of Scissors in Rock, Paper, Scissors, Lizard, Spock.
*/

public class ScissorsChoice
   implements GameChoice
{
   public String toString()
   {
      return "Scissors";
   }
   public boolean ties(GameChoice choice)
   { if(choice.isRock())
     { return false;   }
	 if(choice.isSpock())
	 { return false;   }
	 if(choice.isScissors())
	 { return true;   }
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
	 { return false;   }
	 if(choice.isPaper())
	 { return true;   }
	 if(choice.isLizard())
	 { return true;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   { if(choice.isPaper())
	 { return " cuts ";   }
	 if(choice.isLizard())
	 { return " decapitates ";   }
	 
	 return "";
   }
   
   boolean isRock()
   { return false;  }
   boolean isPaper()
   { return false;  }
   boolean isScissors()
   { return true;  }
   boolean isLizard()
   { return false;  }
   boolean isSpock()
   { return false;  }
}
