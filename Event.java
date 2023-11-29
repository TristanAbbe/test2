/**
 * Décrivez votre classe Event ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Event
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    /**
     * Constructeur d'objets de classe Event
     */
    public Event()
    {
    }

    public void handleRoomEvent (Alice alice, Room currentRoom) {
        if (currentRoom.getName().equals("Catwalk")) {
            // Lapin parler en fonction de l'avancement du jeu
        } else if (currentRoom.getName().equals("Thumbs war room")) {
            // Lancer mini-jeu de pouces
        } else if (currentRoom.getName().equals("Heart queen arena")) {
            // Lancer mini-jeu de dès
        } else if (currentRoom.getName().equals("Caterpillar cadle")) {
            // Echanger Doubiprane contre Soie
            //Chenille chenille = findChenilleInRoom(currentRoom);

            //if (chenille != null && alice.getInventory().contains("Doubiprane")) {
            //    alice.getInventory().remove("Doubiprane");
            //    alice.getInventory().add("Silk");
            //} 
        } else if (currentRoom.getName().equals("Hatmaker's bunker")) {
            // Echanger Soie contre casque
            //MadHatter madhatter = findMadHatterInRoom(currentRoom);

            //if (madhatter != null && alice.getInventory().contains("Silk")) {
            //    alice.getInventory().remove("Silk");
            //    alice.getInventory().add("Helmet");
            //}
        } else if (currentRoom.getName().equals("Body-card garden")) {
            // Si casque elle peut passer sinon elle meurt
        } else if (currentRoom.getName().equals("Glorious rabbit hole")) {
            // Lapin fait la devinette
        } else if (currentRoom.getName().equals("Beaver River")) {
            // Si Alice a pris la potion sans manger le Grasnolax -> Mort
        } else if (currentRoom.getName().equals("Joyless toilets")) {
            // Si chasse d'eau tirée 3 fois --> FIN DU JEU
        } else {
            // Alice est dans une autre piece...
        }
    }


}
