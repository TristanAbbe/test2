import javax.swing.*;
import java.awt.*;
    
public class GUI {

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
        southPanel.add(new JButton("Action"));
        southPanel.add(new JButton("Parler"));
    
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void affichebutton(){
        
    }
    
    public void afficheDescription(){
        
    }
    
    public void afficheInventaire(){
        
    }
    
    public void talk(){
        
    }
    
    public void action(){
        
    }
    
    public static void main() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}
