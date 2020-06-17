package ujeongri.com.gh.main.view;

import java.awt.Image;
import java.awt.Toolkit;
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
	private int x, y;
	private int a = 10;
	private Image pappIcon;
//	private KeyBoardTestListenter KeyL;

	
	public PlayerView() {
		setLayout(null);
	this.setBounds(300, 300, 44, 92);
	
	
	pappIcon = new ImageIcon("src/images/antppap.png").getImage().getScaledInstance(44, 92, 0);
	ImageIcon realicon = new ImageIcon(pappIcon);

//	JButton pappButton = new JButton(realicon);
//	pappButton.setBounds(300, 300, 44, 92);
//	pappButton.setBorderPainted(false);
	JLabel pappLabel = new JLabel(new ImageIcon(pappIcon));
	pappLabel.setBounds(300, 300, 44, 98);
	
	pappLabel.addKeyListener(new KeyAdapter() {
	});
	
//	KeyL = new KeyBoardTestListenter();
//	pappButton.addKeyListener((KeyListener) KeyL);
//	setFocusable(true);
	
//	x = 100;
//	y = 100;
	
//	toolkit = this.getToolkit();
	

	this.add(pappLabel);
//	this.add(pappButton);
	this.setVisible(true);
	}
	class move implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			//좌표를 n만큼 이동하고 이미지를 반복한다.
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
 			String strKey = KeyEvent.getKeyText(keyCode);
			System.out.println("Pressed Up");

 			if( strKey.equals("Up")) {
 				System.out.println("Pressed Up");

 				if( y > 0 )	{
 					y -= 10;
 				} repaint();
 			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
	}
	
	
}