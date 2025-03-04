package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.schoolapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public LandingPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην Εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 687, 50);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(0, 0, 100, 50);
		header.add(govImage);
		
		JLabel lblAuthReq = new JLabel("Απαιτείται Ταυτοποίηση");
		lblAuthReq.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAuthReq.setBounds(50, 71, 221, 57);
		contentPane.add(lblAuthReq);
		
		JLabel lblConnReqPrompt = new JLabel("Για να προχωρήσετε πρέπει να συνδεθείτε");
		lblConnReqPrompt.setBounds(50, 139, 344, 50);
		contentPane.add(lblConnReqPrompt);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getLoginPage().setVisible(true);
			}
		});
		btnConnect.setEnabled(false);
		btnConnect.setForeground(Color.WHITE);
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnConnect.setBounds(50, 333, 144, 57);
		contentPane.add(btnConnect);
				
		JCheckBox privacyCheckBox = new JCheckBox("Δηλώνω ότι αποδέχομαι τη");
		privacyCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btnConnect.setEnabled(true);
				} else {
					btnConnect.setEnabled(false);
				}
			}
		});
		privacyCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		privacyCheckBox.setBounds(50, 234, 169, 23);
		contentPane.add(privacyCheckBox);
		
		JLabel lblPrivacy = new JLabel("Δήλωση Ιδιωτικότητας");
		lblPrivacy.setForeground(new Color(0, 52, 117));
		lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrivacy.setBounds(225, 234, 169, 23);
		contentPane.add(lblPrivacy);
		
		
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 405, 687, 51);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(new Color(0, 52, 117));
		lblManual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblManual.setBounds(92, 18, 101, 14);
		footer.add(lblManual);
		
		JLabel lblFAQ = new JLabel("Συχνές Ερωτήσεις");
		lblFAQ.setForeground(new Color(0, 52, 117));
		lblFAQ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFAQ.setBounds(285, 19, 101, 15);
		footer.add(lblFAQ);
		
		JLabel lblSupport = new JLabel("Υποστήριξη Πολιτών");
		lblSupport.setForeground(new Color(0, 52, 117));
		lblSupport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSupport.setBounds(478, 18, 115, 14);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 255));
		separator.setBounds(0, 2, 746, 1);
		footer.add(separator);
	}
}
