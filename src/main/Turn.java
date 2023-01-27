package main;

import java.util.ArrayList;

public class Turn {
	public Player player1;
	public Player player2;
	public ArrayList<Card> spoils_of_war = new ArrayList<>();
	
	public Turn(Player firstPlayer, Player secondPlayer) {
		this.player1 = firstPlayer;
		this.player2 = secondPlayer;
	}
	
	public String type() {
		if(player1.deck.cards.get(0) != player2.deck.cards.get(0)) {
			return "basic";
		}
		return "";
	}
}
