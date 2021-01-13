
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Ariel Webster
 * 2/1/19
 * 
 * Intro to JFrame, windows, and labels.
 * Altered 2/6/19 - Panel added so that background color will change in new Java
 * Altered 10/2/19 - Comments removed.
 * Altered 10/17/20 - Border Layout and Panel added. 
 */

public class GUI_Lable extends JFrame{
     
    public static void main (String[] args){
        GUI_Lable frame = new GUI_Lable(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
        frame.setLocation(550, 500);
        frame.setSize(300, 300); 
        frame.setTitle("Create Window"); 
         
        JLabel label= new JLabel("Say Stuff"); 
        label.setForeground(Color.blue); 
        label.setFont(new Font("Arial", Font.BOLD, 19)); 
         
        frame.add(label); 
         
		frame.setLayout(new FlowLayout());
		
		frame.add(label, BorderLayout.EAST);
		
		JPanel n = new JPanel();
		n.setBackground(Color.orange);
		JLabel north = new JLabel("North");
		n.add(north);
		frame.add(n, BorderLayout.NORTH);  

    }

}