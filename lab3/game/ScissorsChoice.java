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
   { if(choice instanceof RockChoice)
     { return false;   }
	 if(choice instanceof SpockChoice)
	 { return false;   }
	 if(choice instanceof ScissorsChoice)
	 { return true;   }
	 if(choice instanceof PaperChoice)
	 { return false;   }
	 if(choice instanceof LizardChoice)
	 { return false;   }
	 
	 return false;
   }

   public boolean beats(GameChoice choice)
   { if(choice instanceof RockChoice)
     { return false;   }
	 if(choice instanceof SpockChoice)
	 { return false;   }
	 if(choice instanceof ScissorsChoice)
	 { return false;   }
	 if(choice instanceof PaperChoice)
	 { return true;   }
	 if(choice instanceof LizardChoice)
	 { return true;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   { if(choice instanceof PaperChoice)
	 { return " cuts ";   }
	 if(choice instanceof LizardChoice)
	 { return " decapitates ";   }
	 
	 return "";
   }
}
