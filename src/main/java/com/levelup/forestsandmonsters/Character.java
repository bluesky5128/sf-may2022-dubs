package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
 
    String name;
    int numMove;
    Position currentPosition;

    public Position getPosition()
    {
        return null;
    }

    public void setPosition(Position newPos )
    {
        currentPosition = newPos;
    }

    public Position calculatePosition(Position cPos, String direction )
    {
        int row = cPos.getRow();
        int col = cPos.getCol();
        // Position newPos = new Position();
        if (direction == DIRECTION.SOUTH.name()) { ++row; }
        else if (direction == DIRECTION.NORTH.name()) { --row; }
        else if (direction == DIRECTION.EAST.name()) { ++col; }
        else if (direction == DIRECTION.WEST.name()) { --col; }
        return new Position(row,col);
    }

    public void enterMap(Map thisMap)
    {

    }
     
    public void setMap(Map thisMap)
    {

    }
    public void getMoves(){}

    public Position getStartingPosition()
    {
        Position thisPosition = new Position(1,1);
        // thisPosition.setRow(1);
        // thisPosition.setCol(1);
        return thisPosition;

    }

    Map characterMap;

    public Character(String inName) {
        this.name = inName;
        this.characterMap = new Map();
        this.currentPosition = getStartingPosition();
        
    }
}
