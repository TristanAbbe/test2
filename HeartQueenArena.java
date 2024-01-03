import java.util.*;

/**
 * Décrivez votre classe HeartQueenArena ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class HeartQueenArena extends Room {
    private QueenOfHearts queen;

    /**
     * Constructeur d'objets de classe HeartQueenArena
     */
    public HeartQueenArena() {
        super("I better understand why these body cards were guarding the door: there is a gigantic throne. Next to it, a gold"
                + " table with 2 dice placed on it. On the other side, a bar with piles of bottles as well as a small one which stands out due to its very strange"
                + " appearance. A powerful and very important person must live here, surely a king...",
                "Queen of Hearts' Arena", "ImagesAlice/Heart_queen_arena.png");

        queen = new QueenOfHearts();
        ajouterPersonnage(queen);
    }
}
