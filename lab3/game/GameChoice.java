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
   boolean ties(GameChoice choice);

   /**
      Determines if this choice beats the argument choice.
      @param choice Other game choice.
      @return true if this choice beats the argument choice, false otherwise.
   */
   boolean beats(GameChoice choice);

   /**
      Returns the manner in which this choice beats the argument choice.
      @param choice Other game choice.
      @return Descriptive string if this choice beats the argument choice,
         the empty string otherwise.
   */
   String winVerb(GameChoice choice);
}
