
package ujeongri.com.gh.game.view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ujeongri.com.gh.main.view.ButtonMainView;

public class ShopView extends JFrame{
	
//	private ImageIcon shopicon = null;
//	private ImageIcon pappIcon = null;

//	private int x, y;

	public ShopView() {
		super("우 - 정 - 리");
		this.setBounds(100, 100, 1440, 900);
//		this.setLayout(null);

		JPanel panel = new JPanel();
		//shop map 설정
		Image shopIcon = new ImageIcon("src/images/shopmap.png").getImage().getScaledInstance(2160, 1350, Image.SCALE_SMOOTH);
		JLabel mapLabel = new JLabel(new ImageIcon(shopIcon));
		mapLabel.setBounds(0, 0, 1440, 900);
		
		//빱이 설정
		ImageIcon pappIcon = new ImageIcon("src/images/antppap.png");
		JButton pappButton = new JButton();
		pappButton.setBounds(300, 300, 44, 98);
		pappButton.setBorderPainted(false);
		
//		pappButton.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyCode() == KeyEvent.VK_UP) {
////					bt.removeAll();
////					bt.add(new ButtonMainView(null));
////					bt.repaint();
//					ButtonMainView bmv = new ButtonMainView();
//					dispose();
//				}
//			}
//			
//			
//		});
		
		mapLabel.add(pappButton);
		panel.add(mapLabel);

		this.add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

} 