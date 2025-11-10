package org.uob.a1;

// Task 6 - Game.java
//The Game class runs the main game loop. You can create any methods you feel you
//require but you need to use all the other classes to make the game work. 

//this is where the design will be implemented!!!

import java.util.Scanner; 

public class Game 
{  
    public static Room getRealRoomAt(Position pos, Room[] allRooms) {
    for (int i = 0; i < allRooms.length; i++) {
        if (allRooms[i].getPosition().x == pos.x && allRooms[i].getPosition().y == pos.y) {
            return allRooms[i];
        }
    }
    return null; 
}

    
    public static void main(String args[]) 
    {

        //list of commands:

        //"move <direction>" - (<direction> can be "north", "south", "east", "west"). 
        //The player moves to a new room based on the direction.

        // "look" - Displays a description of the room the player is in.
        // "look <feature>" - Displays a more detailed description of a feature in a room.
        // A feature is a fixed object in the room.
        // "look <item>" - Displays a description of an item. 
        // This should only work if the item is in the player’s inventory.
        // "inventory" - Displays a list of all items the player has obtained.
        // "score" - Displays the user’s current score.
        // "map" - Displays a text-based map of the current explored game world.
        // "help" - Displays a help message.
        // "menu" - Displays all commands
        // "quit" - Quits the game

        // My additional commands not listed in min expected commands:
        // "take <item>" - Adds an item to the player’s inventory.
        // The item has to be in that room.
        // "drop <item>" - Removes an item from the player’s inventory.
        // The item is dropped in that room.

        Scanner scanner = new Scanner(System.in);

        // ************* CREATING ROOMS AND MAP *************
       


        Room Entrance = new Room("School Entrance","You are at the entrance of the school. The MAIN DOOR is locked",'E',new Position(0,0), null,null,"MainDoor","The door is firmly locked. You will need an ID Card to open it.");
        Room ScienceLab = new Room("Science Lab","You are in the science lab.",'S',new Position(0,1), null,null, null,null);
        Room ResearchLab = new Room("Research Lab","You are in the Research Lab. Shelves of chemicals line the walls. There is a TABLE in the center.",'R',new Position(0,2), "GymKey","A shiny Gym Key(gymkey) lies on the dusty table.", "Table","On the dusty table there is a GYM KEY.");
        Room artRoom = new Room("Art Room","You are in the art room. The PAINTING on the wall is crooked and has a message written on it. There are art supplies scattered around. ",'A',new Position(0,3), "Painting","In the corner of the painting there is a message written: 'CLASSROOM' ", null,null);
        
        
        //Room Hallway = new Room("Main Hallway","You are in the main hallway.",'H',new Position(1,0));
        // the dots will represent the hallway on the map
        Room Office = new Room("Office","You are in the office. There are papers scattered around.",'O',new Position(1,0), null,null, null,null);
        Room Classroom = new Room("Classroom","You are in the classroom. A BOOK lies on top of the desk",'C',new Position(1,3), "Book", "A dusty old book. As you open it, you notice a note in the front cover.'GO TO THE GYM FOR THE ID CARD' ", null,null);

        Room Cafeteria = new Room("Cafeteria","You are in the cafeteria.",'F',new Position(2,1), null, null, null,null);
        Room Library = new Room("Library","You are in the library.",'L',new Position(2,2), null,null, null,null);
        
        Room NurseOffice = new Room("Nurse's Office","You are in the nurse's office. ",'N',new Position(3,1), null,null, null,null);

        Room Bathroom = new Room("Bathroom","You are in the bathroom. The mirror is cracked with shards of glass scattered on the floor.",'B',new Position(4,0), null,null, null,null);
        Room Gym = new Room("Gym","You are in the gym. The door shuts loudly behind you, echoing through the room. There is a LOCKER that needs a key. ",'G',new Position(4,3), "IDCard","The ID CARD(idcard) needed to open the MAIN DOOR", "Locker","The LOCKER needs a GYM KEY");

        Room hallway1 = new Room("Hallway","You are in a hallway.", '.', new Position(2,0), null,null,null,null);
        Room hallway2 = new Room("Hallway","You are in a hallway.", '.', new Position(3,0), null,null,null,null);

        Room hallway3 = new Room("Hallway","You are in a hallway.", '.', new Position(1,1), null,null,null,null);
        Room hallway4 = new Room("Hallway","You are in a hallway.", '.', new Position(4,1), null,null,null,null);

        Room hallway5 = new Room("Hallway","You are in a hallway.", '.', new Position(1,2), null,null,null,null);
        Room hallway6 = new Room("Hallway","You are in a hallway.", '.', new Position(3,2), null,null,null,null);
        Room hallway7 = new Room("Hallway","You are in a hallway.", '.', new Position(4,2), null,null,null,null);

        Room hallway8 = new Room("Hallway","You are in a hallway.", '.', new Position(2,3), null,null,null,null);
        Room hallway9 = new Room("Hallway","You are in a hallway.", '.', new Position(3,3), null,null,null,null);

        //map called gameMap created and then rooms placed on map w symbol
        Map gameMap = new Map(5,4); //width and height
        gameMap.placeRoom(Entrance.getPosition(), Entrance.getSymbol());
        gameMap.placeRoom(Bathroom.getPosition(), Bathroom.getSymbol());
        gameMap.placeRoom(artRoom.getPosition(), artRoom.getSymbol());
        gameMap.placeRoom(Gym.getPosition(), Gym.getSymbol());
        gameMap.placeRoom(Library.getPosition(), Library.getSymbol());
        gameMap.placeRoom(Classroom.getPosition(), Classroom.getSymbol());
        gameMap.placeRoom(ScienceLab.getPosition(), ScienceLab.getSymbol());
        gameMap.placeRoom(ResearchLab.getPosition(), ResearchLab.getSymbol());
        gameMap.placeRoom(Office.getPosition(), Office.getSymbol());
        gameMap.placeRoom(Cafeteria.getPosition(), Cafeteria.getSymbol());
        gameMap.placeRoom(NurseOffice.getPosition(), NurseOffice.getSymbol());

        gameMap.placeRoom(hallway1.getPosition(), hallway1.getSymbol());
        gameMap.placeRoom(hallway2.getPosition(), hallway2.getSymbol());
        gameMap.placeRoom(hallway3.getPosition(), hallway3.getSymbol());
        gameMap.placeRoom(hallway4.getPosition(), hallway4.getSymbol());
        gameMap.placeRoom(hallway5.getPosition(), hallway5.getSymbol());
        gameMap.placeRoom(hallway6.getPosition(), hallway6.getSymbol());
        gameMap.placeRoom(hallway7.getPosition(), hallway7.getSymbol());
        gameMap.placeRoom(hallway8.getPosition(), hallway8.getSymbol());
        gameMap.placeRoom(hallway9.getPosition(), hallway9.getSymbol());

        //array of all rooms for easy access
        Room[] allRooms = {Entrance,ScienceLab,artRoom,Classroom,Office,Cafeteria,Library,NurseOffice,Bathroom,Gym,ResearchLab,hallway1,hallway2,hallway3,hallway4,hallway5,hallway6,hallway7,hallway8,hallway9};



        // ************* DISPLAYING WELCOME MESSAGE AND MENU OPTIONS *************
    


        System.out.println("\nWelcome to the Abandoned School Escape Puzzle Game!\n");
        System.out.println("Enter menu to view the list of commands: ");
        System.out.print(">>");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("menu"))
        {
            System.out.println("Menu controls:\n");
            System.out.println(" -move <direction>:(north, south, east, west).");
            System.out.println(" -look: Displays a description of the room");
            System.out.println(" -look <feature>: Displays a more detailed description of a feature in the room.");
            System.out.println(" -look <item>: Displays a description of an item in your inventory.");
            System.out.println(" -take <item>: Adds an item to your inventory.");
            System.out.println(" -drop <item>: Removes an item from your inventory.");
            System.out.println(" -inventory: Displays a list of all items in your inventory.");
            System.out.println(" -score: Displays your current score.");
            System.out.println(" -map: Displays a text-based map of the current explored game world.");
            System.out.println(" -help: Displays this help message.");
            System.out.println(" -quit: Quits the game.");
            System.out.println(" -menu: Displays all commands.");
        }

        System.out.print("Enter MAP to view the School map: ");
        System.out.print(">>");
        input = scanner.nextLine().toLowerCase();

        if (input.equals("map")) 
        {
            System.out.print("\nMap of School: \n");
            System.out.println(gameMap.display());
        }
        
        
        boolean isRunning = false;
        
        System.out.print("What is your name? ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName, Entrance.getPosition(), new Score(0), new Inventory());

        
    
        while (!isRunning) {
            System.out.print("Press Enter to continue to the entrance: ");
            input = scanner.nextLine();
            if (input.equals("")) 
            {
                isRunning = true;
            } else {
                System.out.println("Please press only Enter to continue.");
            }
        }

        
        //
        //declared current room here to start at entracne
        Room currentRoom = Entrance;


        while(isRunning)
        {   
            
            System.out.print("Enter a command: ");
            System.out.print(">>");
            String commands = scanner.nextLine().toLowerCase();
            String[] command = commands.split(" ");
            String mainCommand = command[0];
            

            switch (mainCommand)
            {           
            case "quit":
                System.out.println("Quitting game");
                isRunning = false;
                break;
            case "menu":
                System.out.println("Menu controls:\n");
                System.out.println(" -move <direction>:(north, south, east, west).");
                System.out.println(" -look: Displays a description of the room");
                System.out.println(" -look <feature>: Displays a more detailed description of a feature in the room.");
                System.out.println(" -look <item>: Displays a description of an item in your inventory.");
                System.out.println(" -take <item>: Adds an item to your inventory.");
                System.out.println(" -drop <item>: Removes an item from your inventory.");
                System.out.println(" -inventory: Displays a list of all items in your inventory.");
                System.out.println(" -score: Displays your current score.");
                System.out.println(" -map: Displays a text-based map of the current explored game world.");
                System.out.println(" -help: Displays this help message.");
                System.out.println(" -quit: Quits the game.");
                System.out.println(" -menu: Displays all commands.");
                break;
            case "help":
                System.out.println("Help Menu:\n");
                System.out.println("Use the commands in the menu to navigate through the school and solve puzzles.\n");
                break;
            case "map":
                System.out.println("Map of School: \n");
                System.out.println(gameMap.display());
                break;
            case "score":
                System.out.println("Your current score is: \n" + player.getScore().getScore());
                break;
            case "inventory":
                System.out.println("Your inventory: \n" + player.getInventory().displayInventory());
                break;
            case "move":
                if (command.length > 1) {
                    //second value is NESW 
                    String direction = command[1];
                    player.move(direction, gameMap.getWidth(), gameMap.getHeight()); 
                    currentRoom = getRealRoomAt(player.getPosition(), allRooms); //uodating room
                    System.out.println(currentRoom.getDescription());
                    player.getScore().visitRoom();
                } else {
                    System.out.println("Direction not entered. Specify: North, south, east, or west");
                }
                break; 
            case "look":
                if (command.length >1)
                {
                    String target = command[1];
                    if (target.equalsIgnoreCase(currentRoom.getFeature())) 
                    {
                        System.out.println(currentRoom.getFeatureDescription());
                    }
                    else if (player.getInventory().hasItem(target) != -1) {
                        System.out.println(player.getInventory().getItemDescription(target));
                    }
                    else 
                    {
                        System.out.println("You don't see that here.");
                    }
                } 
                else 
                {
                    System.out.println(currentRoom.getDescription());
                }
                break;
                
            case "take":
                if (command.length > 1) {
                    String itemName = command[1];

                    if (currentRoom.getItem() != null && currentRoom.getItem().equalsIgnoreCase(itemName)) {
                        player.getInventory().addItem(currentRoom.getItem(), currentRoom.getItemDescription());
                        System.out.println(itemName + " now in inventory");
                        currentRoom.removeItem();  
                        player.getScore().collectItem(); 
                    } else {
                        System.out.println("There is no " + itemName + " here.");
                    }
                } else {
                    System.out.println("Specify an item to take.");
                }
                break;

            
            default:
                System.out.println("Not a valid command. Try again.");
                break;
            }

            
            if ("Locker".equalsIgnoreCase(currentRoom.getFeature()) && player.getInventory().hasItem("IDCard") == -1) 
            {
                if (player.getInventory().hasItem("GymKey")!=-1) 
                {
                    System.out.println("You use the Gym Key to open the LOCKER. Inside you find the ID Card!");
                    player.getInventory().addItem("IDCard", "The ID CARD needed to open the MAIN DOOR");
                    currentRoom.removeFeature();
                    player.getScore().collectItem();
                } else 
                {
                    System.out.println("The LOCKER is locked. You need a key.");
                }
            }

            if ("MainDoor".equalsIgnoreCase(currentRoom.getFeature())) {
                if (player.getInventory().hasItem("IDCard") != -1) {
                    System.out.println("You use the ID Card to open the MAIN DOOR and you have escapedddddd!!");
                    isRunning = false;
                    
                } 
                else 
                {
                    System.out.println("The MAIN DOOR is locked. You need an ID Card.");
                }
            }

        
            
        }
        scanner.close();
    }

}

