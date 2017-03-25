package Interface;

import Ingenieria.*;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aplicacion {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion window = new Aplicacion();
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
	public Aplicacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Point[] posiciones = Ordenamiento.posicionar(9,3);
	
		
		Button button = new Button("");
		button.setBounds((int) posiciones[0].getX(), (int) posiciones[0].getY(), 50, 50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("1");
		button_1.setBounds((int) posiciones[1].getX(), (int) posiciones[1].getY(), 50, 50);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_1);
			}
		});
		
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("2");
		button_2.setBounds((int) posiciones[2].getX(), (int) posiciones[2].getY(), 50, 50);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_2);
			}
		});
		
		frame.getContentPane().add(button_2);
		
		Button button_3 = new Button("3");
		button_3.setBounds((int) posiciones[3].getX(), (int) posiciones[3].getY(), 50, 50);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_3);
			}
		});
		
		frame.getContentPane().add(button_3);
		
		Button button_4 = new Button("4");
		button_4.setBounds((int) posiciones[4].getX(), (int) posiciones[4].getY(), 50, 50);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_4);
			}
		});
		
		frame.getContentPane().add(button_4);
		
		Button button_5 = new Button("5");
		button_5.setBounds((int) posiciones[5].getX(), (int) posiciones[5].getY(), 50, 50);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_5);
			}
		});
		
		frame.getContentPane().add(button_5);
		
		Button button_6 = new Button("6");
		button_6.setBounds((int) posiciones[6].getX(), (int) posiciones[6].getY(), 50, 50);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_6);
			}
		});
		
		frame.getContentPane().add(button_6);
		
		Button button_7 = new Button("7");
		button_7.setBounds((int) posiciones[7].getX(), (int) posiciones[7].getY(), 50, 50);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_7);
			}
		});
		
		frame.getContentPane().add(button_7);
		
		Button button_8 = new Button("8");
		button_8.setBounds((int) posiciones[8].getX(), (int) posiciones[8].getY(), 50, 50);
		button_8.setActionCommand("8");
		button_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Ordenamiento.presionar(button, button_8);
			}
		});
		
		frame.getContentPane().add(button_8);
		
	}
}
