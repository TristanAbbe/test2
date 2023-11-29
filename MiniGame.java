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
    public void DiceGame ()
    {
        // Insérez votre code ici
        JOptionPane.showMessageDialog(null,"Bienvenue dans le jeu de dés !");
        //Joueur joueur1 = new Joueur("Joueur 1");
        //Joueur joueur2 = new Joueur("Joueur 2");
        
        //System.out.println(joueur.getNom() + ", appuyez sur Entrée pour lancer le dé.");

        // Générer un nombre aléatoire entre 1 et 6 pour simuler le dé
        Random random = new Random();
        int result = random.nextInt(6) + 1;

        //System.out.println(joueur.getNom() + " a obtenu un " + resultatDe + "!");
        //joueur.ajouterAuScore(resultatDe);
        JOptionPane.showMessageDialog(null,"Alice, qui a gagné ?");
        
    }
    
    /**
     *ThumbWar : Alice and the twins play together
     *
     */
    public void ThumbWar()
    {
        
    }
}



