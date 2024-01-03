import java.util.*;

/**
 * Décrivez votre classe GloriousRabbitHole ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GloriousRabbitHole extends Room {
    private MarchHare rabbit;

    /**
     * Constructeur d'objets de classe GloriousRabbitHole
     */
    public GloriousRabbitHole() {
        super("A small room whose entrance is a tiny hole, a normal-sized person wouldn't be able to fit in at all!"
                + " Nevertheless, this room is very warm with gorgeous objects such as a tea set and a toilet brush. Someone must be living there.",
                "Glorious Rabbit Hole", "ImagesAlice/Glorious_rabbit_hole.png");

        rabbit = new MarchHare();
        ajouterPersonnage(rabbit);
    }
}
