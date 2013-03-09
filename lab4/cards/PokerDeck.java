import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PokerDeck implements Deck {

	List<Card>deck=new ArrayList<Card>();
	
	public void shuffle() 
	{
		
		Random rand = new Random();
		
	}

	public boolean checkCard() {
		if(deck.isEmpty())
		{ return false;  }
		else
		{ return true;	}
	}

	public Card dealcard() {
		Card pull=new Card(deck.get(1).r,deck.get(1).s);
		deck.remove(1);
		return pull;
	}

}
