/**
   A choice of Spock in Rock, Paper, Scissors, Lizard, Spock.
*/

public class SpockChoice
   implements GameChoice
{
   public String toString()
   {
      return "Spock";
   }
   
   public boolean ties(RockChoice choice)
   {  return false;  }

   public boolean ties(PaperChoice choice)
   {  return false;  }

   public boolean ties(ScissorsChoice choice)
   {  return false;  }

   public boolean ties(LizardChoice choice)
   {  return false;  }

   public boolean ties(SpockChoice choice)
   {  return true;  }

   public boolean beats(RockChoice choice)
   {  return true;  }

   public boolean beats(PaperChoice choice)
   {  return false;  }

   public boolean beats(ScissorsChoice choice)
   {  return true;  }

   public boolean beats(LizardChoice choice)
   {  return false;  }

   public boolean beats(SpockChoice choice)
   {  return false;  }

   public String winVerb(RockChoice choice)
   {  return " vaporizes ";  }

   public String winVerb(PaperChoice choice)
   {  return "";   }

   public String winVerb(ScissorsChoice choice)
   {  return " crushes ";  }

   public String winVerb(LizardChoice choice)
   {  return "";   }

   public String winVerb(SpockChoice choice)
   {  return "";   }

   public String loseVerb(RockChoice choice)
   {  return "";   }

   public String loseVerb(PaperChoice choice)
   {  return " disproves ";  }

   public String loseVerb(ScissorsChoice choice)
   {  return "";   }

   public String loseVerb(LizardChoice choice)
   {  return " poisons ";  }

   public String loseVerb(SpockChoice choice)
   {  return "";   }

}
