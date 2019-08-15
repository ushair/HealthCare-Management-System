package health;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.Appointment;
import panels.Details;
import panels.Emergency;
import panels.History;
import panels.Lab;
import panels.Recomendation;
import panels.Record;
import panels.Shared;


import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class Drhome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drhome frame = new Drhome();
					frame.setResizable(false);
					
					frame.setSize(1368, 740);
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
	public Drhome() {
		final JPanel dpanel = new JPanel();
		final CardLayout cl = new CardLayout();
		cl.setHgap(300);
		cl.setVgap(200);
		dpanel.setLayout(cl);
		final Recomendation rcan = new Recomendation();
		final Appointment acan= new Appointment();
		final Lab lcan = new Lab();
		final History hcan = new History();
		final Details dcan= new Details();
		final Record rdcan=new Record();
		final Shared scan = new Shared();
		final Emergency ecan= new Emergency();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setSize(MAXIMIZED_BOTH, MAXIMIZED_BOTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Patient Record");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

cl.show(dpanel, "5");			}
		});
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Appointment");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cl.show(dpanel, "3");
			}
		});
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patient History");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

cl.show(dpanel, "6");}
		});
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lab Report");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

cl.show(dpanel, "8");}
		});
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Patient Detail");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

cl.show(dpanel, "7");}
		});
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Recommendation");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cl.show(dpanel, "2");
			}
		});
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Emergency");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

cl.show(dpanel, "1");
			}
		});
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Shared Data");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			scan.setBackground(Color.BLACK);
cl.show(dpanel, "4");			}
		});
		panel.add(lblNewLabel_7);
		
	    contentPane.add(dpanel, BorderLayout.CENTER);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Health Care Management System");
		lblWelcomeToThe.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 33));
		dpanel.add(lblWelcomeToThe, "name_366780125840678");

		dpanel.add(ecan,"1");
		dpanel.add(rcan,"2");
		dpanel.add(acan,"3");
		dpanel.add(scan,"4");
		dpanel.add(rdcan,"5");
		dpanel.add(hcan, "6");
		dpanel.add(dcan, "7");
		dpanel.add(lcan, "8");
		dpanel.setVisible(true);
		
		
		
		
	}
}
