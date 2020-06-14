package ujeongri.com.gh.main.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ButtonMainView extends JFrame {
	public ButtonMainView() {
		
		this.setBounds(0, 0, 1440, 900);
		JPanel panel2 = new JPanel();
		
		Image icon = new ImageIcon("src/images/main.png").getImage().getScaledInstance(1440, 900, 0);
		JLabel buttonLabel = new JLabel(new ImageIcon(icon));
		buttonLabel.setBounds(0, 0, 1440, 900);
		
		
		ImageIcon gamestart = new ImageIcon("src/images/gamestart.png");
		JButton btn1 = new JButton(gamestart);
		btn1.setBounds(500, 600, 500, 90);
		btn1.setBorderPainted(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField id = new JTextField(30);
				
				panel2.add(new JLabel("ID"));
				panel2.add(id);
				
				JPasswordField password = new JPasswordField(30);
				panel2.add(new JLabel("PASSWORD"));
				panel2.add(password);
				
				JButton button = new JButton("로그인");
				
				String text = "id= " + id.getText() + "\n";
				text += "password" + password.getPassword() + "\n";
				
				
			}
		});
		
		ImageIcon gameover = new ImageIcon("src/images/gameover.png");
		JButton btn2 = new JButton(gameover);
		btn2.setBounds(500, 700, 500, 90);
		btn2.setBorderPainted(false);
		
		
		buttonLabel.add(btn1);
		buttonLabel.add(btn2);
		panel2.add(buttonLabel);
		this.add(panel2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
