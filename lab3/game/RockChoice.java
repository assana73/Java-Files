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
   { if(choice instanceof RockChoice)
     { return true;   }
	 if(choice instanceof SpockChoice)
	 { return false;   }
	 if(choice instanceof ScissorsChoice)
	 { return false;   }
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
	 { return true;   }
	 if(choice instanceof PaperChoice)
	 { return false;   }
	 if(choice instanceof LizardChoice)
	 { return true;   }
	 
	 return false;
   }

   public String winVerb(GameChoice choice)
   {  if(choice instanceof ScissorsChoice)
	 { return " crushes ";   }
	 if(choice instanceof LizardChoice)
	 { return " crushes ";   }
	 
	 return "";
   }
}
