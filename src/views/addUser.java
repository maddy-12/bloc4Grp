package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class addUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addUser frame = new addUser();
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
	public addUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinscrire = new JLabel("Inscription");
		lblSinscrire.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSinscrire.setBounds(224, 36, 107, 16);
		contentPane.add(lblSinscrire);
		
		JLabel lblAdresseEmail = new JLabel("Adresse e-mail");
		lblAdresseEmail.setBounds(44, 89, 95, 16);
		contentPane.add(lblAdresseEmail);
		
		textField = new JTextField();
		textField.setBounds(171, 86, 344, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setBounds(44, 137, 95, 16);
		contentPane.add(lblMotDePasse);
		
		JLabel lblRole = new JLabel("Role :");
		lblRole.setBounds(44, 179, 56, 16);
		contentPane.add(lblRole);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 134, 345, 22);
		contentPane.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(171, 176, 344, 22);
		contentPane.add(comboBox);
		
		JButton btnAjouter = new JButton("Annuler");
		btnAjouter.setBounds(44, 242, 97, 25);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(171, 242, 97, 25);
		contentPane.add(btnModifier);
		
		JButton btnEnregister = new JButton("Enregister");
		btnEnregister.setBounds(418, 242, 97, 25);
		contentPane.add(btnEnregister);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(296, 242, 97, 25);
		contentPane.add(btnSupprimer);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 299, 478, 156);
		contentPane.add(scrollPane);
		
		JList<? extends E> list = new JList();
		scrollPane.setViewportView(list);
	}
}
