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
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SnK extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnK frame = new SnK();
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
	public SnK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 555);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD83D\uDCF6");
		
		JTextPane txtpnSyaratDanKetentuan = new JTextPane();
		txtpnSyaratDanKetentuan.setForeground(new Color(255, 255, 255));
		txtpnSyaratDanKetentuan.setBackground(new Color(25, 25, 112));
		txtpnSyaratDanKetentuan.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		txtpnSyaratDanKetentuan.setText("SYARAT DAN KETENTUAN :\r\n\r\n1. MERUPAKAN MAHASISWA AKTIF\r\n2. SUDAH MEMBAYAR UKT\r\n3. BAGI MAHASISWA YANG MENGULANG MATA KULIAH\r\n\r\nPERJANJIAN :\r\n1. APABILA SUDAH TERDAFTAR, BERARTI SUDAH MEMENUHI SYARAT\r\n2. DATA MAHASISWA SUDAH TERSIMPAN DI SERVER\r\n3. APABILA MAHASISWA LUPA USERID NYA, TIDAK BISA DI RESET ULANG");
		
		JButton btnNewButton = new JButton("YA, SAYA SETUJU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Login log=new Login();
					log.setVisible(true);}
		});
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtpnSyaratDanKetentuan, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE)
								.addGap(26))
							.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(177))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtpnSyaratDanKetentuan, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(66))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
