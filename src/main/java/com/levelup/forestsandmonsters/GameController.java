package com.levelup.forestsandmonsters;

import java.awt.Point;

import org.hibernate.validator.internal.constraintvalidators.hv.pl.PolishNumberValidator;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_PLAYER_NAME = "Player";
    public Character myChar = null;
    public String CharName ="";
    Map myMap;
    public int intSteps=0;
    public Position lastPos;

    public class GameStatus {
        // TODO: Add other status data
        public String playerName = DEFAULT_PLAYER_NAME;
        //public String myDirection = "RIGHT";
        public Position currPos = null;
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
        CharName=name;
        myMap = new Map();
        status.playerName = name;
        status.currPos = myChar.getStartingPosition();
        
        // if (name != null && !name.equals("")) {
        //     status.playerName = name;
        // } else {
        //     status.playerName = DEFAULT_PLAYER_NAME;
        // }
    }

    public void updateStatus(){

    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the player
        // on them?
        // TODO: Should also update the game results?
        if (myChar == null) {
            createCharacter("Player");
        }
    }

    public GameStatus getStatus() {
        myMap.printMap(myChar.currentPosition);
        System.out.println("Would you like to go North(N), South(S), East(E), West(W) or Exit(X)?");   
        System.out.println("You have moved " + intSteps + " Steps.");   
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        Position cPos = myChar.currentPosition;

        Position iffyPos = myChar.calculatePosition(cPos, directionToMove.toString());
        if (myMap.validatePosition(  iffyPos)) 
            myChar.setPosition(iffyPos) ;
            else myChar.setPosition(cPos);    

            status.currPos = myChar.currentPosition;
            lastPos= myChar.currentPosition;
            intSteps++;
    
        }

}
