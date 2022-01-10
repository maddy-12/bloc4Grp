package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldOrderProductName;
	private JTextField textFieldOrderClientName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addOrder frame = new addOrder();
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
	public addOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAjouterUneCommande = new JLabel("Ajouter une commande");
		lblAjouterUneCommande.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAjouterUneCommande.setBounds(258, 41, 219, 16);
		contentPane.add(lblAjouterUneCommande);
		
		JLabel lblNomDuProduit = new JLabel("Nom du produit");
		lblNomDuProduit.setBounds(57, 117, 112, 16);
		contentPane.add(lblNomDuProduit);
		
		JLabel lblNomDuClient = new JLabel("Nom du client");
		lblNomDuClient.setBounds(57, 164, 98, 16);
		contentPane.add(lblNomDuClient);
		
		JLabel lblDateDeCommande = new JLabel("Date de commande :");
		lblDateDeCommande.setBounds(57, 214, 124, 16);
		contentPane.add(lblDateDeCommande);
		
		JLabel lblNumroDeCommande = new JLabel("Num\u00E9ro de commande :");
		lblNumroDeCommande.setBounds(57, 261, 139, 16);
		contentPane.add(lblNumroDeCommande);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 342, 641, 180);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		textFieldOrderProductName = new JTextField();
		textFieldOrderProductName.setBounds(177, 114, 228, 22);
		contentPane.add(textFieldOrderProductName);
		textFieldOrderProductName.setColumns(10);
		
		textFieldOrderClientName = new JTextField();
		textFieldOrderClientName.setBounds(176, 161, 229, 22);
		contentPane.add(textFieldOrderClientName);
		textFieldOrderClientName.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(519, 113, 175, 25);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(144, 551, 139, 25);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(319, 551, 132, 25);
		contentPane.add(btnSupprimer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(482, 551, 139, 25);
		contentPane.add(btnAnnuler);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setBounds(57, 310, 112, 16);
		contentPane.add(lblRechercher);
		
		textField = new JTextField();
		textField.setBounds(144, 307, 149, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(293, 306, 97, 25);
		contentPane.add(btnOk);
	}
}
