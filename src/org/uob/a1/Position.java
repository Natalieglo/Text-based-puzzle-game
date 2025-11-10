package org.uob.a1;

//FINISHED

//Task 1 - Position.java
// The Position class stores a position in terms of an x and y value.

public class Position 
{

    // attributes
    public int x;
    public int y; 
    //The x and y fields need to be declared as public 
    //so that other classes can access them directly.

    public Position(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    public Position moveNorth() 
    {
        return new Position(x, y - 1);
    }
    public Position moveSouth() 
    {
        return new Position(x, y + 1);
    }
    public Position moveEast() 
    {
        return new Position(x + 1, y);
    }
    public Position moveWest() 
    {
        return new Position(x - 1, y);
    }
}