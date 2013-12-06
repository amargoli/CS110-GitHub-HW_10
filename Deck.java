//Anna Margolis
//HW 10- War Game
//Deck.java

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	private ArrayList<card> cards = new ArrayList(51);
	
	Deck()
	{	
		//Populate the deck
		CreateDeck();
	}
	
	private void CreateDeck()
	{
		String[] ranks = {"2", "3", "4", "5", "6" ,"7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"H", "D", "S", "C"};
		
		for(int i=0; i<suits.length; i++)
		{
			for(int j=0; j<ranks.length; j++)
				this.cards.add(new Card(ranks[j], suits[i]));
		}
	}
	
	public Card getTopCard()
	{	
		//Get the first card
		Card topCard = cards.get(0);
		
		//Remove the first card
		cards.remove(topCard);
		
		return topCard;
	}
	
	public ArrayList<Card> getDeck(){
		
		return this.cards;
	}
	
	public String toString(){
		String str;
		Card tempCard;
		
		//Loop through the arrayList and add to the string
		for(int i=0; i<cards.size(); i++){
			tempCard = cards.get(i);
			str+=tempCard.toString()+ " ";	
		}
		
		return str;
	}
	
	public void shuffle(){
		Collections.shuffle(this.cards);
	}

}