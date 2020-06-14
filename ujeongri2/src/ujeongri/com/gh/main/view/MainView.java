package ujeongri.com.gh.main.view;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MainView extends JFrame {
	

	public MainView() {
		super("우 - 정 - 리");

		this.setBounds(100, 100, 1440, 900);
		
		JPanel panel1 = new JPanel();
		
		Image icon = new ImageIcon("src/images/mainfont.png").getImage().getScaledInstance(1440, 900, 0);
		JLabel label = new JLabel(new ImageIcon(icon));
		
		
		
		panel1.add(label, "Center");
		this.add(panel1);
		panel1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					ButtonMainView bmv = new ButtonMainView();
					bmv.setVisible(true);
				}
			}
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
}
