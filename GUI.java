import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI {
    private AliceInWonderlandGame game;
    private Room currentRoomG;
    private JTextArea dialogueTextArea;
    private JProgressBar hungerProgressBar;
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel centerLeftPanel;
    private JPanel centerRightPanel;

    // Fonts
    private static final Font FONT_BIG = new Font("Arial", Font.BOLD, 40);
    private static final Font FONT_MEDIUM = new Font("Arial", Font.BOLD, 28);

    public GUI(AliceInWonderlandGame game) {
        this.game = game;
        initializeGUI();
    }

    private void initializeGUI() {
        currentRoomG = game.getCurrentRoom();
        frame = new JFrame("Alice in Wonderland Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        JPanel centerPanel = createCenterPanel();
        JPanel southPanel = createSouthPanel();

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel(new GridLayout(1, 3));
        centerLeftPanel = createCenterLeftPanel();
        centerPanel.add(centerLeftPanel);
        centerPanel.add(createCenterImagePanel());
        centerRightPanel = createCenterRightPanel();
        centerPanel.add(centerRightPanel);
        return centerPanel;
    }

    private JPanel createCenterLeftPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setPreferredSize(new Dimension(200, 150));

        JLabel nameLabel = createFormattedLabel(game.getCurrentRoom().getName(), FONT_BIG);
        JLabel descriptionLabel = createFormattedLabel(game.getCurrentRoom().getDescription(), FONT_MEDIUM);

        panel.add(nameLabel);
        panel.add(descriptionLabel);

        return panel;
    }

    private JLabel createFormattedLabel(String text, Font font) {
        JLabel label = new JLabel("<html>" + text + "</html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(font);
        return label;
    }

    private JPanel createCenterImagePanel() {
        ImageIcon imageIcon = new ImageIcon(game.getCurrentRoom().getPath());
        JLabel imageLabel = new JLabel(imageIcon);
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        return imagePanel;
    }

    private JPanel createCenterRightPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        ImageIcon imageAlice = new ImageIcon(game.getAlice().getPath());
        JLabel imageLabelAlice = new JLabel(imageAlice);
        panel.add(imageLabelAlice, BorderLayout.NORTH);

        JLabel inventoryLabel = createInventoryLabel();
        panel.add(inventoryLabel, BorderLayout.CENTER);

        hungerProgressBar = new JProgressBar(0, 100);
        hungerProgressBar.setStringPainted(true);
        panel.add(hungerProgressBar, BorderLayout.SOUTH);

        return panel;
    }

    private JLabel createInventoryLabel() {
        JLabel inventoryLabel = new JLabel("Inventory: ");
        inventoryLabel.setLayout(new FlowLayout());
        for (Item item : game.getAlice().getInventory()) {
            String iconPath = item.getIconPath();
            ImageIcon itemIcon = new ImageIcon(iconPath);
            JLabel itemLabel = new JLabel(itemIcon);
            inventoryLabel.add(itemLabel);
        }
        return inventoryLabel;
    }

    private JPanel createSouthPanel() {
        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel southWestPanel = createSouthWestPanel();
        dialogueTextArea = new JTextArea(5, 40);
        dialogueTextArea.setEditable(false);  // Make it non-editable

        southPanel.add(southWestPanel);
        southPanel.add(new JScrollPane(dialogueTextArea));  // Add the dialogueTextArea in a JScrollPane

        return southPanel;
    }

    private JPanel createSouthWestPanel() {
        JPanel southWestPanel = new JPanel(new GridLayout(3, 3));

        JButton actionButton = new JButton("Action");
        JButton parlerButton = new JButton("Parler");
        JButton exitButton = new JButton("Exits");

        JButton moveLeftButton = new JButton("West");
        JButton moveUpButton = new JButton("North");
        JButton moveDownButton = new JButton("South");
        JButton moveRightButton = new JButton("East");

        JButton emptyButton4 = new JButton();
        JButton emptyButton5 = new JButton();

        southWestPanel.add(actionButton);
        southWestPanel.add(moveUpButton);
        southWestPanel.add(parlerButton);
        southWestPanel.add(moveLeftButton);
        southWestPanel.add(exitButton);
        southWestPanel.add(moveRightButton);
        southWestPanel.add(emptyButton4);
        southWestPanel.add(moveDownButton);
        southWestPanel.add(emptyButton5);

        addActionListeners(moveLeftButton, moveUpButton, moveDownButton, moveRightButton, actionButton, parlerButton, exitButton);

        return southWestPanel;
    }

    private void addActionListeners(JButton... buttons) {
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(button.getText());
                }
            });
        }
    }

    private void handleButtonClick(String buttonLabel) {
        switch (buttonLabel) {
            case "West":
            case "North":
            case "South":
            case "East":
                game.handleMove(buttonLabel);
                updateAll();
                break;
            case "Action":
                action();
                break;
            case "Parler":
                parler();
                break;
            case "Exits":
                sortie();
                break;
            default:
                // Handle other button actions if needed
                break;
        }
    }

    private void action() {
        // Implement action logic
    }

    public void parler() {
        // Check if the current room has characters
        List<Character> characters = currentRoomG.getCharacter();

        if (characters.isEmpty()) {
            appendDialogue("There is no one to speak with in this room.");
        } else {
            // take the first character in the list
            Character characterToParler = characters.get(0);

            // Get the character's dialogue
            String dialogue = characterToParler.dialogue();

            // Display the dialogue in the dialogueTextArea
            appendDialogue(dialogue);
        }
    }

    private void sortie() {
        Room currentRoom = game.getCurrentRoom();

        // Retrieve the exits of the current room
        List<String> exits = currentRoom.getAllExits();

        // Check if there are exits
        if (!exits.isEmpty()) {
            // Display the exits in the dialogue area
            String exitsMessage = "You can go : " + String.join(", ", exits);
            appendDialogue(exitsMessage);
        } else {
            // If no exits, display a message
            appendDialogue("There are no exits in this room.");
        }
    }

    private void appendDialogue(String dialogue) {
        dialogueTextArea.append(dialogue + "\n");
    }

    public void updateAll(){
        updateHungerProgressBar();
        updateInventoryLabel();
        updateCurrentRoomInfo();
        updateDialogueTextArea("oui oui");
        
    }
    
    public void updateInventoryLabel() {
        // Update the inventory label in the GUI
        JLabel inventoryLabel = createInventoryLabel();
        centerRightPanel.removeAll();
        centerRightPanel.add(inventoryLabel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }
    
    public void updateHungerProgressBar() {
        // Update the hunger progress bar in the GUI
        int hungerValue = game.getAlice().getHunger();
        hungerProgressBar.setValue(hungerValue);
        hungerProgressBar.setString("Hunger: " + hungerValue + "%");
    }

    public void updateDialogueTextArea(String message) {
        // Update the dialogue text area in the GUI
        appendDialogue(message);
    }

    public void updateCurrentRoomInfo() {
        // Update the current room information in the GUI
        JLabel nameLabel = createFormattedLabel(game.getCurrentRoom().getName(), FONT_BIG);
        JLabel descriptionLabel = createFormattedLabel(game.getCurrentRoom().getDescription(), FONT_MEDIUM);
        centerLeftPanel.removeAll();
        centerLeftPanel.add(nameLabel);
        centerLeftPanel.add(descriptionLabel);
        frame.revalidate();
        frame.repaint();
    }
}
