import java.util.Random;

/**
   Implements a Player to select a choice at random.
*/
public class RandomPlayer
   implements Player
{
   private Random rand = new Random();

   private GameChoice [] choices = {
        new RockChoice(), 
        new PaperChoice(), 
        new ScissorsChoice(), 
        new LizardChoice(), 
        new SpockChoice()
      };

   /**
      Returns a new choice selected at random.
   */
   public GameChoice generateGameChoice()
   {
      return choices[rand.nextInt(choices.length)];
   }
}
