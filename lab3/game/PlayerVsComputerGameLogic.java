public class PlayerVsComputerGameLogic
   implements GameLogic
{
   private GameView view;
   private Player rp;

   public PlayerVsComputerGameLogic()
   {
      view = new EmptyGameView();
       rp = new RandomPlayer();
   }

   public void setView(GameView view)
   {
      this.view = view;
   }

   public void selectRock()
   {
      GameChoice playerChoice = new RockChoice();
      GameChoice otherChoice = rp.generateGameChoice();

      displayWinner(otherChoice, playerChoice);
   }

   public void selectPaper()
   {
      GameChoice playerChoice = new PaperChoice();
      GameChoice otherChoice = rp.generateGameChoice();

      displayWinner(otherChoice, playerChoice);
   }

   public void selectScissors()
   {
      GameChoice playerChoice = new ScissorsChoice();
      GameChoice otherChoice = rp.generateGameChoice();

      displayWinner(otherChoice, playerChoice);
   }

   public void selectLizard()
   {
      GameChoice playerChoice = new LizardChoice();
      GameChoice otherChoice = rp.generateGameChoice();

      displayWinner(otherChoice, playerChoice);
   }

   public void selectSpock()
   {
      GameChoice playerChoice = new SpockChoice();
      GameChoice otherChoice = rp.generateGameChoice();

      displayWinner(otherChoice, playerChoice);
   }

   private void displayWinner(GameChoice otherChoice, GameChoice playerChoice)
   {
      if (otherChoice.ties(playerChoice))
      {
         view.tie(playerChoice, otherChoice);
      }
      else if (otherChoice.beats(playerChoice))
      {
         view.playerLoses(playerChoice, otherChoice,
            otherChoice.winVerb(playerChoice));
      }
      else
      {
         view.playerWins(playerChoice, otherChoice,
            playerChoice.winVerb(otherChoice));
      }
   }
}
