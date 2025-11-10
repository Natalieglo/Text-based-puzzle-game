package org.uob.a1;


//FINISHED

//Task 3 - Map.java
// The Map class stores information about the game Map, including the map array, a width
// and height, and the value used for empty map areas.

public class Map 
{

    // attributes
    private int width;
    private int height;
    private char [][] map;
    private Room[][] rooms;
    final private char EMPTY='.'; // represents empty space on the map '.' is the empty symbol

    public Map(int width, int height) 
    {
        // represent the rows and columns starting at the top left corner (0,0) of the map
        this.width=width;
        this.height=height;
        this.map=new char[height][width];
        this.rooms=new Room[height][width];

        for (int i=0;i<height;i++)
        {
            for (int j=0;j<width;j++)
            {
                map[i][j]='.';
            }
        }
    }

    public int getWidth()
    { 
        return width;
    }
    public int getHeight()
    {
        return height;
    }

    public void placeRoom(Position pos, char symbol)
    {        
        
        //pos is called from Room.java getPosition() then from position.java
        if (pos.x>=0 && pos.x<width && pos.y>=0 && pos.y<height)
        {
            map[pos.y][pos.x]=EMPTY; //map is empty at first

            //the positiong given is then used to place the room symbol on the map
            //in java y and x are reversed for 2D arrays
            map[pos.y][pos.x]=symbol;
            rooms[pos.y][pos.x] = new Room("", "", symbol, pos, null,null,null,null);
        }
    }

    public Room getRoomAt(Position pos)
    {
        //returns  room at that position
        if (pos.x>=0 && pos.x<width && pos.y>=0 && pos.y<height)
        {
            return rooms[pos.y][pos.x];
        }
        return null;
    
    }
    public String display()
    {
        //outer loop is up to down - always goes first
        //inner loop is left to right so prints on same line then moves down

        String displayMap="";
        //store map in string so i can return the string otherwise it prints the map and then doesnt return anything
        
        for (int i=0;i<height;i++)
        {
            for (int j=0;j<width;j++)
            {   
                
                displayMap+=map[i][j]+" ";
                
            }
            displayMap+=" \n";
            //new line after each row
        }
            

        return displayMap;
    }
}
    
