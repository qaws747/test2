package ujeongri.com.gh.main.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerView extends JPanel {
	JFrame frame = new JFrame();
	public PlayerView() {
	this.setBounds(10, 10, 50, 50);
	
	ImageIcon icon = new ImageIcon("src/images/antppap.png");
	JButton pappButton = new JButton(icon);
//	JLabel papp = new JLabel(new ImageIcon(icon));
	pappButton.setBounds(10, 10, 50, 50);
	pappButton.setBorderPainted(false);
	
//	pappButton.addKeyListener(new KeyAdapter() {
//		@Override
//		public void keyPressed(KeyEvent e) {
//			
//		}
//		
//		
//		
//		
//	})
	
	this.add(pappButton);
//	this.setVisible(true);
	frame.add(this);
	frame.setVisible(true);
	}
	class move implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
	}
	
	
}
