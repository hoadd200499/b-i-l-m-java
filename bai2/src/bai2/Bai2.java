package bai2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtfHotenkhachhang;
	private JTextField txtfKhoiluongnuoc;
	private JTextField txtfSodienthoai;
	private JTextField txtfTiennuoc;
	private JSpinner spnSonhankhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 frame = new Bai2();
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
	public Bai2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn kh\u00E1ch h\u00E0ng");
		lblNewLabel.setBounds(10, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNgySinh = new JLabel("Ng\u00E0y sinh");
		lblNgySinh.setBounds(10, 36, 113, 14);
		contentPane.add(lblNgySinh);
		
		JLabel lblSinThoi = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblSinThoi.setBounds(10, 153, 113, 14);
		contentPane.add(lblSinThoi);
		
		JLabel lbliTngS = new JLabel("\u0110\u1ED1i t\u01B0\u1EE3ng s\u1EED d\u1EE5ng");
		lbliTngS.setBounds(10, 178, 113, 14);
		contentPane.add(lbliTngS);
		
		JLabel lblKhiLngNc = new JLabel("Kh\u1ED1i l\u01B0\u1EE3ng n\u01B0\u1EDBc");
		lblKhiLngNc.setBounds(10, 203, 113, 14);
		contentPane.add(lblKhiLngNc);
		
		JLabel lblSNhnKhu = new JLabel("S\u1ED1 nh\u00E2n kh\u1EA9u");
		lblSNhnKhu.setBounds(298, 178, 80, 14);
		contentPane.add(lblSNhnKhu);
		
		JLabel lblTinNc = new JLabel("Ti\u1EC1n n\u01B0\u1EDBc");
		lblTinNc.setBounds(10, 228, 113, 14);
		contentPane.add(lblTinNc);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(10, 253, 113, 14);
		contentPane.add(lblKtQu);
		
		txtfHotenkhachhang = new JTextField();
		txtfHotenkhachhang.setBounds(133, 8, 155, 20);
		contentPane.add(txtfHotenkhachhang);
		txtfHotenkhachhang.setColumns(10);
		
		txtfKhoiluongnuoc = new JTextField();
		txtfKhoiluongnuoc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		txtfKhoiluongnuoc.setColumns(10);
		txtfKhoiluongnuoc.setBounds(133, 200, 155, 20);
		contentPane.add(txtfKhoiluongnuoc);
		
		txtfSodienthoai = new JTextField();
		txtfSodienthoai.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		txtfSodienthoai.setColumns(10);
		txtfSodienthoai.setBounds(133, 150, 155, 20);
		contentPane.add(txtfSodienthoai);
		
		txtfTiennuoc = new JTextField();
		txtfTiennuoc.setColumns(10);
		txtfTiennuoc.setBounds(133, 225, 155, 20);
		contentPane.add(txtfTiennuoc);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(130, 61, 285, 71);
		contentPane.add(panel);
		
		JRadioButton rbtNam = new JRadioButton("Nam");
		
		JRadioButton rbtNu = new JRadioButton("N\u1EEF");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(61)
					.addComponent(rbtNam)
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(rbtNu)
					.addGap(54))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rbtNu)
						.addComponent(rbtNam))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JTextPane txtpKetqua = new JTextPane();
		txtpKetqua.setBounds(133, 253, 282, 138);
		contentPane.add(txtpKetqua);
		
		spnSonhankhau = new JSpinner();
		spnSonhankhau.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		spnSonhankhau.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spnSonhankhau.setBounds(388, 175, 30, 20);
		contentPane.add(spnSonhankhau);
		
		JButton btnLuu = new JButton("L\u01B0u");
		btnLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//táº¡o Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ lÆ°u vÃ o file cáº§n lÆ°u dá»¯ liá»‡u
					FileOutputStream luulai1=new FileOutputStream("D:/luulai/hoa.txt");
					DataOutputStream luulai2=new DataOutputStream(luulai1);
					luulai2.writeChars(txtpKetqua.getText());

					luulai1.close();
					luulai2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnLuu.setBounds(10, 402, 89, 23);
		contentPane.add(btnLuu);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.setBounds(329, 402, 89, 23);
		contentPane.add(btnThoat);
		
		JButton btnTnh = new JButton("T\u00EDnh");
		
		btnTnh.setBounds(230, 402, 89, 23);
		contentPane.add(btnTnh);
		
		JDateChooser dtcNgaysinh = new JDateChooser();
		dtcNgaysinh.setBounds(133, 30, 155, 20);
		contentPane.add(dtcNgaysinh);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sinh ho\u1EA1t h\u1ED9 d\u00E2n c\u01B0", "S\u1EA3n xu\u1EA5t kinh doanh", "C\u01A1 quan h\u00E0nh ch\u00EDnh"}));
		comboBox.setBounds(133, 174, 155, 20);
		contentPane.add(comboBox);
		
		
		
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tiennuoc;
				int tienthue;
				int phibvmt;
				int tongtien;
				
				
				
				txtpKetqua.setText("ông: "+ txtfHotenkhachhang.getText() + 
						"\n -Ngay sinh: "+d.format(dtcNgaysinh.getDate())+
						"\n -Khối lượng nước "+txtfKhoiluongnuoc.getText()+
						"\n -Số nhân khẩu: "+spnSonhankhau.getValue());
				
			}
		});
	}
}
