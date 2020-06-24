package ujeongri.com.gh.game.view;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShopView extends JFrame{
	
	private Image shopIcon;
//	private int x, y;
	
	public ShopView() {
		super("우 - 정 - 리");
		this.setBounds(100, 100, 1440, 900);
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1440, 900);
		
		//shop map 설정
		shopIcon = new ImageIcon("src/images/shopmap.png").getImage().getScaledInstance(2160, 1350, 0);
		JLabel mapLabel = new JLabel(new ImageIcon(shopIcon));
		
//		JPanel panel2 = new JPanel();
//		panel.setBounds(300, 300, 44, 98);
		Image pappIcon = new ImageIcon("src/images/antppap.png").getImage().getScaledInstance(44, 98, 0);
		ImageIcon realicon = new ImageIcon(pappIcon);
		JLabel pappLabel = new JLabel(new ImageIcon(pappIcon));
		pappLabel.setBounds(300, 300, 44, 98);
		
//		panel2.add(pappLabel);
		panel.add(mapLabel);
		
//		this.add(panel2);
		panel.add(pappLabel);
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		
		
		
	}

}