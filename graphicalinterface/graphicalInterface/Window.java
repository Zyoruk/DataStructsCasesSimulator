package graphicalInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

@SuppressWarnings("serial")
public class Window extends JFrame {

	private JPanel myMainPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setFont(new Font("Century Schoolbook L", Font.BOLD, 16));
		setTitle("Program to compare data structures");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		myMainPanel = new JPanel();
		setContentPane(myMainPanel);
		myMainPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(166, 49, 337, 343);
		myMainPanel.add(panel);
	}
}
