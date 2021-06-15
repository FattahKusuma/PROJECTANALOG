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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField nim;
	private JPasswordField user;
	private JLabel lblSalah;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 555);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DAFTAR MATA KULIAH");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		
		JLabel lblNewLabel_1 = new JLabel("Selamat Datang di UNTAN Mobile App");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		
		JLabel lblUserid = new JLabel("USERID :");
		lblUserid.setBackground(new Color(178, 34, 34));
		lblUserid.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2 = new JLabel("NIM :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		
		JLabel lblSalah = new JLabel("");
		lblSalah.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		contentPane.add(lblSalah);
		
		nim = new JTextField();
		nim.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		nim.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String lblUserid = user.getText();
			String lblNewLabel_2 = nim.getText();
			
			if(lblUserid.equals("1063") && lblNewLabel_2.equals("H1051201063")){
				Pilih pl = new Pilih();
				pl.setVisible(true);
			}
			else {
				lblSalah.setText("USER/NIM yang Anda Masukan Salah!");
			}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		user = new JPasswordField();
		user.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		
		JButton btnNewButton_2 = new JButton("\u2B05");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					WELCOMEPAGE wel=new WELCOMEPAGE();
					wel.setVisible(true);}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUserid)
					.addContainerGap(454, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addContainerGap(476, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(142)
					.addComponent(lblNewLabel_1)
					.addGap(133))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_2)
					.addGap(96)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(nim, Alignment.LEADING)
						.addComponent(user, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(195)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 147, Short.MAX_VALUE)
					.addGap(185))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSalah, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)
							.addGap(55)
							.addComponent(lblUserid)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(nim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_2)
							.addGap(270)))
					.addGap(14)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSalah, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(85))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
