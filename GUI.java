import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
public class GUI {
    private AliceInWonderlandGame game;
    private Character character;
    private Room currentRoomG;
    private JTextArea dialogueTextArea;
    private Alice alice; 
    private Item item ;
    private JProgressBar hungerProgressBar;
    public GUI() {
        JFrame frame = new JFrame("Nested Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main content panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Center panel with Grid
        JPanel centerPanel = new JPanel(new GridLayout (1,3));
        JPanel centerLeftPanel = new JPanel(new GridLayout (2,1));
        JPanel centerRightPanel = new JPanel(new BorderLayout());

        JTextArea descriptionArea = new JTextArea();
        descriptionArea.setText("test");// a remplacer par afficheDescriptionSalle()
        descriptionArea.setEditable(false);
        centerLeftPanel.add(descriptionArea);
        
        centerPanel.add(centerLeftPanel);
        

        
        // Créer une instance de JLabel avec une ImageIcon
        
        ImageIcon imageIcon = new ImageIcon("Images_Alice/Beaver_river.jpg"); 
        JLabel imageLabel = new JLabel(imageIcon);
        centerPanel.add(new JLabel(imageIcon));
                
        
        
        // Create inventory label
        //JLabel inventoryLabel = afficheInventaire();
        //centerRightPanel.add(inventoryLabel, BorderLayout.NORTH);

        // Create hunger progress bar
        JProgressBar hungerProgressBar = new JProgressBar(0, 100);
        hungerProgressBar.setStringPainted(true); // Show percentage text
        centerRightPanel.add(hungerProgressBar, BorderLayout.SOUTH);

        centerPanel.add(centerRightPanel);
        
        
        
        
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        // South panel
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel southWestPanel = new JPanel(new GridLayout (3,3));
        
        JButton emptyButton1 = new JButton();
        JButton emptyButton2 = new JButton();
        JButton emptyButton3 = new JButton();
        JButton emptyButton4 = new JButton();
        JButton emptyButton5 = new JButton();
        
        JButton moveLeftButton = new JButton("Left");
        JButton moveUpButton = new JButton("Up");
        JButton moveDownButton = new JButton("Down");
        JButton moveRightButton = new JButton("Right");

        // Create movement buttons
        southWestPanel.add(emptyButton1);
        southWestPanel.add(moveUpButton);
        southWestPanel.add(emptyButton2);
        southWestPanel.add(moveLeftButton);
        southWestPanel.add(emptyButton3);
        southWestPanel.add(moveDownButton);
        southWestPanel.add(emptyButton4);
        southWestPanel.add(moveRightButton);
        southWestPanel.add(emptyButton5);
        southPanel.add(southWestPanel);
        // Add ActionListener to the movement buttons
        moveLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("West");
            }
        });

        moveUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("North");
            }
        });

        moveDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("South");
            }
        });

        moveRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMove("East");
            }
        });
        
        // Create actions buttons
        JButton actionButton = new JButton("Action");
        actionButton.addActionListener(new ActionListener()
        {
           @Override
           public void actionPerformed(ActionEvent e){
               action();
           }
        });
        
        JButton parlerButton = new JButton("Parler");
        parlerButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                parler(); 
            }
        });
        southPanel.add(actionButton);
        southPanel.add(parlerButton);
        
        JPanel southeastPanel = new JPanel(new BorderLayout());
        dialogueTextArea = new JTextArea();
        dialogueTextArea.setEditable(false);  // Make it non-editable
        southeastPanel.add(new JScrollPane(dialogueTextArea), BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void parler() {
        // Check if the current room has a character
        if (currentRoomG != null && currentRoomG.getCharacter() != null) {
            // Display the character's dialogue
            String dialogue = currentRoomG.getCharacter().dialogue();
            appendDialogue(dialogue);
        } else {
            // Display a generic message if there is no character in the room
            appendDialogue("There is no one to parler with in this room.");
        }
    }
        // Method to append dialogue to the TextArea
    private void appendDialogue(String dialogue) {
        dialogueTextArea.append(dialogue + "\n");
    }
    // Method to handle movement based on the button clicked
    private void handleMove(String direction) {
        alice.move(direction);
        updateHungerProgressBar();
    }
    
    private void updateHungerProgressBar() {
        int hunger = alice.getHunger();
        hungerProgressBar.setValue(hunger);
        hungerProgressBar.setString("Hunger: " + hunger + "%");
    }
    
    public String afficheDescriptionSalle() {
    Room currentRoomG = game.getCurrentRoom();
    return currentRoomG.getDescription();
    }
    
    public JLabel afficheInventaire() {
        List<Item> inventory = alice.getInventory();
        // Create a label to hold the inventory icons
        JLabel inventoryLabel = new JLabel();

        // Set the layout to a horizontal flow layout
        inventoryLabel.setLayout(new FlowLayout());

        for (Item item : inventory) {
            // Get the icon path for the current item
            String iconPath = item.getIconPath();

            // Create an ImageIcon using the icon path
            ImageIcon itemIcon = new ImageIcon(iconPath);

            // Create a label with the item's icon
            JLabel itemLabel = new JLabel(itemIcon);

            // Add the label to the inventory label
            inventoryLabel.add(itemLabel);
        }

        return inventoryLabel;
    }
    
    public void action(){
        
    }
    
    public String imageRoom(){
        Room currentRoomG = game.getCurrentRoom();
        return(currentRoomG.getLienImage());
    }

    
    public static void main() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}