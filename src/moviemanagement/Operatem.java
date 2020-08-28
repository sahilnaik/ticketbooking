package moviemanagement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Operatem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operatem window = new Operatem();
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
	public Operatem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Book Ticket");
		btnNewButton.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent e) 
			{
				
				l1.setVisible(true);
			          
			           try {
						l.createAndShowGUI();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			           add.setVisible(true);
			           setVisible(false);
			           frame.dispose();    
			        }			
			
		});
		btnNewButton.setBackground(UIManager.getColor("Button.foreground"));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(219, 13, 182, 60);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Movie");
		btnNewButton_1.setBackground(new Color(216, 191, 216));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1.setBounds(219, 136, 182, 52);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Komal_Vedu\\Pictures\\Saved Pictures\\Movie1.jpg"));
		lblNewLabel.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(lblNewLabel);
	}
}
