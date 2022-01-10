package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Font;

public class AddProvider extends JFrame {

	private JPanel contentPane;
	private JTextField txt_provider;
	private JTextField txt_searchProvider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProvider frame = new AddProvider();
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
	public AddProvider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_provider = new JTextField();
		txt_provider.setBounds(229, 111, 341, 22);
		contentPane.add(txt_provider);
		txt_provider.setColumns(10);
		
		JLabel lblNomDuFournisseur = new JLabel("Nom du fournisseur");
		lblNomDuFournisseur.setBounds(69, 114, 148, 16);
		contentPane.add(lblNomDuFournisseur);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(595, 110, 97, 25);
		contentPane.add(btnAjouter);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 187, 627, 180);
		contentPane.add(scrollPane);
		
		JList list_viewProvider = new JList();
		scrollPane.setViewportView(list_viewProvider);
		
		JLabel lblFournisseur = new JLabel("Fournisseur");
		lblFournisseur.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFournisseur.setBounds(303, 56, 134, 16);
		contentPane.add(lblFournisseur);
		
		txt_searchProvider = new JTextField();
		txt_searchProvider.setColumns(10);
		txt_searchProvider.setBounds(229, 152, 341, 22);
		contentPane.add(txt_searchProvider);
		
		JButton btnSearch = new JButton("Rechercher");
		btnSearch.setBounds(595, 149, 97, 25);
		contentPane.add(btnSearch);
		
		JLabel lblSearch = new JLabel("Rechercher");
		lblSearch.setBounds(69, 158, 148, 16);
		contentPane.add(lblSearch);
		
		JButton btnUpdate = new JButton("Modifier");
		btnUpdate.setBounds(255, 380, 97, 25);
		contentPane.add(btnUpdate);
		
		JButton btnCancelProvider = new JButton("Annuler");
		btnCancelProvider.setBounds(364, 380, 97, 25);
		contentPane.add(btnCancelProvider);
		
		JButton btnDeletePrivider = new JButton("Supprimer");
		btnDeletePrivider.setBounds(473, 380, 97, 25);
		contentPane.add(btnDeletePrivider);
	}
}
