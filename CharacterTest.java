import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testCharacterCreation() {
        Character myCharacter = new Character("John Doe", "A brave adventurer.");

        assertEquals("John Doe", myCharacter.getName());
        assertEquals("A brave adventurer.", myCharacter.getDescription());
    }

    @Test
    public void testSetName() {
        Character myCharacter = new Character("Initial Name", "Initial Description");

        myCharacter.setName("New Name");
        assertEquals("New Name", myCharacter.getName());

        // Test setting an empty name
        try {
            myCharacter.setName("");
            fail("Expected IllegalArgumentException not thrown for empty name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }

        // Test setting a null name
        try {
            myCharacter.setName(null);
            fail("Expected IllegalArgumentException not thrown for null name.");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testSetDescription() {
        Character myCharacter = new Character("Initial Name", "Initial Description");

        myCharacter.setDescription("New Description");
        assertEquals("New Description", myCharacter.getDescription());

        // Test setting an empty description
        try {
            myCharacter.setDescription("");
            fail("Expected IllegalArgumentException not thrown for empty description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }

        // Test setting a null description
        try {
            myCharacter.setDescription(null);
            fail("Expected IllegalArgumentException not thrown for null description.");
        } catch (IllegalArgumentException e) {
            assertEquals("Description cannot be null or empty.", e.getMessage());
        }
    }

    @Test
    public void testDialogue() {
        // Since the dialogue method is empty, we can just test that it doesn't throw an exception
        Character myCharacter = new Character("John Doe", "A brave adventurer.");

        // Call the dialogue method
        myCharacter.dialogue();
    }
}
