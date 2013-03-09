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
   public boolean ties(RockChoice choice)
   {  return false;  }

   public boolean ties(PaperChoice choice)
   {  return false;  }

   public boolean ties(ScissorsChoice choice)
   {  return true;  }

   public boolean ties(LizardChoice choice)
   {  return false;  }

   public boolean ties(SpockChoice choice)
   {  return false;  }

   public boolean beats(RockChoice choice)
   {  return false;  }

   public boolean beats(PaperChoice choice)
   {  return true;  }

   public boolean beats(ScissorsChoice choice)
   {  return false;  }

   public boolean beats(LizardChoice choice)
   {  return true;  }

   public boolean beats(SpockChoice choice)
   {  return false;  }

   public String winVerb(RockChoice choice)
   {  return "";   }

   public String winVerb(PaperChoice choice)
   {  return " cuts ";   }

   public String winVerb(ScissorsChoice choice)
   {  return "";   }

   public String winVerb(LizardChoice choice)
   {  return " decapitates ";   }

   public String winVerb(SpockChoice choice)
   {  return "";   }

   public String loseVerb(RockChoice choice)
   {  return " crushes ";   }

   public String loseVerb(PaperChoice choice)
   {  return "";   }

   public String loseVerb(ScissorsChoice choice)
   {  return "";   }

   public String loseVerb(LizardChoice choice)
   {  return "";   }

   public String loseVerb(SpockChoice choice)
   {  return " crushes ";   }

}
