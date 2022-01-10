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

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField txt_SearchInventory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInventaire = new JLabel("Inventaire");
		lblInventaire.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInventaire.setBounds(396, 43, 169, 16);
		contentPane.add(lblInventaire);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setBounds(76, 135, 97, 16);
		contentPane.add(lblRechercher);
		
		txt_SearchInventory = new JTextField();
		txt_SearchInventory.setBounds(197, 132, 505, 22);
		contentPane.add(txt_SearchInventory);
		txt_SearchInventory.setColumns(10);
		
		JButton btnSearchInventory = new JButton("Rechercher");
		btnSearchInventory.setBounds(714, 131, 97, 25);
		contentPane.add(btnSearchInventory);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 203, 738, 276);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnUpdate = new JButton("Modifier");
		btnUpdate.setBounds(301, 492, 97, 25);
		contentPane.add(btnUpdate);
		
		JButton btnDeleteInventory = new JButton("Suppprimer");
		btnDeleteInventory.setBounds(411, 492, 97, 25);
		contentPane.add(btnDeleteInventory);
		
		JButton btnCancelInventory = new JButton("Annuler");
		btnCancelInventory.setBounds(518, 492, 97, 25);
		contentPane.add(btnCancelInventory);
	}

}
