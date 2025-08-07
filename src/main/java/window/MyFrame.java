package window;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("나온다1");
		
	}
	
}

public class MyFrame extends JFrame {
	JButton btn = new JButton("클릭");
	JTextField tf = new JTextField();  // 여기
	MyFrame() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setLayout(null);
		
		con.add(btn);
		btn.setBounds(10, 20, 70, 40);
		
		con.add(tf);  // 여기
		tf.setBounds(100, 20, 70, 40);  // 여기
		
		this.setLocation(1000, 400);
		this.setSize(300, 200);
		this.setVisible(true);
		
		btn.addActionListener(new window.MyAction());
		
//		btn.addActionListener((e) -> {System.out.println("나온다");});
	}
	class MyAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("나온다2");
			
		}
		
	}

	public static void main(String[] args) {
		new MyFrame();

	}

}
