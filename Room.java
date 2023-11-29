import java.util.HashMap;
import java.util.Set;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * 
 * Modified versions
 * 
 * @author MAZURIE Jules
 *
 * @version 29/11/23
 * This version is the correction of Question 3 of the OOD-OOP training.
 * It consists in:
 *      - replacing the exit attributes by a HashMap
 *      - adding a setExit method
 *  */
public class Room 
{
    private String description;
    // version 2017-02 Question 3: creating the HashMap to replace the different exits
//     public Room northExit;
//     public Room southExit;
//     public Room eastExit;
//     public Room westExit;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        // version 2017-02 Question 3: init the hashMap
        exits = new HashMap<>();
    }

//     /**
//      * Define the exits of this room.  Every direction either leads
//      * to another room or is null (no exit there).
//      * @param north The north exit.
//      * @param east The east east.
//      * @param south The south exit.
//      * @param west The west exit.
//      */
//     public void setExits(Room north, Room east, Room south, Room west) 
//     {
//         if(north != null)
//             // version 2017-02 Question 3: change attribute access (same for all directions)
//             // northExit = north;
//             exits.put("north", north);
//         if(east != null)
//             exits.put("east", east);
//         if(south != null)
//             exits.put("south", south);
//         if(west != null)
//             exits.put("west", west);
//     }

    /**
     * Method getExit: returns the room that we reach in the given direction
     * If there is no room in that direction, returns null
     *
     * @param direction The exit's direction
     * @return The roomin the given direction
     * 
     * @version version 2017-02 Question 3
     */
    public Room getExit(String direction){
            return exits.get(direction);
    }
    
    /**
     * Method setExit: defines an exit from this room
     * Replaces the setExits method
     *
     * @param direction the direction of the exit
     * @param neighbor the room in the given direction

     * @version version 2017-02 Question 3
     */
    public void setExit(String direction, Room neighbor){
            exits.put(direction, neighbor);
    }
    
    /**
     * Method getExitString *** to be commented
     *
     */
    public String getExitString(){
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
