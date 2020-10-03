package bai5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class bai5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai5 frame = new bai5();
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
	public bai5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblNewLabel.setBounds(10, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNgySinh = new JLabel("Ng\u00E0y sinh");
		lblNgySinh.setBounds(10, 36, 89, 14);
		contentPane.add(lblNgySinh);
		
		JLabel lblSinThoi = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblSinThoi.setBounds(10, 135, 89, 14);
		contentPane.add(lblSinThoi);
		
		JLabel lblPhCp = new JLabel("Ph\u1EE5 c\u1EA5p ");
		lblPhCp.setBounds(10, 245, 89, 14);
		contentPane.add(lblPhCp);
		
		JLabel lblLoiNhnVin = new JLabel("Lo\u1EA1i nh\u00E2n vi\u00EAn ");
		lblLoiNhnVin.setBounds(10, 195, 89, 14);
		contentPane.add(lblLoiNhnVin);
		
		JLabel lblLng = new JLabel("L\u01B0\u01A1ng");
		lblLng.setBounds(10, 220, 89, 14);
		contentPane.add(lblLng);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(10, 270, 89, 14);
		contentPane.add(lblKtQu);
		
		JTextField txtfHoten = new JTextField();
		txtfHoten.setBounds(109, 8, 221, 20);
		contentPane.add(txtfHoten);
		txtfHoten.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(109, 30, 221, 20);
		contentPane.add(dateChooser);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(109, 61, 221, 67);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("N\u1EEF");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addComponent(rdbtnNewRadioButton_1)
					.addGap(33))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JComboBox cbbLoainhanvien = new JComboBox();
		cbbLoainhanvien.setBounds(109, 191, 221, 22);
		contentPane.add(cbbLoainhanvien);
		
		JCheckBox cbNhanvients = new JCheckBox("Nh\u00E2n vi\u00EAn t\u1EADp s\u1EF1");
		cbNhanvients.setBounds(109, 161, 221, 23);
		contentPane.add(cbNhanvients);
		
		JTextField txtfSodienthoai = new JTextField();
		txtfSodienthoai.setBounds(109, 132, 221, 20);
		contentPane.add(txtfSodienthoai);
		txtfSodienthoai.setColumns(10);
		
		JTextField txtfLuong = new JTextField();
		txtfLuong.setEnabled(false);
		txtfLuong.setBounds(109, 217, 221, 20);
		contentPane.add(txtfLuong);
		txtfLuong.setColumns(10);
		
		JTextField txtfPhucap = new JTextField();
		txtfPhucap.setEnabled(false);
		txtfPhucap.setBounds(109, 242, 221, 20);
		contentPane.add(txtfPhucap);
		txtfPhucap.setColumns(10);
		
		JTextArea txtaKetqua = new JTextArea();
		txtaKetqua.setEnabled(false);
		txtaKetqua.setBounds(109, 265, 221, 147);
		contentPane.add(txtaKetqua);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.setBounds(242, 423, 89, 23);
		contentPane.add(btnThoat);
		
		JButton btnTnh = new JButton("T\u00EDnh ");
		btnTnh.setBounds(143, 423, 89, 23);
		contentPane.add(btnTnh);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.setBounds(10, 423, 89, 23);
		contentPane.add(btnLuu);
	}

}
