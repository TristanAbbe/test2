
/**
 * Décrivez votre classe Event ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Event
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe Event
     */
    public Event()
    {
    }

    public void handleRoomEvent(Alice alice, Room currentRoom) {
        if (currentRoom.getName().equals("Catwalk")) {
            // Lapin parler en fonction de l'avancement du jeu
        } else if (currentRoom.getName().equals("Thumbs war room")) {
            // Lancer mini-jeu de pouces
        } else if (currentRoom.getName().equals("Heart queen arena")) {
            // Lancer mini-jeu de dès
        } else if (currentRoom.getName().equals("Caterpillar cadle")) {
            // Echanger Doubiprane contre Soie
        } else if (currentRoom.getName().equals("Hatmaker's bunker")) {
            // Réaliser d'autres actions pour une autre salle
            System.out.println("...");
        } else if (currentRoom.getName().equals("Body-card garden")) {
            // Réaliser d'autres actions pour une autre salle
            System.out.println("...");
        } else if (currentRoom.getName().equals("Body-card garden")) {
            // Réaliser d'autres actions pour une autre salle
            System.out.println("...");
        } else if (currentRoom.getName().equals("Glorious rabbit hole")) {
            // Réaliser d'autres actions pour une autre salle
            System.out.println("...");
        } else if (currentRoom.getName().equals("Beaver River")) {
            // Réaliser d'autres actions pour une autre salle
            System.out.println("...");
        } else if (currentRoom.getName().equals("Joyless toilets")) {
            // Réaliser d'autres actions pour une autre salle
            System.out.println("...");
        } else {
            // Si la pièce actuelle n'est associée à aucune action spécifique
            System.out.println("Vous êtes dans une pièce non spécifiée.");
        }
    }

}
