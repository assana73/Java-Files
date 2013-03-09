/**
   Interface for classes that manage the game logic for variants of
   Rock, Paper, Scissors, Lizard, Spock.
*/
public interface GameLogic
{
   /**
      Sets the view that is used to display the user-interface of this game.
   */
   void setView(GameView view);

   /**
      Select Rock as the player choice.
   */
   void selectRock();

   /**
      Select Paper as the player choice.
   */
   void selectPaper();

   /**
      Select Scissors as the player choice.
   */
   void selectScissors();

   /**
      Select Lizard as the player choice.
   */
   void selectLizard();

   /**
      Select Spock as the player choice.
   */
   void selectSpock();
}
