/**
   Represents a choice in Rock, Paper, Scissors, Lizard, Spock.
*/

public interface GameChoice
{
   boolean ties(GameChoice choice);
   boolean beats(GameChoice choice);
   String winVerb(GameChoice choice);

   boolean isRock();
   boolean isPaper();
   boolean isScissors();
   boolean isLizard();
   boolean isSpock();
}