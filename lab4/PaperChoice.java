/**
   A choice of Paper in Rock, Paper, Scissors, Lizard, Spock.
*/

public class PaperChoice
   implements GameChoice
{
   public String toString()
   {
      return "Paper";
   }
   public boolean ties(GameChoice choice)
   { if(choice.isRock())
     { return false;   }
	 if(choice.isSpock())
	 { return false;   }
	 if(choice.isScissors())
	 { return false;   }
	 if(choice.isPaper())
	 { return true;   }
	 if(choice.isLizard())
	 { return false;   }
	 
	 return false;
   }

   public boolean beats(GameChoice choice)
   { if(choice.isRock())
     { return true;   }
	 if(choice.isSpock())
	 { return true;   }
	 if(choice.isScissors())
	 { return false;   }
	 if(choice.isPaper())
	 { return false;   }
	 if(choice.isLizard())
	 { return false;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   { if(choice.isRock())
     { return " covers ";   }
	 if(choice.isSpock())
	 { return " disproves ";   }
	 
	 return "";
   }
   
   boolean isRock()
   { return false;  }
   boolean isPaper()
   { return true;  }
   boolean isScissors()
   { return false;  }
   boolean isLizard()
   { return false;  }
   boolean isSpock()
   { return false;  }
}
