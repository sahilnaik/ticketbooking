package moviemanagement;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import BookticketDB.BookticketDB;

public class REGISTER_LOGIN extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTER_LOGIN window = new REGISTER_LOGIN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public REGISTER_LOGIN()
	{
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(12, 149, 129, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				BookticketDB ds=new BookticketDB();
				Register r=new Register();
			 setVisible(true);
				
			

			
			}
		});
		btnRegister.setBounds(250, 149, 129, 61);
		frame.getContentPane().add(btnRegister);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Komal_Vedu\\Pictures\\Saved Pictures\\moviebook1.jpg"));
		label.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(label);
	}
	}

}