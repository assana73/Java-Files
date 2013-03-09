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
   
   public boolean ties(RockChoice choice)
   {  return false;  }

   public boolean ties(PaperChoice choice)
   {  return true;  }

   public boolean ties(ScissorsChoice choice)
   {  return false;  }

   public boolean ties(LizardChoice choice)
   {  return false;  }

   public boolean ties(SpockChoice choice)
   {  return false;  }

   public boolean beats(RockChoice choice)
   {  return true;  }

   public boolean beats(PaperChoice choice)
   {  return false;  }

   public boolean beats(ScissorsChoice choice)
   {  return false;  }

   public boolean beats(LizardChoice choice)
   {  return false;  }

   public boolean beats(SpockChoice choice)
   {  return true;  }

   public String winVerb(RockChoice choice)
   {  return " covers ";  }

   public String winVerb(PaperChoice choice)
   {  return "";   }

   public String winVerb(ScissorsChoice choice)
   {  return "";   }

   public String winVerb(LizardChoice choice)
   {  return "";   }

   public String winVerb(SpockChoice choice)
   {  return " disproves ";  }

   public String loseVerb(RockChoice choice)
   {  return "";   }

   public String loseVerb(PaperChoice choice)
   {  return "";   }

   public String loseVerb(ScissorsChoice choice)
   {  return " cuts ";  }

   public String loseVerb(LizardChoice choice)
   {  return " eats ";  }

   public String loseVerb(SpockChoice choice)
   {  return "";   }

}
