import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GUI extends JFrame {

    public GUI() {
        JFrame frame = new JFrame("Nested Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout()); 
        
        
        JPanel southPanel = new JPanel(new GridLayout(1, 4));
        JPanel southWestpanel = new JPanel(new GridLayout(3, 3));
        
        // Create empty buttons for layout
        JButton emptyButton1 = new JButton();
        JButton emptyButton2 = new JButton();
        JButton emptyButton3 = new JButton();
        JButton emptyButton4 = new JButton();
        JButton emptyButton5 = new JButton();
        
        // Create movement buttons
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        
        //create Action Button
        JButton openInventory = new JButton("Inventory");
        JButton talk = new JButton("Parler");        
        
        
        southWestpanel.add(emptyButton1);
        southWestpanel.add(leftButton);
        southWestpanel.add(emptyButton2);
        southWestpanel.add(upButton);
        southWestpanel.add(emptyButton3);
        southWestpanel.add(downButton);
        southWestpanel.add(emptyButton4);
        southWestpanel.add(rightButton);
        southWestpanel.add(emptyButton5);
        
        
        southPanel.add(southWestpanel);
        southPanel.add(openInventory);
        southPanel.add(talk);
        
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        
        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
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
