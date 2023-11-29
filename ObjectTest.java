import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectTest {

    @Test
    public void testObjectCreation() {
        Object myObject = new Object("Example Object", "This is an example object.");
        assertEquals("Example Object", myObject.getName());
        assertEquals("This is an example object.", myObject.getDescription());
    }

    @Test
    public void testSetName() {
        Object myObject = new Object("Initial Name", "Initial Description");

        myObject.setName("New Name");
        assertEquals("New Name", myObject.getName());

        // Test setting an empty name
        try {
            myObject.setName("");
            fail("Expected IllegalArgumentException not thrown for empty name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }

        // Test setting a null name
        try {
            myObject.setName(null);
            fail("Expected IllegalArgumentException not thrown for null name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testSetDescription() {
        Object myObject = new Object("Initial Name", "Initial Description");

        myObject.setDescription("New Description");
        assertEquals("New Description", myObject.getDescription());

        // Test setting an empty description
        try {
            myObject.setDescription("");
            fail("Expected IllegalArgumentException not thrown for empty description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }

        // Test setting a null description
        try {
            myObject.setDescription(null);
            fail("Expected IllegalArgumentException not thrown for null description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }
    }
}
