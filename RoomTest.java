import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testRoomCreation() {
        Room myRoom = new Room("This is a room.", "Example Room");

        assertEquals("Example Room", myRoom.getName());
        assertEquals("This is a room.", myRoom.getDescription());
    }

    @Test
    public void testSetExit() {
        Room room1 = new Room("Room 1", "First Room");
        Room room2 = new Room("Room 2", "Second Room");

        room1.setExit("north", room2);

        assertEquals(room2, room1.getExit("north"));
    }

    @Test
    public void testGetExitString() {
        Room room = new Room("Room with exits", "Exit Room");
        Room neighbor1 = new Room("Neighbor 1", "First Neighbor");
        Room neighbor2 = new Room("Neighbor 2", "Second Neighbor");

        room.setExit("north", neighbor1);
        room.setExit("east", neighbor2);

        assertEquals("Exits: north east", room.getExitString());
    }
}
