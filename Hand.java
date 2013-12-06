//Anna Margolis
//HW10 - War Game
//Hand.java

import java.util.ArrayList;

public class Hand 
{	
	private ArrayList<Card> hand = new ArrayList();
	
	public Hand()
	{}
	
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