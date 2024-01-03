import java.util.HashMap;
import java.util.*;

public class Room {
    private String name;
    private String description;
    private HashMap<String, Room> exits;
    private int status;
    private Item item;
    private String lienImage;
    private List<Character> charactersList = new ArrayList<>();
    private List<Item> itemList = new ArrayList<>();
    private List<Alice> aliceList = new ArrayList<>();
    public Room(String description, String name, String pathImage) {
        setDescription(description);
        setName(name);
        exits = new HashMap<>();
        setLienImage(pathImage);
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim();
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPath() {
        return lienImage;
    }

    public void setLienImage(String pathImage) {
        if (pathImage != null && !pathImage.trim().isEmpty()) {
            this.lienImage = pathImage.trim();
        } else {
            throw new IllegalArgumentException("Path image cannot be null or empty.");
        }
    }
    
    public List<Character> getCharacter(){
        return charactersList;
    }
    
    public void ajouterPersonnage(Character personnage){
        charactersList.add(personnage);
    }
    
    public void removePersonnage(Character personnage){
        charactersList.remove(personnage);
    }
    
     public List<Alice> getAlice(){
        return aliceList;
    }
    
    public void ajouterAlice(Alice personnage){
        aliceList.add(personnage);
    }
    
    public void removeAlice(Alice personnage){
        aliceList.remove(personnage);
    }
    
    public List<Item> getItemList() {
        return itemList;
    }

    // Méthode pour ajouter un objet à la liste
    public void addItem(Item item) {
        itemList.add(item);
    }

    // Méthode pour retirer un objet de la liste
    public void removeItem(Item item) {
        itemList.remove(item);
    }
    
    public Room getExit(String direction) {
        return exits.get(direction);
    }
    
    public List<String> getAllExits() {
        return new ArrayList<>(exits.keySet());
    }
    
    public String getExitString() {
        StringBuilder exitString = new StringBuilder("Exits: ");
        for (String direction : exits.keySet()) {
            exitString.append(direction).append(" ");
        }
        return exitString.toString().trim();
    }
}
