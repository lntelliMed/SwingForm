package com.intellimed.swing.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtBloodType;
	private JTextField textField;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		initComponents();
		createEvents();
	}



	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/com/intellimed/swing/resources/doctor_32.png")));
		setTitle("Patient Information");

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPatientName = new JLabel("First Name:");
		GridBagConstraints gbc_lblPatientName = new GridBagConstraints();
		gbc_lblPatientName.anchor = GridBagConstraints.EAST;
		gbc_lblPatientName.insets = new Insets(0, 0, 5, 5);
		gbc_lblPatientName.gridx = 0;
		gbc_lblPatientName.gridy = 0;
		contentPane.add(lblPatientName, gbc_lblPatientName);
		
		txtFirstName = new JTextField();
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.anchor = GridBagConstraints.NORTH;
		gbc_txtFirstName.insets = new Insets(0, 0, 5, 0);
		gbc_txtFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstName.gridx = 1;
		gbc_txtFirstName.gridy = 0;
		contentPane.add(txtFirstName, gbc_txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 1;
		contentPane.add(lblLastName, gbc_lblLastName);
		
		txtLastName = new JTextField();
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.insets = new Insets(0, 0, 5, 0);
		gbc_txtLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLastName.gridx = 1;
		gbc_txtLastName.gridy = 1;
		contentPane.add(txtLastName, gbc_txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblBloodType = new JLabel("Blood Type:");
		GridBagConstraints gbc_lblBloodType = new GridBagConstraints();
		gbc_lblBloodType.anchor = GridBagConstraints.EAST;
		gbc_lblBloodType.insets = new Insets(0, 0, 5, 5);
		gbc_lblBloodType.gridx = 0;
		gbc_lblBloodType.gridy = 2;
		contentPane.add(lblBloodType, gbc_lblBloodType);
		
		txtBloodType = new JTextField();
		GridBagConstraints gbc_txtBloodType = new GridBagConstraints();
		gbc_txtBloodType.anchor = GridBagConstraints.NORTH;
		gbc_txtBloodType.insets = new Insets(0, 0, 5, 0);
		gbc_txtBloodType.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBloodType.gridx = 1;
		gbc_txtBloodType.gridy = 2;
		contentPane.add(txtBloodType, gbc_txtBloodType);
		txtBloodType.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 0;
		gbc_lblGender.gridy = 3;
		contentPane.add(lblGender, gbc_lblGender);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnSave = new JButton("Save");

		btnSave.setToolTipText("Save record");
		btnSave.setIcon(new ImageIcon(MainFrame.class.getResource("/com/intellimed/swing/resources/save_16.png")));
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.fill = GridBagConstraints.VERTICAL;
		gbc_btnSave.anchor = GridBagConstraints.WEST;
		gbc_btnSave.gridwidth = 2;
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 0;
		gbc_btnSave.gridy = 5;
		contentPane.add(btnSave, gbc_btnSave);		
	}

	
	private void createEvents() {
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Record saved successfully");
			}
		});
	}
}
