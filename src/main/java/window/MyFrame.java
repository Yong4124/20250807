package window;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyAction implements ActionListener {

	String msg;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(msg);
		
	}
	
}

public class MyFrame extends JFrame {
	JButton btn = new JButton("클릭");
	JButton btn2 = new JButton("윈도우");
	JTextField tf = new JTextField();  // 여기
	MyFrame2 myFrame2 = new MyFrame2();
	MyFrame() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setLayout(null);
		
		con.add(btn);
		btn.setBounds(10, 20, 70, 40);
		
		con.add(tf);  // 여기
		tf.setBounds(100, 20, 70, 40);  // 여기
		
		con.add(btn2);
		btn2.setBounds(200, 20, 70, 40);
		
		this.setLocation(1000, 400);
		this.setSize(300, 200);
		this.setVisible(true);
		
		btn.addActionListener(new MyAction());
		
		
		btn2.addActionListener((e) -> myFrame2.setVisible(true));
	}
	class MyAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText());
		}
		
	}
	
	class MyFrame2 extends JFrame {
		public MyFrame2() {
			Container con = this.getContentPane();
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			con.setLayout(null);
			
			this.setLocation(1300, 400);
			this.setSize(300, 200);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new MyFrame();

	}

}






