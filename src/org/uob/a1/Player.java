package org.uob.a1;

public class Player {

    //atributes
    private String name;
    private Position position;
    private Score score;
    private Inventory inventory;


    public Player(String name, Position startPosition, Score score, Inventory inventory) 
    {
        this.name = name;
        this.position = startPosition;
        this.score = score;
        this.inventory = inventory;
    }

    public String getName() 
    {
        return name;
    }
    public Position getPosition() 
    {
        return position;
    }
    


    public void move(String direction, int mapWidth, int mapHeight) 
    {
        Position newPos = null;

        switch(direction.toLowerCase())
        {
            case ("north"):
                newPos = position.moveNorth();
                break;
            case ("south"):
                newPos = position.moveSouth();
                break; 
            case ("east"):
                newPos = position.moveEast();
                break;
            case ("west"):
                newPos = position.moveWest();
                break;
            default:
                System.out.println("Invalid direction");
                return;
            
        }

        if (newPos.x < 0 || newPos.x >= mapWidth  || newPos.y < 0 || newPos.y >= mapHeight)
        {
            System.out.println("You can't move in that direction.");
            return;
        }
        this.position = newPos;
        
    }

    

    public Score getScore() 
    {
        return score;
    }
    public Inventory getInventory() 
    {
        return inventory;
    }
    
}
