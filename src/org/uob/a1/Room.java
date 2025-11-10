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
    private String item;
    private String itemDescription;
    private String feature;       
    private String featureDescription;


    public Room(String name,String description,char symbol,Position position, String item, String itemDescription, String feature, String featureDescription)
    {
        this.name=name;
        this.description = description;
        this.symbol=symbol;
        this.position=position;
        this.item = item;
        this.itemDescription = itemDescription;
        this.feature = feature;
        this.featureDescription = featureDescription;
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

    public String getItem()
    {
        return item;

    }
    public String getItemDescription()
    {
        return itemDescription;
    }
    public String getFeature() 
    { 
        return feature; 
    }

    public void removeFeature() {
        this.feature = null;
        this.featureDescription = null;
    }   
    public String getFeatureDescription() 
    { 
        return featureDescription; 
    }
    public void removeItem() {
        this.item = null;
        this.itemDescription = null;
    }
}