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
    private int score;

    /**
     * Constructeur d'objets de classe MiniGame
     */
    public MiniGame()
    {
        // initialisation des variables d'instance
        score = 0;
    }
    
    public int getScore() {
        return score;
    }
    
    public void addToScore(int points) {
        this.score += points;
    }
    
    /**
     *Dice game : queen of hearts and Alice play together
     *values of dice are random - Alice chooses the rules, she needs to lose to win the game
     *
     */
    public void diceGame ()
    {
        JOptionPane.showMessageDialog(null,"Bienvenue dans le jeu de dés !");
        
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
    public void ThumbWar()
    {
        
    }
}



