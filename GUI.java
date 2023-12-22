import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI {
    private AliceInWonderlandGame game;
    private Character character;
    private Room currentRoomG;
    private JTextArea dialogueTextArea;
    public GUI() {
        JFrame frame = new JFrame("Nested Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main content panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Center panel with Grid
        JPanel centerPanel = new JPanel(new GridLayout (1,3));
        JPanel centerLeftPanel = new JPanel(new GridLayout (2,1));
        centerLeftPanel.add (new JTextField("description1"));
        centerLeftPanel.add (new JTextField("description2"));
        centerPanel.add(centerLeftPanel);
        
        // Créer une instance de JLabel avec une ImageIcon
        ImageIcon imageIcon = new ImageIcon("C:/Users/TRIST/Pictures/screenshots/faitpeur.png"); 
        JLabel imageLabel = new JLabel(imageIcon);
        centerPanel.add(new JLabel(imageIcon));
        
        
        JPanel centerRightPanel = new JPanel();
        centerRightPanel.add(new JTextField("inventaire"));
        
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
        

        // Create movement buttons
        southWestPanel.add(emptyButton1);
        southWestPanel.add(new JButton("Left"));
        southWestPanel.add(emptyButton2);
        southWestPanel.add(new JButton("Up"));
        southWestPanel.add(emptyButton3);
        southWestPanel.add(new JButton("Down"));
        southWestPanel.add(emptyButton4);
        southWestPanel.add(new JButton("Right"));
        southWestPanel.add(emptyButton5);
        southPanel.add(southWestPanel);
        // Create actions buttons
        JButton actionButton = new JButton("Action");
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

    public void affichebutton(){
        
    }
    
    public void afficheDescription(){

        JTextArea descriptionArea = new JTextArea();
        Room currentRoomG = game.getCurrentRoom();
        descriptionArea.setText(currentRoomG.getDescription());
        descriptionArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(descriptionArea);

        JOptionPane.showMessageDialog(null, scrollPane, "Room Description - " + currentRoomG.getName(), JOptionPane.PLAIN_MESSAGE);
    }
    
    public void afficheInventaire(){
        
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
