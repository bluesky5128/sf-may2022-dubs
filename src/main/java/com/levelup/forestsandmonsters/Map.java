package com.levelup.forestsandmonsters;

public class Map {
    private int size = 10;
    private int mapRows = 10;
    private int mapCols = 10;

    // Create Character Position
    public Position createPosition() {
        Position pos1 = new Position(1,1);
        // pos1.setRow(1);
        // pos1.setCol(1);
        return pos1;
    }
    
 //   | | | | | |
 //    
 //   | | | | | |
  //  | | | | | |

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
    
        /*
          This method draws character on Map of 10x10
        */
        public void printMap(Position pos1)
        {
            for (int i =1;  i<=mapRows; i++ )
            {
                for (int j =1;  j<=mapCols -1 ; j++ )
                {
                    if( (pos1.getRow()==i) && (pos1.getCol() ==j) )  
                    {
                       System.out.print("| * ");
                    }
                    else
                    {
                       System.out.print("|   ");
                    }
    
                }
                System.out.println("|  ");
            }
    
    
        }
    
    
     }
    
