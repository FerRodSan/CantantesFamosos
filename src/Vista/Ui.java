package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Ui extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtCantante;
	protected JTextField txtDisco;
	protected JButton btnInsertar;
	protected JTextPane lblLista;
	protected JLabel lblMostrarLista;
	protected JButton btnMostrar;
	protected JButton btnEliminar;

	/**
	 * Create the frame.
	 */
	public Ui() {
		setMinimumSize(new Dimension(700, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_2 = new JLabel("GENERA TU LISTA");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new LineBorder(Color.DARK_GRAY, 5, true));
		lblNewLabel_2.setBackground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Snap ITC", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("Cantante");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		txtCantante = new JTextField();
		GridBagConstraints gbc_txtCantante = new GridBagConstraints();
		gbc_txtCantante.gridwidth = 3;
		gbc_txtCantante.insets = new Insets(0, 0, 5, 5);
		gbc_txtCantante.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCantante.gridx = 2;
		gbc_txtCantante.gridy = 3;
		contentPane.add(txtCantante, gbc_txtCantante);
		txtCantante.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Disco");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		txtDisco = new JTextField();
		GridBagConstraints gbc_txtDisco = new GridBagConstraints();
		gbc_txtDisco.gridwidth = 3;
		gbc_txtDisco.insets = new Insets(0, 0, 5, 5);
		gbc_txtDisco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDisco.gridx = 2;
		gbc_txtDisco.gridy = 5;
		contentPane.add(txtDisco, gbc_txtDisco);
		txtDisco.setColumns(10);

		btnInsertar = new JButton("Insertar");
		GridBagConstraints gbc_btnInsertar = new GridBagConstraints();
		gbc_btnInsertar.fill = GridBagConstraints.BOTH;
		gbc_btnInsertar.gridwidth = 4;
		gbc_btnInsertar.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertar.gridx = 1;
		gbc_btnInsertar.gridy = 7;
		contentPane.add(btnInsertar, gbc_btnInsertar);

		lblLista = new JTextPane();
		lblLista.setSelectionColor(Color.WHITE);
		GridBagConstraints gbc_lblLista = new GridBagConstraints();
		gbc_lblLista.fill = GridBagConstraints.VERTICAL;
		gbc_lblLista.gridwidth = 4;
		gbc_lblLista.insets = new Insets(0, 0, 5, 5);
		gbc_lblLista.gridx = 1;
		gbc_lblLista.gridy = 9;
		contentPane.add(lblLista, gbc_lblLista);
		
		lblMostrarLista = new JLabel("");
		GridBagConstraints gbc_lblMostrarLista = new GridBagConstraints();
		gbc_lblMostrarLista.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMostrarLista.anchor = GridBagConstraints.NORTH;
		gbc_lblMostrarLista.gridheight = 2;
		gbc_lblMostrarLista.gridwidth = 4;
		gbc_lblMostrarLista.insets = new Insets(0, 0, 5, 5);
		gbc_lblMostrarLista.gridx = 1;
		gbc_lblMostrarLista.gridy = 10;
		contentPane.add(lblMostrarLista, gbc_lblMostrarLista);
		
		btnMostrar = new JButton("Mostrar Lista");
		GridBagConstraints gbc_btnMostrar = new GridBagConstraints();
		gbc_btnMostrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMostrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnMostrar.gridx = 1;
		gbc_btnMostrar.gridy = 12;
		contentPane.add(btnMostrar, gbc_btnMostrar);
		
		btnEliminar = new JButton("Eliminar Lista");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.gridwidth = 2;
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 12;
		contentPane.add(btnEliminar, gbc_btnEliminar);
	}
}
