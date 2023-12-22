import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 * Décrivez votre classe Alice ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Alice extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre/**
    List<Item> inventory = new ArrayList<>();
    private static  Room room; 
    private int hunger;
    private boolean death = false ;
    private Room currentRoom ;
    
    public Alice()
    {
        // initialisation des variables d'instance
        super("Alice", "Hello, I am Alice");
        
    }
    
    public static  void setRoom(Room currentRoom)
    {
        room=currentRoom;
    }
    
    public static Room getRoom()
    {
        return room;
    }
    
    // public static void changeRoom(String direction)
    // {
        // Room roomA = getRoom().leaveRoom(direction);
        // if(roomA!=null){
            // setRoom  (roomA);
            // getRoom().activeEvent(Game.getEventList());
        // }
    // }
    
        public void addItem(Item item)
    {
        inventory.add(item);
    }    
    
    public void removeItem(Item item)
    {
        if (inventory.contains(item))
            inventory.remove(item);
        else
            System.out.println("There is no such item in the inventory");
    } 
    
    public void displayInventory() 
    {
    for (Item i : inventory)
        {
            System.out.println(i.getName()); 
        }
    }
    
    public List<Item> getInventory()
    {
        return inventory;   
    }
    
<<<<<<< HEAD
    //public void giveItem()
    //{
        //if (){
            
        //}
        //removeItem(item);
    //}

    
    public void receiveItem(Item item) {
        addItem(item);
        System.out.println("you receive an item : " + item.getName());
    }

    public void giveItem(Character receiver, Item item) {
        if (inventory != null && !inventory.isEmpty()) {
            removeItem(item);
            Item givenItem = item;
            System.out.println("you give " + givenItem.getName() + " to " + receiver.getName());//à changer dans le GUI
            receiver.receiveItem(givenItem);
        } else {
            System.out.println("your inventory is empty");//à changer dans le GUI
        }
    }
    
    /**
     * This method allows Alice to move, her hunger level gets closer to 0 when she moves
     */
    public void move(int orientation) 
    {
        if (!death) 
        {
        String direction = null;//bouton déplacement 
        Room nextRoom = null;
        nextRoom = currentRoom.getExit(direction);
=======
    // Méthode pour le déplacement d'Alice
    public void move(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
>>>>>>> 660d8fcf1f3b3a170c9a96984e288a327aa5d312

        if (nextRoom == null) {
            JOptionPane.showMessageDialog(null, "There is no room in that direction!");
        } else {
            currentRoom = nextRoom;
            JOptionPane.showMessageDialog(null, "You have moved to " + currentRoom.getName());
            //currentRoom.handleEvent();  // Call a method to handle events in the new room if needed

            // Perte de 5 de faim à chaque déplacement
            hunger -= 5;
            if (hunger <= 0) {
                JOptionPane.showMessageDialog(null, "You are too hungry and have died!");
                // Implémentez ici la logique pour gérer la mort d'Alice
            }
        }
<<<<<<< HEAD
    
    public void feed()//methode qui s'apparente à un compteur
=======
    }
        
    public int getHunger ()
     {
         return hunger;
     }
     
    public void feed()
>>>>>>> 660d8fcf1f3b3a170c9a96984e288a327aa5d312
    {
        if (!death) {
            //browse the list to know if she owns a specific item
            for (int i = 0; i < inventory.size(); i++) {
            Object element = inventory.get(i);
            JOptionPane.showMessageDialog(null, element);
        }
        }
    }
    }

    
