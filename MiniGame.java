import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Décrivez votre classe MiniGame ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MiniGame
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    /**
     * Constructeur d'objets de classe MiniGame
     */
    public MiniGame()
    {
        
    }
    
    /**
     *Dice game : queen of hearts and Alice play together
     *values of dice are random - Alice chooses the rules, she needs to lose to win the game
     *
     */
    public void diceGame ()
    {
        JOptionPane.showMessageDialog(null,"Welcome to the dice game !");
        
        int player1Roll = rollDice();
        int player2Roll = rollDice();
        
    }
    
        public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
    }

    /**
     *ThumbWar : Alice and the twins play together
     *
     */
    public void thumbWar() {
        JOptionPane.showMessageDialog(null, "Let's play Thumb War: Alice vs. the Twins!");
        
        int aliceThumbCount = 5; // Assuming Alice has 5 fingers initially
        int twinsThumbCount = 5; // Twins also start with 5 fingers
        
        Random random = new Random();
        
        while (aliceThumbCount > 0 && twinsThumbCount > 0) {
            JOptionPane.showMessageDialog(null, "Alice has " + aliceThumbCount + " fingers left.");
            JOptionPane.showMessageDialog(null, "Twins have " + twinsThumbCount + " fingers left.");
            
            int aliceThumbPosition = random.nextInt(5); // Alice randomly selects a thumb to use
            int twinsThumbPosition = random.nextInt(5); // Twins randomly select a thumb to use
            
            JOptionPane.showMessageDialog(null, "Alice chooses finger " + (aliceThumbPosition + 1));
            JOptionPane.showMessageDialog(null, "Twins choose finger " + (twinsThumbPosition + 1));
            
            if (aliceThumbPosition == twinsThumbPosition) {
                JOptionPane.showMessageDialog(null, "It's a tie! Try again.");
            } else if ((aliceThumbPosition + 1) % 5 == twinsThumbPosition) {
                JOptionPane.showMessageDialog(null, "Alice wins this round!");
                twinsThumbCount--;
            } else {
                JOptionPane.showMessageDialog(null, "Twins win this round!");
                aliceThumbCount--;
            }
        }
        
        if (aliceThumbCount == 0) {
            JOptionPane.showMessageDialog(null, "Twins win the Thumb War!");
        } else {
            JOptionPane.showMessageDialog(null, "Alice wins the Thumb War!");
        }
    }
}



