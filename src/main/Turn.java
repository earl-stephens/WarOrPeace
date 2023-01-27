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
	
	public Player winner() {
		Player winner;
		if(player1.deck.rank_of_card_at(0) > player2.deck.rank_of_card_at(0)) {
			winner = player1;
		} else {
			winner = player2;
		}
		return winner;
	}
	
	public void pile_cards() {
		if(type().equals("basic")) {
			spoils_of_war.add(player1.deck.remove_card());
			spoils_of_war.add(player2.deck.remove_card());
		}
	}
}
