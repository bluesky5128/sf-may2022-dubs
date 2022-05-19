package com.levelup.forestsandmonsters;

public class Map {
    private int size = 10;
    private int mapRows = 10;
    private int mapCols = 10;

    // Create Character Position
    public Position createPosition() {
        Position pos1 = new Position();
        pos1.setRow(1);
        pos1.setCol(1);
        return pos1;
    }
    

    // Create Character Position
    public boolean validatePosition(Position newPos) {
        Position pos1 = newPos;
        //code for validate
        if ( (pos1.getRow() < 1) || (pos1.getRow() > 10))
            return false;
        if ( (pos1.getCol() < 1) || (pos1.getCol() > 10))
            return false;
        return true;
    }
 }
