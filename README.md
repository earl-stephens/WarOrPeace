# War or Peace

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction

War Or Peace is based on a card game.  Each player gets half the deck.  A turn is taken by turning over the top card.  The player with the higher value card wins the turn.  If the values are equal, the players compare the third card in their decks.  Again, the higher value card wins.  If the first and third cards are both equal, then the round is called mutually assured destruction, and there is no winner.  In the first and second scenarios, the winner gets the loser's cards.  If the turn results in mutually assured destruction, both players lose three cards a piece.  The game is over when one player has no cards left to play.  The winner is the one holding all the cards.

There are seven classes for this game.  The first one is a Card class.  The constructor takes String values for suit and value, and an integer value for rank.

The second class is Deck, which takes a Card array.  Deck has several methods for working with a Card array.  Deck can iterate over the array and find the value of a card at a specific index - `rank_of_card_at()`.  Deck uses `high_ranking_cards()` to create an array of all the high ranking cards only.  That array is used in the `percent_high_ranking()` method.  Finally, Deck has `remove_card()` and `add_card()` methods.

The Player class creates a player, taking a String for name and a Deck object in its constructor.  Player has one method, `has_lost()`.

The Turn class has a lot of the logic for the game.  The constructor takes in two Player objects.  `type()` is used to determine if the turn is basic, war, or mutually assured destruction.  `winner()` determines the winner of the turn, based on the type of turn.  A switch statement is used here for the method logic.  After the winner is determined, the `pile_cards()` method is used to gather the played cards into a spoils_of_war Card array.  `award_spoils()` is then used to distribute the cards from spoils_of_war to the winner (and empty the spoils_of_war array).

While the Turn class handles the logic of the game, the Runner class is responsible for the setup and play of the game.  First, the Runner class pulls the data for a standard 52 card deck from a cards.txt file and creates a deck of Card objects.  Next, `createTwoDecks()` is used to randomly assign 26 cards to each player.  The two randomized decks are used to create two players in `createPlayers()`.  The last method is `start()`, which begins the game.  `start()` also is responsible for making sure the game ends after 1,000,000 turns.

In `runner.start()`, the game outputs messages to the player.  It was decided to create a Displayer class, which would handle the message display.  Displayer has an initial display shown via `loadScreen()`.  This is shown once, at the beginning of the game.  `turnOutcome()`, `winnerMessage()` and `draw()` are the other methods to display data to the user.

Finally, the WarOrPeace class has the main method for the program.  It creates a Runner object and sets up the decks and players before calling `runner.start()`.

## Installation

Clone the repo to your local machine.  Navigate to the files in WarOrPeace/src/main.  For each file, perform the following:  

`javac -d . filename.java`

## Getting Started   

To run the program, at the command line type:  

`java -cp . main.WarOrPeace`

## Further Improvements

Some methods should be examined for refactoring, as they are a little long and may not have single responsibility.

Testing with Mockito or some other mocking framework may be useful for things such as the Displayer class.

A linter plug-in would be useful.

## Built With

OpenJDK 16.0.1

JUnit 5  

Eclipse 2020-06  

## Coverage

87.9%

## Authors

[Earl Stephens](https://github.com/earl-stephens)