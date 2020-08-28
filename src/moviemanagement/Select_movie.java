package moviemanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Select_movie {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_movie window = new Select_movie();
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
	public Select_movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(210, 196, -131, -78);
		panel.add(table);
		
		JLabel lblSelectNewMovie = DefaultComponentFactory.getInstance().createTitle("SELECT DATE AND TIME");
		lblSelectNewMovie.setBackground(Color.BLACK);
		lblSelectNewMovie.setBounds(12, 0, 181, 38);
		panel.add(lblSelectNewMovie);
		
		JCheckBoxMenuItem chckbxmntmDate = new JCheckBoxMenuItem("DATE");
		chckbxmntmDate.setBounds(28, 64, 151, 24);
		panel.add(chckbxmntmDate);
		
		Choice choice = new Choice();
		choice.addMouseListener(new MouseAdapter() {
//			System.out.print("1\n2\n3");
			public void mouseClicked(MouseEvent e) {
			}
		});
		choice.setBounds(196, 64, 28, 22);
		panel.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(255, 64, 28, 22);
		panel.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(316, 64, 28, 22);
		panel.add(choice_2);
		
		Label label = new Label("TIME");
		label.setBounds(58, 118, 121, 30);
		panel.add(label);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(196, 138, 28, 22);
		panel.add(choice_3);
		
		Choice choice_4 = new Choice();
		choice_4.setBounds(316, 138, 28, 22);
		panel.add(choice_4);
		
		Button button = new Button("CONTINUE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(136, 183, 163, 60);
		panel.add(button);
	}
}
