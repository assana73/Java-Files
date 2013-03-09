import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIGameView
   implements GameView
{
   private static final int WIDTH = 500;
   private static final int HEIGHT = 250;
   private static final String TITLE = "Rock, Paper, Scissors, Lizard, Spock";

   private GameLogic logic;
   private JLabel outcomeStatusLabel, outcomeDetailLabel;

   public GUIGameView(GameLogic logic)
   {
      this.logic = logic;
      JFrame frame = createFrame();

      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

      JPanel buttonPanel = new JPanel();
      addButtons(buttonPanel);
      mainPanel.add(buttonPanel);

      JPanel outcomePanel = new JPanel();
      outcomeStatusLabel = new JLabel();
      outcomePanel.add(outcomeStatusLabel);
      outcomeDetailLabel = new JLabel();
      outcomePanel.add(outcomeDetailLabel);

      mainPanel.add(outcomePanel);

      frame.add(mainPanel);
      frame.setVisible(true);
   }

   public void playerWins(GameChoice player, GameChoice other,
      String winVerb)
   {
      outcomeStatusLabel.setText("You win!");
      outcomeDetailLabel.setText(player + " " + winVerb + " " + other);
   }

   public void tie(GameChoice player, GameChoice other)
   {
      outcomeStatusLabel.setText("Tie Game.");
      outcomeDetailLabel.setText("");
   }

   public void playerLoses(GameChoice player, GameChoice other,
      String winVerb)
   {
      outcomeStatusLabel.setText("You lose!");
      outcomeDetailLabel.setText(other + " " + winVerb + " " + player);
   }

   private JFrame createFrame()
   {
      JFrame frame = new JFrame();

      frame.setSize(WIDTH, HEIGHT);
      frame.setTitle(TITLE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      return frame;
   }

   private void addButtons(JPanel panel)
   {
      JButton rockButton = new JButton("Rock");
      panel.add(rockButton);
      rockButton.addActionListener(new RockListener(logic));

      JButton paperButton = new JButton("Paper");
      panel.add(paperButton);
      paperButton.addActionListener(new PaperListener(logic));

      JButton scissorsButton = new JButton("Scissors");
      panel.add(scissorsButton);
      scissorsButton.addActionListener(new ScissorsListener(logic));

      JButton lizardButton = new JButton("Lizard");
      panel.add(lizardButton);
      lizardButton.addActionListener(new LizardListener(logic));

      JButton spockButton = new JButton("Spock");
      panel.add(spockButton);
      spockButton.addActionListener(new SpockListener(logic));
   }
}

class RockListener
   implements ActionListener
{
   private GameLogic logic;
   public RockListener(GameLogic logic)
   {
      this.logic = logic;
   }

   public void actionPerformed(ActionEvent e)
   {
      logic.selectRock();
   }
}

class PaperListener
   implements ActionListener
{
   private GameLogic logic;
   public PaperListener(GameLogic logic)
   {
      this.logic = logic;
   }

   public void actionPerformed(ActionEvent e)
   {
      logic.selectPaper();
   }
}

class ScissorsListener
   implements ActionListener
{
   private GameLogic logic;
   public ScissorsListener(GameLogic logic)
   {
      this.logic = logic;
   }

   public void actionPerformed(ActionEvent e)
   {
      logic.selectScissors();
   }
}

class LizardListener
   implements ActionListener
{
   private GameLogic logic;
   public LizardListener(GameLogic logic)
   {
      this.logic = logic;
   }

   public void actionPerformed(ActionEvent e)
   {
      logic.selectLizard();
   }
}

class SpockListener
   implements ActionListener
{
   private GameLogic logic;
   public SpockListener(GameLogic logic)
   {
      this.logic = logic;
   }

   public void actionPerformed(ActionEvent e)
   {
      logic.selectSpock();
   }
}
