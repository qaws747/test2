package ujeongri.com.gh.main.view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

 

public class TestView extends JFrame{
 ImageIcon icon = new ImageIcon("src/images/ppap/antppap.png");
 JLabel k = new JLabel();
 
 
 public TestView() {
  

  this.setTitle("10픽셀씩 이미지 이동");
  this.setSize(300, 300);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  this.setLayout(null);


  k.setIcon(icon);
  k.setBounds(300, 300, 44, 98);

  this.add(k);
  
  this.addKeyListener(new KeyAdapter()
  { 
   public void keyPressed(KeyEvent e){
	   
    switch(e.getKeyCode()){
     case KeyEvent.VK_UP:
      k.setLocation(k.getX(), k.getY()-10);
      break;
   
     case KeyEvent.VK_DOWN:
      k.setLocation(k.getX(), k.getY()+10);
      break;
     case KeyEvent.VK_LEFT:
      k.setLocation(k.getX()-10, k.getY());
      break;
     case KeyEvent.VK_RIGHT:
      k.setLocation(k.getX()+10, k.getY());
      break;
   

   }

  }
  });
  
   
  this.setVisible(true);  
 }
 public static void main(String[] args) {
  new TestView();
  
 }
}



