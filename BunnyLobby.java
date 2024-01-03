
/**
 * Décrivez votre classe Bunny_lobby ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class BunnyLobby extends Room
{   private Grasnolax grasnolax;
    /**
     * Constructeur d'objets de classe Bunny_lobby
     */
    public BunnyLobby()
    {
        // initialisation des variables d'instance
        super("A small burrow that you can access through a small door but there seems to be another exit."
        +" A normal-sized person certainly couldn't enter this room. A basket of dusty Granolax is lying on the floor in the corner of the room, weird...", 
        "Bunny Lobby","ImagesAlice/bunny_lobby.png");
        //ImagesAlice/bunny_lobby.png
        grasnolax = new Grasnolax();
        addItem(grasnolax);
    }
}
