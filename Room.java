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
    private String name;
    
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description,String name) 
    {
        this.name = setName(name)
        this.description = setDescription(description);
        exits = new HashMap<>();
    }

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
    //        exits.put(direction, neighbor);
    }
    
    
        /**
     * Get the name of the room
     * 
     * @return name The name of the room.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
       return description;
    }

}
