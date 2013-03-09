/**
   A GameView that provides empty actions for each method.
*/
public class EmptyGameView
   implements GameView
{
   /**
      Does nothing when the player wins.
      @param player The player's choice.
      @param other The opponent's choice.
      @param winVerb The manner in which the player wins.
   */
   public void playerWins(GameChoice player, GameChoice other, String winVerb)
   { 
   }

   /**
      Does nothing when the players tie.
      @param player The player's choice.
      @param other The opponent's choice.
   */
   public void tie(GameChoice player, GameChoice other)
   {
   }

   /**
      Does nothing when the player loses.
      @param player The player's choice.
      @param other The opponent's choice.
      @param winVerb The manner in which the opponent wins.
   */
   public void playerLoses(GameChoice player, GameChoice other, String winVerb)
   {
   }
}

