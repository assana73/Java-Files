import java.util.Random;

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

   public GameChoice generateGameChoice()
   {
      return choices[rand.nextInt(choices.length)];
   }
}
