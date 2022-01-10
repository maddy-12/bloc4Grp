package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AddUser extends JFrame {

	private JPanel contentPane;
	private JTextField txt_EmailUser;
	private JTextField txt_PasswordUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser frame = new AddUser();
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
	public AddUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAjouterUnUtiilisateur = new JLabel("Ajouter un utilisateur");
		lblAjouterUnUtiilisateur.setBounds(303, 37, 199, 22);
		lblAjouterUnUtiilisateur.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblAjouterUnUtiilisateur);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(58, 111, 56, 16);
		contentPane.add(lblEmail);
		
		txt_EmailUser = new JTextField();
		txt_EmailUser.setBounds(187, 108, 443, 22);
		contentPane.add(txt_EmailUser);
		txt_EmailUser.setColumns(10);
		
		txt_PasswordUser = new JTextField();
		txt_PasswordUser.setBounds(187, 166, 443, 22);
		txt_PasswordUser.setColumns(10);
		contentPane.add(txt_PasswordUser);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(58, 169, 111, 16);
		contentPane.add(lblMotDePasse);
		
		JButton btnAddUser = new JButton("Enregister");
		btnAddUser.setBounds(187, 223, 97, 25);
		contentPane.add(btnAddUser);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 294, 673, 186);
		contentPane.add(scrollPane);
		
		JList list_ViewUser = new JList();
		scrollPane.setViewportView(list_ViewUser);
		
		JButton btnUpdateUser = new JButton("Modifier");
		btnUpdateUser.setBounds(219, 495, 97, 25);
		contentPane.add(btnUpdateUser);
		
		JButton btnCancelUser = new JButton("Annuler");
		btnCancelUser.setBounds(328, 495, 97, 25);
		contentPane.add(btnCancelUser);
		
		JButton btnDeleteUser = new JButton("Supprimer");
		btnDeleteUser.setBounds(438, 495, 97, 25);
		contentPane.add(btnDeleteUser);
	}

}
