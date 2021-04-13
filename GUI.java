import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;

public class GUI extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setBackground(Color.RED);
		setAutoRequestFocus(false);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		getContentPane().add(chckbxNewCheckBox, BorderLayout.WEST);
		//setBounds(100, 100, 666, 431);
	}

}
