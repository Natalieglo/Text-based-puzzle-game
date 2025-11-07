package org.uob.a1;

//FINISHED

// Task 2 - Room.java
// The Room class stores information about a Room, including a name, description, a
// symbol and a Position.

public class Room 
{

    // attributes
    private String name;
    private String description;
    private char symbol;  // The symbol is used when displaying the room on the map.
    private Position position;

    public Room(String name,String Description,char symbol,Position position)
    {
        this.name=name;
        this.description=Description;
        this.symbol=symbol;
        this.position=position;
    }

    public String getName() 
    {
        return name;
    }

    public String getDescription() 
    {
        return description;
    }

    public char getSymbol() 
    {
        //The symbol is used when displaying the room on the map
        return symbol;
    }

    public Position getPosition() 
    {
        return position;
    }
    
}