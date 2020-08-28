package moviemanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextField;
import java.awt.Scrollbar;
import javax.swing.JSlider;

public class Select_movie_2 {

	private JFrame frame;
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_movie_2 window = new Select_movie_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Select_movie_2() {
		initialize();
	}
		private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectMovie = DefaultComponentFactory.getInstance().createTitle("SELECT MOVIE");
		lblSelectMovie.setBounds(34, 0, 220, 25);
		frame.getContentPane().add(lblSelectMovie);
	}
}
