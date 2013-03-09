
public class Card {
   Rank r;
   Suit s;
   
   public Card(Rank one, Suit two)
   {
	   if(one.rankName()=="Ace")
	   { Rank r=new AceRank();  }
	   if(one.rankName()=="Queen")
	   { Rank r=new QueenRank();  }
	   if(one.rankName()=="King")
	   { Rank r=new KingRank();  }
	   if(one.rankName()=="Jack")
	   { Rank r=new JackRank();  }
	   
	   if(two.suitName()=="Club")
	   { Suit s=new ClubSuit();  }
	   if(two.suitName()=="Diamond")
	   { Suit s=new DiamondSuit();  }
	   if(two.suitName()=="Hearts")
	   { Suit s=new HeartsSuit();  }
	   if(two.suitName()=="Spades")
	   { Suit s=new SpadesSuit();  }
   }
   
   public String getRank()
   {
	   return this.r.rankName();
   }
   
   public String getSuit()
   {
	   return this.s.suitName();
   }
}
