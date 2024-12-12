package com.remote.ejb.views;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.remote.ejb.model.User;

import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;

public class UserGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cedulaTF;
	private JTextField nombreTF;
	private JTextField correoTF;
	private JTextField rolTF;
	private JList userList;
	private JButton addBT;
	private JButton listBT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI frame = new UserGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public String getCedulaTxt() {
		return this.cedulaTF.getText();
	}
	
	public String getNombreTxt() {
		return this.nombreTF.getText();
	}
	
	public String getCorreoTxt() {
		return this.correoTF.getText();
	}
	
	public String getRolTxt() {
		return this.rolTF.getText();
	}
	
	public void registerListModel(ListModel<User> lm) {
		this.getUserList().setModel(lm);
	}
	
	public void addActionListener(ActionListener addBTL, ActionListener lsBTL) {
		this.getAddBT().addActionListener(addBTL);
		this.getListBT().addActionListener(lsBTL);
	}

	/**
	 * Create the frame.
	 */
	public UserGUI() {
		setResizable(false);
		setTitle("Registro Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cedulaTF = new JTextField();
		cedulaTF.setBounds(10, 11, 166, 20);
		contentPane.add(cedulaTF);
		cedulaTF.setColumns(10);
		
		nombreTF = new JTextField();
		nombreTF.setColumns(10);
		nombreTF.setBounds(10, 40, 166, 20);
		contentPane.add(nombreTF);
		
		correoTF = new JTextField();
		correoTF.setColumns(10);
		correoTF.setBounds(10, 71, 166, 20);
		contentPane.add(correoTF);
		
		rolTF = new JTextField();
		rolTF.setColumns(10);
		rolTF.setBounds(10, 102, 166, 20);
		contentPane.add(rolTF);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(186, 14, 85, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(186, 43, 85, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setBounds(186, 74, 85, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rol");
		lblNewLabel_3.setBounds(186, 105, 85, 17);
		contentPane.add(lblNewLabel_3);
		
		addBT = new JButton("Agregar");
		addBT.setBackground(new Color(50, 184, 131));
		addBT.setBounds(267, 30, 133, 40);
		contentPane.add(addBT);
		
		listBT = new JButton("Listar");
		listBT.setBackground(new Color(255, 0, 128));
		listBT.setBounds(267, 82, 133, 40);
		contentPane.add(listBT);
		
		userList = new JList();
		userList.setBounds(62, 145, 277, 105);
		contentPane.add(userList);
	}
	public JList getUserList() {
		return userList;
	}
	public JButton getAddBT() {
		return addBT;
	}
	public JButton getListBT() {
		return listBT;
	}
}
