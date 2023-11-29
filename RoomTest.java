import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    /**
     * Test for creating a room and checking its description.
     */
    @Test
    public void testRoomCreation() {
        // Create a room and check its description
        Room room = new Room("This is a test room.");
        assertEquals("This is a test room.", room.getDescription());
    }

    /**
     * Test for setting and getting room exits.
     */
    @Test
    public void testSetAndGetExit() {
        // Create two rooms
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");

        // Set an exit from room1 to room2
        room1.setExit("north", room2);

        // Check if the exit is set correctly
        assertEquals(room2, room1.getExit("north"));
    }

    /**
     * Test for generating a string of room exits.
     */
    @Test
    public void testGetExitString() {
        // Create a room and set exits
        Room room = new Room("Test Room");
        room.setExit("north", new Room("North Room"));
        room.setExit("south", new Room("South Room"));

        // Check if the string of exits is generated correctly
        String expected = "Exits: north south";
        assertEquals(expected, room.getExitString());
    }
}
