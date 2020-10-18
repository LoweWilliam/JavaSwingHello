import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(500, 500);
    frame.setLayout(null);

    // create a Button and a Label
    JButton helloButton = new JButton("Click Me!");
    JLabel outputLabel = new JLabel();
    JButton helpButton = new JButton("Don't click me!");
    JLabel outoutLabel = new JLabel();
    // place and size for components
    // setBounds(x position, y position, width, height)
    helloButton.setBounds(100, 100, 100, 50);
    helpButton.setBounds(100, 100, 100, 50);
    outputLabel.setBounds(100,200,200,50);
    outoutLabel.setBounds(400,200,300,100);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
    outoutLabel.setFont(new Font("Arial", Font.PLAIN, 32));
    outputLabel.setForeground(Color.BLUE);
    outoutLabel.setForeground(Color.GREEN);
  
    // add components to JFrame f
    frame.add(helloButton);
    frame.add(outputLabel);
    frame.add(helpButton);
    frame.add(outoutLabel);
    
    // add event listener for button click
    helloButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("Hello World!");
      }    });
      helpButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outoutLabel.setText("Go Away!");
      }    });
    
    // make the frame visible
    frame.setVisible(true);
    frame.setVisible(true);
  }
}