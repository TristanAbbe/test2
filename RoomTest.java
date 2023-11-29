import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testRoomCreation() {
        // Create a room and check its properties
        Room room = new Room("Kitchen", "This is a kitchen.");
        assertEquals("Kitchen", room.getName());
        assertEquals("This is a kitchen.", room.getDescription());
    }

    @Test
    public void testSetAndGetExit() {
        // Create two rooms
        Room room1 = new Room("Living Room", "This is a living room.");
        Room room2 = new Room("Bedroom", "This is a bedroom.");

        // Set an exit from room1 to room2
        room1.setExit("north", room2);

        // Check if the exit is set correctly
        assertEquals(room2, room1.getExit("north"));
    }

    @Test
    public void testGetExitString() {
        // Create a room and set exits
        Room room = new Room("Hallway", "This is a hallway.");
        Room roomNorth = new Room("North Room", "This is the north room.");
        Room roomSouth = new Room("South Room", "This is the south room.");

        room.setExit("north", roomNorth);
        room.setExit("south", roomSouth);

        // Check if the string of exits is generated correctly
        String expected = "Exits: north south";
        assertEquals(expected, room.getExitString());
    }
}