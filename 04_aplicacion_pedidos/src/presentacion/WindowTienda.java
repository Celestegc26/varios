package presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Pedido;
import service.ClienteService;
import service.TiendaServiceFactory;

public class WindowTienda extends JFrame {

	private JPanel contentPane;
	private JTextField tfProducto;
	private JTextField tfUnidades;
	private JTextField tfTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowTienda frame = new WindowTienda();
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
	public WindowTienda() {
		ClienteService clienteService= TiendaServiceFactory.getClienteService();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Producto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(133, 28, 68, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Unidades:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(133, 61, 68, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tienda:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(133, 94, 68, 22);
		contentPane.add(lblNewLabel_2);
		
		tfProducto = new JTextField();
		tfProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfProducto.setBounds(211, 31, 86, 20);
		contentPane.add(tfProducto);
		tfProducto.setColumns(10);
		
		tfUnidades = new JTextField();
		tfUnidades.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfUnidades.setBounds(211, 64, 86, 20);
		contentPane.add(tfUnidades);
		tfUnidades.setColumns(10);
		
		tfTienda = new JTextField();
		tfTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTienda.setBounds(211, 97, 86, 20);
		contentPane.add(tfTienda);
		tfTienda.setColumns(10);
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteService.nuevoPedido(new Pedido (0, tfProducto.getText(), Integer.parseInt(tfUnidades.getText()), tfTienda.getText())); 
			}
		});
		btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn.setBounds(184, 127, 89, 23);
		contentPane.add(btn);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(109, 180, 124, 22);
		contentPane.add(lblNewLabel_3);
	}
	
	
}
