import java.util.ArrayList;
import java.util.List;

public class Alice {
    private LilDrink lilDrink;
    private  List<Item> inventory;
    private  String name;
    private  Room room;
    private  int hunger;
    private  boolean death = false;
    private  String path;

    public Alice() {
        setName("Alice");
        path = "ImagesAlice/Alice.png";
        this.inventory = new ArrayList<>();
        lilDrink = new LilDrink();
        addItem(lilDrink);
    }

    public  void setRoom(Room currentRoom) {
        room = currentRoom;
    }

    public  Room getRoom() {
        return room;
    }
    
    public  void setName(String nom) {
        name = nom;
    }
    
    public  String getName()
    {
        return name;
    }
    
    public  String getPath(){
        return path;
    }
    
        public  void addItem(Item item) {
        inventory.add(item);
    }
    
    public void removeItem(Item item) {
        if (inventory.contains(item))
            inventory.remove(item);
        else
            System.out.println("There is no such item in the inventory");
    }
    
    public  List<Item> getInventory() {
        return inventory;
    }
    
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Item i : inventory) {
            System.out.println(i.getName());
        }
    }
    
        public void move(String direction) {
        if (!death) {
            Room nextRoom = room.getExit(direction);
            if (nextRoom == null) {
                System.out.println("There is no room!");
            } else {
                Alice currentAlice = this;
                room.removeAlice(this);
                room = nextRoom;
                // Decrease hunger by 5 units before move
                currentAlice.decreaseHunger(5);
                room.ajouterAlice(currentAlice);
                

                if (hunger <= 0) {
                    death = true;
                }
            }
        }
    }

    private int decreaseHunger(int amount) {
        return Math.max(0, hunger - amount);
    }

    public  int getHunger() {
        return hunger;
    }

    public  void feed() {
        if (!death) {
            // browse the list to know if she owns a taco
            System.out.println("Inventory:");
            for (Item item : inventory) {
                System.out.println(item.getName());
            }
        }
    }
}
