package com.levelup.forestsandmonsters;


public class Character {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
 
    String name;
    int numMove;
    //Position newPos

    public Position getPosition()
    {
        return null;
    }

    public void setPosition(Position newPos )
    {

    }

    public Position calculatePosition(Position cPos, String direction )
    {
        return null;
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
        Position thisPosition = new Position();
        thisPosition.setRow(1);
        thisPosition.setCol(1);
        return thisPosition;

    }


    public Character(String inName) {
        this.name = inName;
        
    }
}
