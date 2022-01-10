package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;

public class Home extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JButton btnShowProduct = new JButton("Ajouter un produit");
	private final JLabel lblBienvenu = new JLabel("Bienvenu dans ");
	private final JLabel lblNewLabel = new JLabel("votre backoffice");
	private final JLabel lblNewLabel_1 = new JLabel("Navigation");
	private final JButton btnAjouterUneFamille = new JButton("Ajouter une famille");
	private final JButton btnFournisseur = new JButton("Fournisseur");
	private final JButton btnAjouterUnClient = new JButton("Ajouter un client");
	private final JButton btnAjouterUnUtilisateur = new JButton("Ajouter un utilisateur");
	private final JButton btnInventaire = new JButton("Inventaire");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(0, 0, 209, 669);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel_1.setBounds(56, 23, 83, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProduct product = new addProduct();
				product.setVisible(true);
				this.hide();
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnShowProduct.setBounds(12, 140, 166, 25);
		panel.add(btnShowProduct);
		
		JButton btnCommander = new JButton("Commander");
		btnCommander.setBounds(12, 86, 166, 25);
		panel.add(btnCommander);
		btnAjouterUneFamille.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFamily family = new AddFamily();
				family.setVisible(true);
				this.hide();
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnAjouterUneFamille.setBounds(12, 193, 166, 25);
		
		panel.add(btnAjouterUneFamille);
		btnFournisseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProvider provider = new AddProvider();
				provider.setVisible(true);
				this.hide();
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnFournisseur.setBounds(12, 247, 166, 25);
		
		panel.add(btnFournisseur);
		btnAjouterUnClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddClient client = new AddClient();
				client.setVisible(true);
				this.hide();
				
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnAjouterUnClient.setBounds(12, 297, 166, 25);
		
		panel.add(btnAjouterUnClient);
		btnAjouterUnUtilisateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser user = new AddUser();
				user.setVisible(true);
				this.hide();
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnAjouterUnUtilisateur.setBounds(12, 355, 166, 25);
		
		panel.add(btnAjouterUnUtilisateur);
		btnInventaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inv = new Inventory();
				inv.setVisible(true);
				this.hide();
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnInventaire.setBounds(12, 407, 166, 25);
		
		panel.add(btnInventaire);
		btnCommander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addOrder order = new addOrder();
				order.setVisible(true);
				this.hide();
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		lblBienvenu.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblBienvenu.setBounds(272, 144, 304, 199);
		
		contentPane.add(lblBienvenu);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(278, 283, 298, 90);
		
		contentPane.add(lblNewLabel);
	}
}
