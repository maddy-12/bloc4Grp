package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addProduct extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldPrice;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addProduct frame = new addProduct();
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
	public addProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 822);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAjouterUnProduit_title = new JLabel("Ajouter un produit");
		lblAjouterUnProduit_title.setFont(new Font("SansSerif", Font.BOLD, 23));
		lblAjouterUnProduit_title.setBounds(192, 13, 214, 30);
		contentPane.add(lblAjouterUnProduit_title);
		
		JLabel lblProductName = new JLabel("Nom du produit : ");
		lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductName.setBounds(36, 93, 126, 19);
		contentPane.add(lblProductName);
		
		JLabel lblProviderName = new JLabel("Fournisseur : ");
		lblProviderName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProviderName.setBounds(36, 140, 126, 19);
		contentPane.add(lblProviderName);
		
		JLabel lblFamille = new JLabel("Famille : ");
		lblFamille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFamille.setBounds(36, 183, 126, 19);
		contentPane.add(lblFamille);
		
		JLabel lblPrice = new JLabel("Prix : ");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(36, 227, 126, 19);
		contentPane.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantit\u00E9 : ");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantity.setBounds(36, 267, 126, 19);
		contentPane.add(lblQuantity);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(163, 92, 317, 22);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(163, 226, 317, 22);
		contentPane.add(textFieldPrice);
		
		JSpinner spinnerQtityValue = new JSpinner();
		spinnerQtityValue.setBounds(163, 266, 317, 22);
		contentPane.add(spinnerQtityValue);
		
		JButton btnCancel = new JButton("Annuler");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(163, 314, 148, 25);
		contentPane.add(btnCancel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(163, 139, 317, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(163, 182, 317, 22);
		contentPane.add(comboBox_1);
		
		JButton btnSave = new JButton("Enregistrer");
		btnSave.setBounds(332, 314, 148, 25);
		contentPane.add(btnSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 428, 482, 261);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnMettreJour = new JButton("Mettre \u00E0 jour");
		btnMettreJour.setBounds(138, 716, 131, 25);
		contentPane.add(btnMettreJour);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(297, 716, 131, 25);
		contentPane.add(btnSupprimer);
		
		textField = new JTextField();
		textField.setBounds(250, 393, 170, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.setBounds(421, 392, 97, 25);
		contentPane.add(btnRechercher);
		
		JLabel lblListeDesProduits = new JLabel("Liste des produits");
		lblListeDesProduits.setBounds(36, 399, 126, 16);
		contentPane.add(lblListeDesProduits);
	}
}
