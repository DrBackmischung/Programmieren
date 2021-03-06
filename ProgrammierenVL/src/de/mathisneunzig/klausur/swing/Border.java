package de.mathisneunzig.klausur.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Border extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Border frame = new Border();
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
	public Border() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4, BorderLayout.CENTER);
	}

}
