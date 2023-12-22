
/**
 * Décrivez votre classe Object ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Item 
{
    private String name;
    private String description;
    private boolean stackable; // if true the items is stackable
    private boolean removable; // if true the item can be removable
    private String iconPath;
    /**
     * Constructeur d'objets de classe Item
     */
    public Item(String name, String description)
    {
        setName(name);
        setDescription(description);
    }
    
    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }
    
    public void setDescription(String description){
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }
    
    public String getIconPath()
    {
        return iconPath;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
}