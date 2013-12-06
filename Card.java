//Anna Margolis
//HW 10- War Game
//Card.java

public class Card
{
	private String suit;
	private String rank; //1 for Ace, 11 for Jack, etc
	private String pictureName;
	
	Card(String prank, String psuit)
	{
		this.suit = psuit;
		this.rank = prank;
		setPictureName(rank+suit+".jpg");
	}
	
	public void setSuit(String psuit)
	{
		this.suit = psuit;
	}
	
	public void setRank(String prank)
	{
		this.rank = prank;
	}
	
	public void setPictureName(String ppictureName)
	{
		this.pictureName = ppictureName;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	public String getRank()
	{
		return this.rank;
	}
	
	public String getPicureName()
	{
		return this.PictureName;
	}
	
	public String toString()
	{
		String stringValue = this.rank + this.suit; 
		return stringValue;
	}

	public boolean equals(String rank, String suit)
	{
		if(suit.equals(this.suit) && rank.equals(this.rank))
			return true;
		else
			return false;
	}
	
	//Make a 2nd equals function to accept just the card as the parameter
	public boolean equals(Card card)
	{
		return equals(card.getRank(), card.getSuit());
	}
	
	public static int getValue(Card card)
	{
		String cardRank = card.getRank();
		
		int value = 0;
		
		if(cardRank.equals("J") || cardRank.equals("Q")|| cardRank.equals("K"))
			value = 10;
		else if(cardRank.equals("A")){
			value = 1;
		else
			value = Integer.parseInt(cardRank);
				
		return value;
	}
	
	public static int compare(Card card1, Card card2)
	{
		int val1, val2;
		val1 = getValue(card1);
		val2 = getValue(card2);
		
		if(val1 > val2)
			return -1;
		else if(val2>val1)
			return 1;
		else
			return 0;
	}
}

