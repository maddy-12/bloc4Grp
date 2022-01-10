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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AddClient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClient frame = new AddClient();
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
	public AddClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClient.setBounds(328, 51, 56, 16);
		contentPane.add(lblClient);
		
		textField = new JTextField();
		textField.setBounds(174, 106, 366, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDuClient = new JLabel("Nom du client");
		lblNomDuClient.setBounds(56, 109, 92, 16);
		contentPane.add(lblNomDuClient);
		
		JButton btnAddClient = new JButton("Ajouter");
		btnAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddClient.setBounds(556, 105, 97, 25);
		contentPane.add(btnAddClient);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 191, 621, 166);
		contentPane.add(scrollPane);
		
		JList listViewClient = new JList();
		scrollPane.setViewportView(listViewClient);
		
		JButton btnUpdateClient = new JButton("Modifier");
		btnUpdateClient.setBounds(211, 399, 97, 25);
		contentPane.add(btnUpdateClient);
		
		JButton btnCancelClient = new JButton("Annuler");
		btnCancelClient.setBounds(328, 399, 97, 25);
		contentPane.add(btnCancelClient);
		
		JButton btnDeleteClient = new JButton("Supprimer");
		btnDeleteClient.setBounds(443, 399, 97, 25);
		contentPane.add(btnDeleteClient);
		
		JButton btnAddClient_1 = new JButton("Ajouter");
		btnAddClient_1.setBounds(556, 153, 97, 25);
		contentPane.add(btnAddClient_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 156, 366, 22);
		contentPane.add(textField_1);
		
		JLabel lblSearch = new JLabel("Rechercher");
		lblSearch.setBounds(56, 162, 92, 16);
		contentPane.add(lblSearch);
	}

}
