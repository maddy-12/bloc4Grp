package views;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class addOrder extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_OrderProductName;
	private JTextField txt_OrderClientName;
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
		
		txt_OrderProductName = new JTextField();
		txt_OrderProductName.setBounds(177, 114, 490, 22);
		contentPane.add(txt_OrderProductName);
		txt_OrderProductName.setColumns(10);
		
		txt_OrderClientName = new JTextField();
		txt_OrderClientName.setBounds(176, 161, 491, 22);
		contentPane.add(txt_OrderClientName);
		txt_OrderClientName.setColumns(10);
		
		JButton btnAddOrder = new JButton("Ajouter");
		btnAddOrder.setBounds(73, 551, 161, 25);
		contentPane.add(btnAddOrder);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(246, 551, 139, 25);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(397, 551, 132, 25);
		contentPane.add(btnSupprimer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(541, 551, 139, 25);
		contentPane.add(btnAnnuler);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setBounds(57, 310, 112, 16);
		contentPane.add(lblRechercher);
		
		textField = new JTextField();
		textField.setBounds(144, 307, 402, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Rechercher");
		btnSearch.setBounds(558, 306, 136, 25);
		contentPane.add(btnSearch);
	}
}
