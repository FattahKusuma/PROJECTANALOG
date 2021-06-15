package DAFTARMATKUL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class WELCOMEPAGE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WELCOMEPAGE frame = new WELCOMEPAGE();
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
	public WELCOMEPAGE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 555);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		
		JLabel lblNewLabel = new JLabel("UNTAN MOBILE APP");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		
		JLabel lblNewLabel_1 = new JLabel("Bersama UNTAN, Membangun Negeri");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		
		JLabel label_1 = new JLabel("\uD83D\uDCF6");
		
		JButton btnNewButton = new JButton("MASUK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			SnK sk=new SnK();
			sk.setVisible(true);}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel lblBelumMempunyaiUser = new JLabel("BELUM MEMPUNYAI USER ID?");
		lblBelumMempunyaiUser.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		
		JLabel lblFkcompany = new JLabel("FKCompany\u00AE");
		lblFkcompany.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(lblFkcompany)
					.addPreferredGap(ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(211)
					.addComponent(label)
					.addContainerGap(379, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(172, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(163))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(147, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(137))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(109)
					.addComponent(lblBelumMempunyaiUser)
					.addContainerGap(265, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(222, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(212))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(label)
							.addGap(34)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)
							.addGap(101)
							.addComponent(btnNewButton)
							.addGap(255)
							.addComponent(lblBelumMempunyaiUser))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblFkcompany)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
