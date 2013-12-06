//Anna Margolis
//HW10 - War Game
//Hand.java

import java.util.ArrayList;

public class Hand extends Deck
{	
	private ArrayList<Card> hand = new ArrayList();
	public Hand()
	{}
	
	public void createHand(Hand hand1, Hand hand2)
	{
		for(int i=0; i<25; i++)
		{
			hand1[i] = getCard[i];	
		}
		for(int i=26; i<51; i++)
		{
			hand1[i] = getCard[i];	
		}
	}
	public void add(Card card)
	{
		hand.add(card);
	}
	
	public boolean isEmpty()
	{
		return hand.isEmpty();
	}
	
	public void clear()
	{
		hand.clear();
	}
	
	public Card getCard(int x)
	{
		return hand.get(x);
	}
	
	public String toString(){
		String str;
		
		for(int i=0; i<hand.size(); i++){
			str+=hand.get(i).toString()+ " ";	
		}
		
		return str;
	}


}