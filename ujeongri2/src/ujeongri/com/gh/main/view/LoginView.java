
package ujeongri.com.gh.main.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {

	public LoginView() {
		this.setBounds(500, 500, 400, 100);
		
		JPanel panel3 = new JPanel();
		
		JTextField id = new JTextField(10);
		panel3.add(new JLabel("ID"));
		panel3.add(id);
		
		JPasswordField password = new JPasswordField(10);
		panel3.add(new JLabel("PASSWORD"));
		panel3.add(password);
		
		JButton btn3 = new JButton("login");
		
		this.add(panel3, BorderLayout.NORTH);
		this.add(btn3, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}