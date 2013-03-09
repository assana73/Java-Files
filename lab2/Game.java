/**
   Primary class to initiate a game with a gui interface.
*/
public class Game
{
   public static void main(String [] args)
   {
      GameLogic logic = new PlayerVsComputerGameLogic();
      GameView view = new GUIGameView(logic);
      logic.setView(view);
   }
}
