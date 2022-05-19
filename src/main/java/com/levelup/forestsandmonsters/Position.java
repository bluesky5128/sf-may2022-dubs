package com.levelup.forestsandmonsters;

public class Position {
    private int Row;
    private int Col;    
    
    // Getter
    public int getRow() {
        return this.Row;
    }
    public int getCol() {
        return this.Col;
    }

    //Setter
    public void setRow(int V) {
        this.Row = V;
    }
    public void setCol(int V) {
        this.Col = V;
    }

    public Position(int i, int j)
    {
        this.Col = j;
        this.Row = i;
    }
}

