package ujeongri.com.gh.main.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ButtonMainView extends JFrame  {
	

	MainView mv;
	
	public ButtonMainView(MainView mv) {
		
		//frame 설정
		this.setBounds(100, 100, 1440, 900);
		//panel 생성
		JPanel panel2 = new JPanel();
		//배경화면 깔기
		Image icon = new ImageIcon("src/images/main.png").getImage().getScaledInstance(1440, 900, 0);
		JLabel buttonLabel = new JLabel(new ImageIcon(icon));
		buttonLabel.setBounds(0, 0, 1440, 900);
		
		//버튼1번 설정
		ImageIcon gamestart = new ImageIcon("src/images/gamestart.png");
		JButton btn1 = new JButton(gamestart);
		btn1.setBounds(500, 600, 500, 90);
		btn1.setBorderPainted(false);
		//버튼1번 액션 설정
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn1) {
					LoginView lv = new LoginView();
				}
			}
		});
		
		//버튼2번 설정
		ImageIcon gameover = new ImageIcon("src/images/gameover.png");
		JButton btn2 = new JButton(gameover);
		btn2.setBounds(500, 700, 500, 90);
		btn2.setBorderPainted(false);
		//버튼2번 액션 설정
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn2) {
					System.exit(0);
				}
				
			}
		});
		
		//나타내기
		buttonLabel.add(btn1);
		buttonLabel.add(btn2);                                                                                                                                                                    
		panel2.add(buttonLabel);
		this.add(panel2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	
//	class MyMouseAdapter extends MouseAdapter {
//		@Override
//		public void mousePressed(MouseEvent e) {
//			mv.getContentPane().removeAll();
//			
//			mv.getContentPane().add(lv);
//			
//			mv.repaint();
//			
//		}
//		
//
//	}
}

