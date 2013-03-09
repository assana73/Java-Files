/**
   A choice of Lizard in Rock, Paper, Scissors, Lizard, Spock.
*/

public class LizardChoice
   implements GameChoice
{
   public String toString()
   {
      return "Lizard";
   }
   
   public boolean ties(GameChoice choice)
   { if(choice.isRock())
     { return false;   }
	 if(choice.isSpock())
	 { return false;   }
	 if(choice.isScissors())
	 { return false;   }
	 if(choice.isPaper())
	 { return false;   }
	 if(choice.isLizard())
	 { return true;   }
	 
	 return false;
   }

   public boolean beats(GameChoice choice)
   { if(choice.isRock())
     { return false;   }
	 if(choice.isSpock())
	 { return true;   }
	 if(choice.isScissors())
	 { return false;   }
	 if(choice.isPaper())
	 { return true;   }
	 if(choice.isLizard())
	 { return false;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   { if(choice.isSpock())
	 { return " poisons ";   }
	 if(choice.isPaper())
	 { return " eats ";   }
	 
	 return "";
   }
   
   boolean isRock()
   { return false;  }
   boolean isPaper()
   { return false;  }
   boolean isScissors()
   { return false;  }
   boolean isLizard()
   { return true;  }
   boolean isSpock()
   { return false;  }

}
