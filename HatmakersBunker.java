import java.util.*;

/**
 * Décrivez votre classe Hatmakers_bunker ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class HatmakersBunker extends Room
{
    private MadHatter hatter;
    /**
     * Constructeur d'objets de classe Hatmakers_bunker
     */
    public HatmakersBunker()
    {
      super("A well-protected underground location. It looks like someone lives here given the amount of hats."
        +" These hats decorate the walls in a very original way, especially this little spiked helmet.", "Hatmaker's Bunker","ImagesAlice/hatmakers_bunker.png");
        hatter= new MadHatter();
        ajouterPersonnage(hatter);
    }
    
}
