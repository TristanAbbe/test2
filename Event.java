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
            // Rabbit speaks depending on the progress of the game
        } else if (currentRoom.getName().equals("Thumbs war room")) {
            // Start mini-game thumb war
        } else if (currentRoom.getName().equals("Heart queen arena")) {
            // Roll dice mini-game
        } else if (currentRoom.getName().equals("Caterpillar cadle")) {
            // Exchange Doubiprane - Silk
            //Chenille chenille = findChenilleInRoom(currentRoom);

            //if (chenille != null && alice.getInventory().contains("Doubiprane")) {
            //    alice.removeItem(Doubiprane);
            //    alice.addItem(Silk);
            //} 
        } else if (currentRoom.getName().equals("Hatmaker's bunker")) {
            // Exchange Silk - Helmet
            //MadHatter madhatter = findMadHatterInRoom(currentRoom);

            //if (madhatter != null && alice.getInventory().contains("Silk")) {
            //    alice.removeItem(Silk);
            //    alice.addItem(Helmet);
            //}
        } else if (currentRoom.getName().equals("Body-card garden")) {
            // If helmet Alice can pass otherwise she dies
        } else if (currentRoom.getName().equals("Glorious rabbit hole")) {
            // Rabbit guesses
        } else if (currentRoom.getName().equals("Beaver River")) {
            // If Alice took the potion without eating the Grasnolax -> Death
        } else if (currentRoom.getName().equals("Joyless toilets")) {
            // If flushed 3 times --> END OF GAME
        } else {
            // Alice est dans une autre piece...
        }
    }


}
