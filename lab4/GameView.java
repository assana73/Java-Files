public interface GameView
{
   void playerWins(GameChoice player, GameChoice other, String winVerb);
   void tie(GameChoice player, GameChoice other);
   void playerLoses(GameChoice player, GameChoice other, String winVerb);
}

