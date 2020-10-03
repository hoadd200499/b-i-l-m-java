package bai3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Group;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class bai3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai3 frame = new bai3();
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
	public bai3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblNewLabel.setBounds(10, 11, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNgySinh = new JLabel("Ng\u00E0y sinh");
		lblNgySinh.setBounds(10, 36, 68, 14);
		contentPane.add(lblNgySinh);
		
		JLabel lblKhoa = new JLabel("Khoa");
		lblKhoa.setBounds(10, 164, 68, 14);
		contentPane.add(lblKhoa);
		
		JLabel lblTrngThi = new JLabel("Tr\u1EA1ng th\u00E1i");
		lblTrngThi.setBounds(10, 189, 68, 14);
		contentPane.add(lblTrngThi);
		
		txtHoten = new JTextField();
		txtHoten.setBounds(88, 8, 228, 20);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(88, 36, 228, 20);
		contentPane.add(dateChooser);
		
		JPanel panelGioitinh = new JPanel();
		panelGioitinh.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelGioitinh.setBounds(88, 69, 228, 80);
		contentPane.add(panelGioitinh);
		panelGioitinh.setLayout(null);
		
		JRadioButton rdNam = new JRadioButton("Nam");
		rdNam.setMnemonic(KeyEvent.VK_1);
		rdNam.setBounds(27, 39, 61, 23);
		panelGioitinh.add(rdNam);
		
		JRadioButton rdNu = new JRadioButton("N\u1EEF");
		rdNu.setMnemonic(KeyEvent.VK_2);
		rdNu.setBounds(134, 39, 61, 23);
		panelGioitinh.add(rdNu);
		
		JComboBox cbbKhoa = new JComboBox();
		cbbKhoa.setModel(new DefaultComboBoxModel(new String[] {"C\u00F4ng ngh\u1EC7 th\u00F4ng tin", "Ngo\u1EA1i ng\u1EEF", "Qu\u1EA3n tr\u1ECB kinh doanh"}));
		cbbKhoa.setToolTipText("");
		cbbKhoa.setBounds(88, 160, 228, 22);
		contentPane.add(cbbKhoa);
		
		JTextPane txtpTrangthai = new JTextPane();
		txtpTrangthai.setBounds(88, 189, 228, 153);
		contentPane.add(txtpTrangthai);
		
		JButton btThoat = new JButton("Tho\u00E1t");
		btThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btThoat.setBounds(227, 353, 89, 23);
		contentPane.add(btThoat);
		
		JButton btThem = new JButton("Th\u00EAm");
		btThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btThem.setBounds(128, 353, 89, 23);
		contentPane.add(btThem);
	}
}
