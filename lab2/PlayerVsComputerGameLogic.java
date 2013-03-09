/**
   Implementation of game logic to support a computer (random) player.
*/
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

   /**
      Sets the view that is used to display the user-interface of this game.
   */
   public void setView(GameView view)
   {
      this.view = view;
   }

   /**
      Select Rock as the player choice.
   */
   public void selectRock()
   {
      RockChoice playerChoice = new RockChoice();
      GameChoice otherChoice = rp.generateGameChoice();

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
            otherChoice.loseVerb(playerChoice));
      }
   }

   /**
      Select Paper as the player choice.
   */
   public void selectPaper()
   {
      PaperChoice playerChoice = new PaperChoice();
      GameChoice otherChoice = rp.generateGameChoice();

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
            otherChoice.loseVerb(playerChoice));
      }
   }

   /**
      Select Scissors as the player choice.
   */
   public void selectScissors()
   {
      ScissorsChoice playerChoice = new ScissorsChoice();
      GameChoice otherChoice = rp.generateGameChoice();

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
            otherChoice.loseVerb(playerChoice));
      }
   }

   /**
      Select Lizard as the player choice.
   */
   public void selectLizard()
   {
      LizardChoice playerChoice = new LizardChoice();
      GameChoice otherChoice = rp.generateGameChoice();

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
            otherChoice.loseVerb(playerChoice));
      }
   }

   /**
      Select Spock as the player choice.
   */
   public void selectSpock()
   {
      SpockChoice playerChoice = new SpockChoice();
      GameChoice otherChoice = rp.generateGameChoice();

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
            otherChoice.loseVerb(playerChoice));
      }
   }
}
