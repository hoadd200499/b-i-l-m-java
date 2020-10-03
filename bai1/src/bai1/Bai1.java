package bai1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.border.TitledBorder;

//import com.sun.java_cup.internal.runtime.Scanner;

import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Bai1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1 frame = new Bai1();
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
	public Bai1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD v\u00E0 T\u00EAn");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 17, 56, 14);
		contentPane.add(lblNewLabel);
		
		JTextPane txt_HoTen = new JTextPane();
		txt_HoTen.setBounds(76, 11, 230, 20);
		contentPane.add(txt_HoTen);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(55, 100, 29, -17);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nh\u1EADp trung b\u00ECnh m\u00F4n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 42, 181, 176);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("L\u1EADp tr\u00ECnh Windows");
		lblNewLabel_1.setBounds(10, 42, 116, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("L\u1EADp tr\u00ECnh Java");
		lblNewLabel_2.setBounds(10, 79, 105, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qu\u1EA3n tr\u1ECB SQL Server");
		lblNewLabel_3.setBounds(10, 115, 116, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("C\u1EA5u tr\u00FAc d\u1EEF li\u1EC7u");
		lblNewLabel_4.setBounds(10, 151, 105, 14);
		panel.add(lblNewLabel_4);
		
		JTextPane txt_D_Window = new JTextPane();
		txt_D_Window.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		txt_D_Window.setBounds(125, 36, 39, 20);
		panel.add(txt_D_Window);
		
		JTextPane txt_D_Java = new JTextPane();
		txt_D_Java.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		txt_D_Java.setBounds(125, 73, 39, 20);
		panel.add(txt_D_Java);
		
		JTextPane txt_D_Sql = new JTextPane();
		txt_D_Sql.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		txt_D_Sql.setBounds(125, 109, 39, 20);
		panel.add(txt_D_Sql);
		
		JTextPane txt_D_Ctdl = new JTextPane();
		txt_D_Ctdl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) 
                {
                    e.consume();
                }
			}
		});
		txt_D_Ctdl.setBounds(125, 145, 39, 20);
		panel.add(txt_D_Ctdl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(201, 42, 93, 176);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton bt_Tinhtb = new JButton("T\u00EDnh TB");
		bt_Tinhtb.setBounds(10, 31, 77, 23);
		panel_1.add(bt_Tinhtb);
		
		JButton bt_Xeploai = new JButton("X\u1EBFp lo\u1EA1i");
		bt_Xeploai.setBounds(10, 65, 77, 23);
		panel_1.add(bt_Xeploai);
		
		JButton bt_Tieptheo = new JButton("Ti\u1EBFp theo");
		bt_Tieptheo.setBounds(10, 99, 77, 23);
		panel_1.add(bt_Tieptheo);
		
		JButton bt_Thoat = new JButton("Tho\u00E1t");
		bt_Thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		bt_Thoat.setBounds(10, 133, 77, 23);
		panel_1.add(bt_Thoat);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "X\u1EBFp lo\u1EA1i h\u1ECDc l\u1EF1c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 229, 181, 74);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane txt_Kq_Xeploai = new JTextPane();
		txt_Kq_Xeploai.setEnabled(false);
		txt_Kq_Xeploai.setBounds(10, 22, 161, 44);
		panel_2.add(txt_Kq_Xeploai);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0110i\u1EC3m trung b\u00ECnh", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(201, 229, 93, 74);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextPane txt_Kq_Diemtb = new JTextPane();
		txt_Kq_Diemtb.setEnabled(false);
		txt_Kq_Diemtb.setBounds(10, 23, 73, 28);
		panel_3.add(txt_Kq_Diemtb);
		
		bt_Tinhtb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float diemtb;
				float dWindows;
				float dJava;
				float dSql;
				float dCtdl;
				dWindows=Float.parseFloat(txt_D_Window.getText());
				dJava=Float.parseFloat(txt_D_Java.getText());
				dSql=Float.parseFloat(txt_D_Sql.getText());
				dCtdl=Float.parseFloat(txt_D_Ctdl.getText());
				diemtb=(dWindows+dJava+dSql+dCtdl)/4;
				txt_Kq_Diemtb.setText(String.valueOf(diemtb));
			}
		});
		bt_Xeploai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float diemtb;
				float dWindows;
				float dJava;
				float dSql;
				float dCtdl;
				dWindows=Float.parseFloat(txt_D_Window.getText());
				dJava=Float.parseFloat(txt_D_Java.getText());
				dSql=Float.parseFloat(txt_D_Sql.getText());
				dCtdl=Float.parseFloat(txt_D_Ctdl.getText());
				diemtb=(dWindows+dJava+dSql+dCtdl)/4;
				String xeploai;
				if(diemtb>=9)
				{
					xeploai="xuất sắc";
				}else if(diemtb<9 && diemtb>=8)
				{
					xeploai="Giỏi";
				}else if(diemtb<8 && diemtb>=6.5)
				{
					xeploai="Khá";
				}else if(diemtb<6.5 && diemtb>=5)
				{
					xeploai="Trung bình";
				}else
				{
					xeploai="Yếu";
				}
				txt_Kq_Xeploai.setText(txt_HoTen.getText()+"\nXếp loại: "+ xeploai);
			}
		});
	}
}
//còn thiếu cái buttun tiếp theo
