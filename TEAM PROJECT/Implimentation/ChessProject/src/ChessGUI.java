import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

// TODO: Auto-generated Javadoc
/**
 * The Class ChessGUI.
 */
public class ChessGUI {

	/** The frame. */
	private JFrame frame;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChessGUI window = new ChessGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChessGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(70, 130, 180));
		frame.setOpacity(0.5f);
		frame.setBounds(100, 100, 1131, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Load");
		btnNewButton.setBounds(74, 0, 70, 35);
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(0, 0, 75, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Resign");
		btnNewButton_2.setBounds(1029, 0, 86, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(64, 46, 997, 654);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(8, 8, 0, 0));
		
		JButton btnBp = new JButton("");
		btnBp.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackRook.gif"));
		btnBp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnBp);
		
		JButton btnBn = new JButton("");
		btnBn.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackKnight.gif"));
		btnBn.setContentAreaFilled(false);
		btnBn.setForeground(new Color(240, 255, 255));
		btnBn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnBn);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackBishop.gif"));
		panel.add(btnNewButton_3);
		
		JButton btnBq = new JButton("");
		btnBq.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackQueen.gif"));
		btnBq.setContentAreaFilled(false);
		btnBq.setForeground(new Color(240, 255, 255));
		panel.add(btnBq);
		
		JButton btnBk = new JButton("");
		btnBk.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackKing.gif"));
		panel.add(btnBk);
		
		JButton btnBb = new JButton("");
		btnBb.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackBishop.gif"));
		btnBb.setContentAreaFilled(false);
		btnBb.setForeground(new Color(240, 255, 255));
		panel.add(btnBb);
		
		JButton btnBn_1 = new JButton("");
		btnBn_1.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackKnight.gif"));
		panel.add(btnBn_1);
		
		JButton btnBr = new JButton("");
		btnBr.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackRook.gif"));
		btnBr.setForeground(new Color(240, 255, 255));
		btnBr.setContentAreaFilled(false);
		btnBr.setBackground(Color.BLACK);
		panel.add(btnBr);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		button_6.setContentAreaFilled(false);
		button_6.setForeground(new Color(240, 255, 255));
		panel.add(button_6);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		panel.add(button_1);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		button_3.setContentAreaFilled(false);
		button_3.setForeground(new Color(240, 255, 255));
		panel.add(button_3);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		panel.add(button);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		button_5.setContentAreaFilled(false);
		button_5.setForeground(new Color(240, 255, 255));
		panel.add(button_5);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		panel.add(button_4);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		button_2.setContentAreaFilled(false);
		button_2.setForeground(new Color(240, 255, 255));
		panel.add(button_2);
		
		JButton button_8 = new JButton("");
		button_8.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\BlackPawn.gif"));
		panel.add(button_8);
		
		JButton button_7 = new JButton("");
		panel.add(button_7);
		
		JButton button_9 = new JButton("");
		button_9.setContentAreaFilled(false);
		button_9.setBackground(new Color(0, 0, 0));
		panel.add(button_9);
		
		JButton button_10 = new JButton("");
		panel.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setContentAreaFilled(false);
		button_11.setForeground(new Color(240, 255, 255));
		panel.add(button_11);
		
		JButton button_12 = new JButton("");
		panel.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setContentAreaFilled(false);
		button_13.setForeground(new Color(240, 255, 255));
		panel.add(button_13);
		
		JButton button_14 = new JButton("");
		panel.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setContentAreaFilled(false);
		button_15.setForeground(new Color(240, 255, 255));
		panel.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setContentAreaFilled(false);
		button_16.setForeground(new Color(240, 255, 255));
		panel.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBackground(new Color(0, 0, 0));
		panel.add(button_16);
		
		JButton button_18 = new JButton("");
		button_18.setContentAreaFilled(false);
		button_18.setForeground(new Color(240, 255, 255));
		panel.add(button_17);
		
		JButton button_19 = new JButton("");
		panel.add(button_18);
		
		JButton button_20 = new JButton("");
		panel.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setContentAreaFilled(false);
		button_21.setForeground(new Color(240, 255, 255));
		panel.add(button_21);
		
		JButton button_22 = new JButton("");
		panel.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setContentAreaFilled(false);
		button_23.setForeground(new Color(240, 255, 255));
		panel.add(button_23);
		
		JButton button_24 = new JButton("");
		panel.add(button_24);
		
		JButton button_25 = new JButton("");
		panel.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setContentAreaFilled(false);
		button_26.setForeground(new Color(240, 255, 255));
		button_26.setOpaque(false);
		panel.add(button_26);
		
		JButton button_27 = new JButton("");
		panel.add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setContentAreaFilled(false);
		button_28.setForeground(new Color(240, 255, 255));
		panel.add(button_28);
		
		JButton button_29 = new JButton("");
		panel.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setContentAreaFilled(false);
		button_30.setForeground(new Color(240, 255, 255));
		panel.add(button_30);
		
		JButton button_31 = new JButton("");
		panel.add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setContentAreaFilled(false);
		button_32.setForeground(new Color(240, 255, 255));
		panel.add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setContentAreaFilled(false);
		button_33.setForeground(new Color(240, 255, 255));
		panel.add(button_33);
		
		JButton button_34 = new JButton("");
		panel.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setContentAreaFilled(false);
		button_35.setForeground(new Color(240, 255, 255));
		panel.add(button_35);
		
		JButton button_36 = new JButton("");
		panel.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setContentAreaFilled(false);
		button_37.setForeground(new Color(240, 255, 255));
		panel.add(button_37);
		
		JButton button_38 = new JButton("");
		panel.add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setContentAreaFilled(false);
		button_39.setForeground(new Color(240, 255, 255));
		panel.add(button_39);
		
		JButton button_40 = new JButton("");
		panel.add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		panel.add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		button_42.setContentAreaFilled(false);
		button_42.setForeground(new Color(240, 255, 255));
		button_42.setBackground(Color.LIGHT_GRAY);
		panel.add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		panel.add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		button_44.setContentAreaFilled(false);
		button_44.setForeground(new Color(240, 255, 255));
		panel.add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		panel.add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		button_46.setContentAreaFilled(false);
		button_46.setForeground(new Color(240, 255, 255));
		panel.add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		panel.add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhitePawn.gif"));
		button_48.setContentAreaFilled(false);
		button_48.setForeground(new Color(240, 255, 255));
		panel.add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteRook.gif"));
		button_49.setContentAreaFilled(false);
		button_49.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_49.setForeground(new Color(248, 248, 255));
		button_49.setBackground(Color.BLACK);
		panel.add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteKnight.gif"));
		panel.add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteBishop.gif"));
		button_51.setContentAreaFilled(false);
		button_51.setForeground(new Color(240, 255, 255));
		panel.add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteQueen.gif"));
		button_52.setBackground(Color.WHITE);
		panel.add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteKing.gif"));
		button_53.setContentAreaFilled(false);
		button_53.setForeground(new Color(240, 255, 255));
		panel.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteBishop.gif"));
		panel.add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteKnight.gif"));
		button_55.setContentAreaFilled(false);
		button_55.setForeground(new Color(240, 255, 255));
		panel.add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setIcon(new ImageIcon("C:\\Users\\patel\\Desktop\\FALL17\\SE\\Chess\\WhiteRook.gif"));
		panel.add(button_56);
		button_56.setBackground(Color.WHITE);
		
		JLabel lblLetsPlayChess = new JLabel("Lets play Chess!");
		lblLetsPlayChess.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		lblLetsPlayChess.setForeground(new Color(255, 245, 238));
		lblLetsPlayChess.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLetsPlayChess.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetsPlayChess.setBounds(350, 10, 396, 25);
		frame.getContentPane().add(lblLetsPlayChess);
		
	}
}
