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
   { if(choice instanceof RockChoice)
     { return false;   }
	 if(choice instanceof SpockChoice)
	 { return false;   }
	 if(choice instanceof ScissorsChoice)
	 { return false;   }
	 if(choice instanceof PaperChoice)
	 { return true;   }
	 if(choice instanceof LizardChoice)
	 { return false;   }
	 
	 return false;
   }

   public boolean beats(GameChoice choice)
   { if(choice instanceof RockChoice)
     { return true;   }
	 if(choice instanceof SpockChoice)
	 { return true;   }
	 if(choice instanceof ScissorsChoice)
	 { return false;   }
	 if(choice instanceof PaperChoice)
	 { return false;   }
	 if(choice instanceof LizardChoice)
	 { return false;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   { if(choice instanceof RockChoice)
     { return " covers ";   }
	 if(choice instanceof SpockChoice)
	 { return " disproves ";   }
	 
	 return "";
   }
}
