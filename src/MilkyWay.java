
/**
 * Write a description of class MilkyWay here.
 *
 * @author (Tim )
 * @version (1.0)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class MilkyWay extends JFrame implements ActionListener  
{
    Random myRandom = new Random(); // Used to create the random numbers below

    // Declare any other variables and components you want to use here
    private JPanel goPanel;
    private JButton goButton; 
    private JTextField textField;
    private JLabel instructionsLabel;
    // You shouldn't need to change anything in the main method
    public static void main (String[] args)
    {
        MilkyWay frame = new MilkyWay();
        frame.setSize(600, 600);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    // Use the createGUI method to create your graphical components like
    // buttons, text boxes, etc..  You also need to lay them out on the screen
    // and add event handlers to the components that need them.
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new BorderLayout());
        
        goPanel = new JPanel();
        goPanel.setSize(new Dimension(200, 200));
        goPanel.setBackground(Color.white);
        window.add(goPanel);
        
        goButton = new JButton("Go");
        window.add(goButton);
        goButton.addActionListener(this);
        
        instructionsLabel = new JLabel("How many stars would you like to make?");
        
        goPanel = new JPanel();
        goPanel.add(instructionsLabel);
        
    }
    
    // The paint method will be used to draw the circles on the screen
    // AFTER you trigger the event handler.  You will need to add a
    // conditional statement in this method so the circles aren't drawn
    // before the event is triggered.  Remember, the paint method will be
    // called once when the program is initially launched.
    // Also, make sure you clear the screen every time before a new set of
    // circles is drawn.
    public void paint(Graphics g)
    {
        super.paint(g);
    }

    // Use the actionPerformed method to notify your program that the
    // event has been triggered.  You should NOT be drawing any circles
    // in this method.
    public void actionPerformed(ActionEvent event)
    {
        Graphics paper = goPanel.getGraphics();
        paper.setColor(Color.black);
        paper.fillRect(0, 0, 200, 200);
        paper.setColor(Color.white);
        for (int count = 0; count <20; count++) {
            int x,y, radius;
            x = myRandom.nextInt(200);
            y = myRandom.nextInt(200);
            radius = 5;
            paper.fillOval(x,y,radius,radius);
        }
    }    
}
