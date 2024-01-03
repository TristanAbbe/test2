import java.util.*;

/**
 * Décrivez votre classe TwinsBinDen ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TwinsBinDen extends Room {
    private Twins twins;

    /**
     * Constructeur d'objets de classe TwinsBinDen
     */
    public TwinsBinDen() {
        super("This place looks dangerous! Better to keep both eyes open...", "Twins' Bin Den", "ImagesAlice/TwinsBinDen.png");

        twins = new Twins();
        ajouterPersonnage(twins);
    }
}
