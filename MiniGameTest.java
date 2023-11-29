import org.junit.Test;
import static org.junit.Assert.*;

public class MiniGameTest {

    @Test
    public void testMiniGameCreation() {
        // Create a MiniGame and check its initial score
        MiniGame miniGame = new MiniGame();
        assertEquals(0, miniGame.getScore());
    }

    @Test
    public void testAddToScore() {
        // Create a MiniGame and add points to its score
        MiniGame miniGame = new MiniGame();
        miniGame.addToScore(10);
        assertEquals(10, miniGame.getScore());
    }

    @Test
    public void testDiceGame() {
        // Create a MiniGame and simulate playing the Dice Game
        MiniGame miniGame = new MiniGame();
        miniGame.DiceGame();
        // Check the score after playing the game (adjust based on the actual logic of the game)
        assertTrue(miniGame.getScore() >= 0); // Assuming the score can't be negative
    }

    @Test
    public void testThumbWar() {
        // Create a MiniGame and simulate playing Thumb War
        MiniGame miniGame = new MiniGame();
        miniGame.ThumbWar();
        // Check the score after playing the game (adjust based on the actual logic of the game)
        assertTrue(miniGame.getScore() >= 0); // Assuming the score can't be negative
    }
}
