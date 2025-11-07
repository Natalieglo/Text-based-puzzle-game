package org.uob.a1;

//Task 3 - Map.java
// The Map class stores information about the game Map, including the map array, a width
// and height, and the value used for empty map areas.

public class Map 
{

    // attributes
    private int width;
    private int height;
    private char [][] map;
    final private char EMPTY='.'; // represents empty space on the map '.' is the empty symbol

    public Map(int width, int height) 
    {
        // represent the rows and columns starting at the top left corner (0,0) of the map
        this.width=width;
        this.height=height;
        this.map=new char[height][width];
    }
    public void placeRoom(Position pos, char symbol)
    {
        //fill this in later 

    }
    public String display()
    {
        //fill this in later
        return this.map.toString();
    }
}