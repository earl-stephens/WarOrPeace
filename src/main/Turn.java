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
		if(player1.deck.cards.get(0).value != player2.deck.cards.get(0).value) {
			return "basic";
		} else if((player1.deck.cards.get(0).value == player2.deck.cards.get(0).value) && (player1.deck.cards.get(2).value != player2.deck.cards.get(2).value)) {
			return "war";
		} else {
			return "mutually_assured_destruction";
		}
		
	}
	
	public Player winner() {
		Player winner = player2;
		String type = type();
		
		switch (type) {
		case "basic": 
			if(player1.deck.rank_of_card_at(0) > player2.deck.rank_of_card_at(0)) {
				winner = player1;
			} else {
				winner = player2;
			}
			break;
		case "war":
			if(player1.deck.rank_of_card_at(2) > player2.deck.rank_of_card_at(2)) {
				winner = player1;
			} else {
				winner = player2;
			}
			break;
		default:
			return null;
		}
		return winner;
	}
	
	public void pile_cards() {
		if(type().equals("basic")) {
			spoils_of_war.add(player1.deck.remove_card());
			spoils_of_war.add(player2.deck.remove_card());
		}
	}
	
	public void award_spoils(Player winner) {
		winner.deck.add_card(spoils_of_war.get(0));
		spoils_of_war.remove(0);
		winner.deck.add_card(spoils_of_war.get(0));
		spoils_of_war.remove(0);
	}
}
