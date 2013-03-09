/**
   Represents a choice in Rock, Paper, Scissors, Lizard, Spock.
*/

public interface GameChoice
{
   /**
      Determines if this choice ties the argument choice.
      @param choice Other game choice.
      @return true for a tie, false otherwise
   */
   boolean ties(RockChoice choice);

   /**
      Determines if this choice ties the argument choice.
      @param choice Other game choice.
      @return true for a tie, false otherwise
   */
   boolean ties(PaperChoice choice);

   /**
      Determines if this choice ties the argument choice.
      @param choice Other game choice.
      @return true for a tie, false otherwise
   */
   boolean ties(ScissorsChoice choice);

   /**
      Determines if this choice ties the argument choice.
      @param choice Other game choice.
      @return true for a tie, false otherwise
   */
   boolean ties(LizardChoice choice);

   /**
      Determines if this choice ties the argument choice.
      @param choice Other game choice.
      @return true for a tie, false otherwise
   */
   boolean ties(SpockChoice choice);

   /**
      Determines if this choice beats the argument choice.
      @param choice Other game choice.
      @return true if this choice beats the argument choice, false otherwise.
   */
   boolean beats(RockChoice choice);

   /**
      Determines if this choice beats the argument choice.
      @param choice Other game choice.
      @return true if this choice beats the argument choice, false otherwise.
   */
   boolean beats(PaperChoice choice);

   /**
      Determines if this choice beats the argument choice.
      @param choice Other game choice.
      @return true if this choice beats the argument choice, false otherwise.
   */
   boolean beats(ScissorsChoice choice);

   /**
      Determines if this choice beats the argument choice.
      @param choice Other game choice.
      @return true if this choice beats the argument choice, false otherwise.
   */
   boolean beats(LizardChoice choice);

   /**
      Determines if this choice beats the argument choice.
      @param choice Other game choice.
      @return true if this choice beats the argument choice, false otherwise.
   */
   boolean beats(SpockChoice choice);

   /**
      Returns the manner in which this choice beats the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice beats the argument choice,
         the empty string otherwise.
   */
   String winVerb(RockChoice choice);

   /**
      Returns the manner in which this choice beats the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice beats the argument choice,
         the empty string otherwise.
   */
   String winVerb(PaperChoice choice);

   /**
      Returns the manner in which this choice beats the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice beats the argument choice,
         the empty string otherwise.
   */
   String winVerb(ScissorsChoice choice);

   /**
      Returns the manner in which this choice beats the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice beats the argument choice,
         the empty string otherwise.
   */
   String winVerb(LizardChoice choice);

   /**
      Returns the manner in which this choice beats the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice beats the argument choice,
         the empty string otherwise.
   */
   String winVerb(SpockChoice choice);


   /**
      Returns the manner in which this choice loses to the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice loses to the argument choice,
         the empty string otherwise.
   */
   String loseVerb(RockChoice choice);

   /**
      Returns the manner in which this choice loses to the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice loses to the argument choice,
         the empty string otherwise.
   */
   String loseVerb(PaperChoice choice);

   /**
      Returns the manner in which this choice loses to the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice loses to the argument choice,
         the empty string otherwise.
   */
   String loseVerb(ScissorsChoice choice);

   /**
      Returns the manner in which this choice loses to the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice loses to the argument choice,
         the empty string otherwise.
   */
   String loseVerb(LizardChoice choice);

   /**
      Returns the manner in which this choice loses to the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice loses to the argument choice,
         the empty string otherwise.
   */
   String loseVerb(SpockChoice choice);

}
