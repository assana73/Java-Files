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
   { if(choice instanceof RockChoice)
     { return false;   }
	 if(choice instanceof SpockChoice)
	 { return false;   }
	 if(choice instanceof ScissorsChoice)
	 { return false;   }
	 if(choice instanceof PaperChoice)
	 { return false;   }
	 if(choice instanceof LizardChoice)
	 { return true;   }
	 
	 return false;
   }

   public boolean beats(GameChoice choice)
   { if(choice instanceof RockChoice)
     { return false;   }
	 if(choice instanceof SpockChoice)
	 { return true;   }
	 if(choice instanceof ScissorsChoice)
	 { return false;   }
	 if(choice instanceof PaperChoice)
	 { return true;   }
	 if(choice instanceof LizardChoice)
	 { return false;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   { if(choice instanceof SpockChoice)
	 { return " poisons ";   }
	 if(choice instanceof PaperChoice)
	 { return " eats ";   }
	 
	 return "";
   }

}
