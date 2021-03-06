// github.com/DaniAngelov

package WarGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Player 
{
	private String name;
	private String CurrCard;
	private int cardRank;
	private static int counter = 52;
	private boolean check = true;
	private Deck deckPlayer;
	private static ArrayList<Cards> warPackage;
	private static ArrayList<String> warWinner;
	private boolean checkWar = false;
	private static boolean check2 = false;
	
	
	
	Player(String name)
	{
		this.name =name;
		this.deckPlayer = new Deck(0);
		this.warPackage = new ArrayList<Cards>();
		this.warWinner = new ArrayList<String>();
	}
	
	boolean getCheck()
	{
		return this.check;
	}
	String getName()
	{
		return this.name;
		
	}

	Deck getDeckPlayer()
	{
		return this.deckPlayer;
	}
	
	ArrayList<Cards> getWarPackage()
	{
		return this.warPackage;
	}
	
	ArrayList<String> getWarWinner()
	{
		return this.warWinner;
	}
	
	
	
	void updateCardRank(Player p,Deck d)
	{

		 if(this.CurrCard.contains(" Clubs"))
			this.getDeckPlayer().getDeck().add(d.getDeck().get(this.cardRank));	 
		else if(this.CurrCard.contains(" Diamonds"))
			this.getDeckPlayer().getDeck().add(d.getDeck().get(this.cardRank + 13));
		else if(this.CurrCard.contains(" Hearts"))
			this.getDeckPlayer().getDeck().add(d.getDeck().get(this.cardRank + 26));
		else if(this.CurrCard.contains(" Spades"))
			this.getDeckPlayer().getDeck().add(d.getDeck().get(this.cardRank + 39));
		 
		 if(p.CurrCard.contains(" Clubs"))
				this.getDeckPlayer().getDeck().add(d.getDeck().get(p.cardRank));	 
			else if(p.CurrCard.contains(" Diamonds"))
				this.getDeckPlayer().getDeck().add(d.getDeck().get(p.cardRank + 13));
			else if(p.CurrCard.contains(" Hearts"))
				this.getDeckPlayer().getDeck().add(d.getDeck().get(p.cardRank + 26));
			else if(p.CurrCard.contains(" Spades"))
				this.getDeckPlayer().getDeck().add(d.getDeck().get(p.cardRank + 39));
	}
	
	 void warPackage(Cards c)
	{
		this.warPackage.add(c);
		
	}
	 
	 
	 void drawCard(Deck d)
		{
			
			Random r = new Random();
			int random = r.nextInt(counter);
			
			
		
			
			if(d.getSet().contains(d.getDeck().get(random).getCurrCard()))
			{
				
				if(check2)
				{
					warPackage(d.getDeck().get(random));
				}
				//System.out.println("CHECK IN DRAWCARD: " + check2);
			this.CurrCard = d.getDeck().get(random).getCurrCard();
			if(random >= 13)
			{
			this.cardRank = random % 13;
			}
			else if(random >= 0 && random <= 12 )
			{
				this.cardRank = random;
			}
			System.out.println(this.name + " drew " + this.CurrCard + " !");
			
				d.getSet().remove(d.getDeck().get(random).getCurrCard());
				check = true;
			}
			else
			{
				
				
				check = false;
			}
		}
	
	void cardPower(Player p,Deck d)
	{
		
		
		if(this.cardRank > p.cardRank)
		{
			if(checkWar == true)
			{
				this.warWinner.add(this.getName());
				System.out.println("THE WAR WINNER IS: " + this.getName());
				
				for(int i = 0;i < this.getWarPackage().size();i++)
				{
					this.getDeckPlayer().getDeck().add(p.getWarPackage().get(i));
					
				}
				for(int i = 0;i < p.getWarPackage().size();i++)
				{
					this.getWarPackage().remove(i);
					
				}
				
			}
			this.checkWar = false;
			check2 = false;
			System.out.println(this.getName() + " wins ! ");
			this.updateCardRank(p, d);
			
		}
		else if(this.cardRank < p.cardRank)
		{
			if(checkWar == true)
			{
				this.warWinner.add(p.getName());
				System.out.println("WAR WINNER NAME IS: " + p.getName());
				for(int i = 0;i < p.getWarPackage().size();i++)
				{
					p.getDeckPlayer().getDeck().add(p.getWarPackage().get(i));
					
				}
				for(int i = 0;i < p.getWarPackage().size();i++)
				{
					p.getWarPackage().remove(i);
					
				}
				
			}
			check2 = false;
			
			this.checkWar = false;
			System.out.println(p.getName() + " wins ! " );
			p.updateCardRank(this, d);
			
		}
		else
		{
			this.checkWar = true;
			System.out.println(" WAR! ");
			check2 = true;
			int counter = 4;
			while(counter != 1 && !d.getSet().isEmpty())
			{
				
				
				this.drawCard(d);
				if(this.getCheck() != false)
				{
				
					
					check2 = true;
				p.drawCard(d);
				while(p.getCheck() == false )
				{
					
					p.drawCard(d);
				}
				
				System.out.println("------------- IN THE WAR ---------");
				
				counter--;
				if(counter == 1)
				{
					
				this.cardPower(p,d);
					
				}

				
				}
				
				
			}
     }
	}
}

