package ujeongri.com.gh.main.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShopView extends JFrame{
	
	public ShopView() {
		this.setBounds(100, 100, 1440, 900);

		JPanel panel = new JPanel();
		//shop map 설정
		Image icon = new ImageIcon("src/images/shopmap.jpeg").getImage().getScaledInstance(2160, 1350, 0);
		JLabel mapLabel = new JLabel(new ImageIcon(icon));
		
		PlayerView pv = new PlayerView();
		pv.setSize(1, 1);
		
		
		panel.add(pv);
		panel.add(mapLabel);
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		
		
	}

}
