Feature: ForestsAndMonsters
![Gamer](images/gamerErin.png)

I want to create a new custom character, setting their name.
This split is VERY simple, to get us started. Just barebones game functionality.

Scenario Outline:: Set player name
    Given the player's name is <playerNameInput>
    When the player sets their name
    Then the Game sets the player's name to <playerNameOutput>
    Examples:
        | playerNameInput | playerNameOutput |
        | "Erin"          | "Erin"           |
        | ""              | "Player"         |

I want to move a character, based on the direction selected.
This split is VERY simple, to get us started. Just barebones game functionality.

Scenario Outline:: Move character
    Given the character's position is <startPosition>
    When the player moves in a <direction>
    Then the Game sets the player to <newPosition>
    Examples:
        | startPostition | direction | #ofMoves |newPosition| #ofMoves| 
        |(1,1) | Right | 0 | (1,2) | 1 |
        |(1,1) | Up | 0 | (1,1) | 1 |
        |(5,5) | Left | 7 | (5,4) | 8 |
        |(10,5)| Down | 15 | (10,5) | 16 |
        |(10,10)| Right | 10 | (10,10) | 21 | 
        |(5,5) | Down | 15 | (6,5) | 16 |