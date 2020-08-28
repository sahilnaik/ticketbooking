package moviemanagement;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBackground(new Color(192, 192, 192));
		lblName.setBounds(22, 13, 74, 39);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(174, 13, 142, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPhonenumber = new JLabel("PHONENUMBER");
		lblPhonenumber.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		lblPhonenumber.setBounds(22, 65, 115, 41);
		frame.getContentPane().add(lblPhonenumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 76, 142, 43);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.GRAY);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
		
		
			}
		});
		btnLogin.setBounds(273, 173, 132, 41);
		frame.getContentPane().add(btnLogin);
		
		btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="INSERT INTO movie_database(NAME,PHONE_NUMBER) VALUES(?,?)";
			//	PreparedStatement pstmt= 
						
				
					}
				
			
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(67, 173, 142, 39);
		frame.getContentPane().add(btnNewButton);
		
	
}
	Login l1=new Login();
	
}
