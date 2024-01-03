
/**
 * Décrivez votre classe Helmet ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Helmet extends Item
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Helmet
     */
    public Helmet()
    {
        // initialisation des variables d'instance
        super("Helmet",
        "This magnificent headgear adorned with a menacing spike could well come in handy.  They seem to be the same ones used by the body cards.",
        "ImagesAlice/casque.png");
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return x + y;
    }
}
