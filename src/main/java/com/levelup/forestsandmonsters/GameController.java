package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_PLAYER_NAME = "Player";
    Character myChar = null;

    public class GameStatus {
        // TODO: Add other status data
        public String playerName = DEFAULT_PLAYER_NAME;
        //public String myDirection = "RIGHT";
        public Position currPos = new Position();
    }

//     public class Position
//     {
//         public int X =1;
//         public int Y = 1;
//     }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    
    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        myChar = new Character(name);
        status.playerName = name;
        status.currPos = myChar.getStartingPosition();
        // if (name != null && !name.equals("")) {
        //     status.playerName = name;
        // } else {
        //     status.playerName = DEFAULT_PLAYER_NAME;
        // }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the player
        // on them?
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
    }

}
