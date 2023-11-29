import javax.swing.JOptionPane;
/**
 * Décrivez votre classe Character ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

//surcharge : nom, description

public class Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private String description;
    
    /**
     * Constructeur d'objets de classe Character
     */
    public Character(String name, String description)
    {
        this.name = name;
        this.description = description;
        Character personnage = new Character("CheshireCat", "Une description.");
        personnage.dialogue(); // Cela affichera la boîte de dialogue
    }

    // Getters et setters (méthodes d'accès)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    // Méthode pour afficher un dialogue
    public void dialogue() {
        String message = "Bonjour, je suis " + name + ". " + description;
        JOptionPane.showMessageDialog(null, message, "Dialogue de " + name, JOptionPane.INFORMATION_MESSAGE);
    }
}
