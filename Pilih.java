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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Pilih extends JFrame {

	private JPanel contentPane;
	private JTextField nama;
	private JTextField nim;
	
	ArrayList<kode> kd = new ArrayList<kode>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pilih frame = new Pilih();
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
	public Pilih() {
		setBackground(new Color(255, 140, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 555);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbnama = new JLabel("NAMA :");
		lbnama.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		nama = new JTextField();
		nama.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		nama.setColumns(10);
		
		JLabel lbnim = new JLabel("NIM :");
		lbnim.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		nim = new JTextField();
		nim.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		nim.setColumns(10);
		
		JLabel lblProdi = new JLabel("PRODI :");
		lblProdi.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		JComboBox prodi = new JComboBox();
		prodi.setModel(new DefaultComboBoxModel(new String[] {"Rekayasa Sistem Informasi", "Sistem Informasi"}));
		prodi.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1 = new JLabel("MATA KULIAH :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		JComboBox matkul = new JComboBox();
		matkul.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		matkul.setModel(new DefaultComboBoxModel(new String[] {"Analisis Algoritma", "Basis Data", "Fisika Dasar", "Kalkulus Lanjut"}));
		
		JLabel lblNewLabel_2 = new JLabel("KELAS :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		JComboBox kelas = new JComboBox();
		kelas.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C"}));
		kelas.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("\u2B05");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log=new Login();
				log.setVisible(true);}
		});
		
		JButton btnNewButton_1 = new JButton("FINISH");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (nama.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
				} else if (nim.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"NIM Tidak Boleh Kosong");
				} else {
				
        String lbnama = nama.getText();
        String lbnim= nim.getText();
        kd.add(new kode(lbnama,lbnim));
        	 
        	 textArea.append("\nNama : " + lbnama + "\nNIM : " + lbnim + "\nProdi : " + prodi.getSelectedItem()+"\nMata Kuliah : "+matkul.getSelectedItem() + "\nKelas : "+kelas.getSelectedItem()
        	 .toString());
 			textArea.setLineWrap(true);
        	 
        

				
				JOptionPane.showMessageDialog(null,"Selamat Anda Berhasil Mendaftar");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addGap(85)
									.addComponent(kelas, 0, 367, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(32)
									.addComponent(matkul, 0, 367, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblProdi)
									.addGap(82)
									.addComponent(prodi, 0, 367, Short.MAX_VALUE))
								.addComponent(btnNewButton)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lbnim)
										.addComponent(lbnama))
									.addGap(83)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(nama, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
										.addComponent(nim, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addGap(218))))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(15)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
							.addComponent(lbnama))
						.addComponent(nama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbnim)
						.addComponent(nim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblProdi)
						.addComponent(prodi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(matkul, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(kelas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addComponent(btnNewButton_1)
					.addGap(31)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
