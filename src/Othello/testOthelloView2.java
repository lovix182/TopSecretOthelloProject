package Othello;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class testOthelloView2 extends JPanel{
    public static void main(String[] args) {
    JFrame f = new JFrame("Othello!");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(600, 600);
    f.setLocation(500, 200);
    
    Color custom = new Color(4,57,39);
    JPanel gamePanel = new JPanel();
    gamePanel.setBackground(custom);
    gamePanel.setLayout(new GridLayout(10,10,5,5));
    f.add(gamePanel);

    f.setVisible(true);




    }

    
}

    

