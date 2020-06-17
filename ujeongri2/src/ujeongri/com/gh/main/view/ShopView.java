package ujeongri.com.gh.main.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShopView extends JFrame{
	
	private Image shopIcon;
	private int x, y;
	
	public ShopView() {
//		JFrame frame = new JFrame("우 - 정 - 리");
		super("우 - 정 - 리");
		this.setBounds(100, 90, 1440, 900);

		setLayout(null);
		JPanel panel = new JPanel();
		//shop map 설정
		shopIcon = new ImageIcon("src/images/shopmap.jpeg").getImage().getScaledInstance(2160, 1350, 0);
		JLabel mapLabel = new JLabel(new ImageIcon(shopIcon));
		JLabel pappLabel = new JLabel();
		PlayerView pv = new PlayerView();
		
		
		pappLabel.add(pv);
		panel.add(pappLabel);
		panel.add(mapLabel);
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		
		
		
	}

}