package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 259, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ecunha\\git\\LeilaoTF\\LeilaoTF\\src\\dados\\logotipo.png"));
		lblNewLabel.setBounds(10, 11, 154, 54);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar novo leil\u00E3o");
		btnNewButton.setBounds(10, 90, 210, 23);
		panel.add(btnNewButton);
		
		JLabel lblFiltros = new JLabel("Filtro por natureza");
		lblFiltros.setBounds(10, 134, 133, 14);
		panel.add(lblFiltros);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Demanda");
		rdbtnNewRadioButton.setBounds(6, 155, 119, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Oferta");
		rdbtnNewRadioButton_1.setBounds(127, 155, 115, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Lotes");
		lblNewLabel_1.setBounds(10, 197, 46, 14);
		panel.add(lblNewLabel_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produto", "Descricao"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 221, 232, 230);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 220, 220));
		panel_1.setBounds(260, 0, 544, 462);
		contentPane.add(panel_1);
	}
}
