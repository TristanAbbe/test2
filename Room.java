import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 * This class is part of a text-based adventure game.
 *
 * A "Room" represents one location in the game. It is connected to
 * other rooms via exits. The exits are labeled by cardinal points
 * such as north, east, south, west.
 * 
 * @author MAZURIE Jules
 * @version 29/11/2023
 */
public class Room {
    private String name;
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Constructor for objects of class Room
     * @param name The room's name.
     * @param description The room's description.
     */
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define an exit from this room.
     * @param direction The exit's direction.
     * @param neighbor The neighboring room.
     */
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     * Get the name of the room.
     * @return The name of the room.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the description of the room.
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the neighboring room in the given direction.
     * @param direction The exit's direction.
     * @return The neighboring room.
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * Get a string representation of the exits.
     * @return A string representing the exits.
     */
    public String getExitString() {
        StringBuilder exitString = new StringBuilder("Exits: ");
        for (String direction : exits.keySet()) {
            exitString.append(direction).append(" ");
        }
        return exitString.toString().trim();
    }
}
