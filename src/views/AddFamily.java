package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AddFamily extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_FamilyName;
	private JTextField txt_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFamily frame = new AddFamily();
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
	public AddFamily() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_FamilyName = new JTextField();
		txt_FamilyName.setBounds(183, 120, 317, 22);
		contentPane.add(txt_FamilyName);
		txt_FamilyName.setColumns(10);
		
		JLabel lblAjouterUneF = new JLabel("Ajouter une famille");
		lblAjouterUneF.setBounds(28, 123, 143, 16);
		contentPane.add(lblAjouterUneF);
		
		JLabel lblFamilleDeVin = new JLabel("Famille de vin");
		lblFamilleDeVin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFamilleDeVin.setBounds(251, 42, 129, 16);
		contentPane.add(lblFamilleDeVin);
		
		JButton btnAdd = new JButton("Ajouter");
		btnAdd.setBounds(539, 119, 97, 25);
		contentPane.add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 256, 608, 136);
		contentPane.add(scrollPane);
		
		JList list_familyView = new JList();
		scrollPane.setViewportView(list_familyView);
		
		JButton btnSearch = new JButton("Rechercher");
		btnSearch.setBounds(539, 196, 97, 25);
		contentPane.add(btnSearch);
		
		JButton btnCancel = new JButton("Annuler");
		btnCancel.setBounds(294, 405, 97, 25);
		contentPane.add(btnCancel);
		
		JButton btnUpdate = new JButton("Modifier");
		btnUpdate.setBounds(185, 405, 97, 25);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Supprimer");
		btnDelete.setBounds(403, 405, 97, 25);
		contentPane.add(btnDelete);
		
		txt_search = new JTextField();
		txt_search.setColumns(10);
		txt_search.setBounds(183, 197, 317, 22);
		contentPane.add(txt_search);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setBounds(28, 200, 143, 16);
		contentPane.add(lblRechercher);
	}
}
