import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Activity10_1 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static JTextField textFieldDuration;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	static JRadioButton Sbtn;
	static JRadioButton Rbtn;
	static JRadioButton KBbtn;
	static JRadioButton Bbtn;
	static JRadioButton Mbtn;
	static JRadioButton Hbtn;
	static JLabel cbValue;
	static JLabel hriValue;
	
	public static int Duration, Before, After;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity10_1 window = new Activity10_1();
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
	public Activity10_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 392, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose an Activity:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 11, 157, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Sbtn = new JRadioButton("Swimming");
		Sbtn.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(Sbtn);
		Sbtn.setBounds(57, 45, 109, 23);
		frame.getContentPane().add(Sbtn);
		
		Rbtn = new JRadioButton("Running");
		Rbtn.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(Rbtn);
		Rbtn.setBounds(57, 73, 109, 23);
		frame.getContentPane().add(Rbtn);
		
		KBbtn = new JRadioButton("Kick Boxing");
		KBbtn.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(KBbtn);
		KBbtn.setBounds(188, 45, 109, 23);
		frame.getContentPane().add(KBbtn);
		
		Bbtn = new JRadioButton("Biking");
		Bbtn.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(Bbtn);
		Bbtn.setBounds(188, 73, 109, 23);
		frame.getContentPane().add(Bbtn);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDuration.setBounds(32, 116, 62, 14);
		frame.getContentPane().add(lblDuration);
		
		JLabel lblHeart = new JLabel("Heart Rate:");
		lblHeart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHeart.setBounds(32, 141, 109, 14);
		frame.getContentPane().add(lblHeart);
		
		JLabel lblBefore = new JLabel("Before");
		lblBefore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBefore.setBounds(45, 166, 49, 14);
		frame.getContentPane().add(lblBefore);
		
		JLabel lblAfter = new JLabel("After");
		lblAfter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAfter.setBounds(57, 191, 37, 14);
		frame.getContentPane().add(lblAfter);
		
		JLabel lblBps = new JLabel("bps");
		lblBps.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBps.setBounds(178, 166, 49, 14);
		frame.getContentPane().add(lblBps);
		
		JLabel lblBps_1 = new JLabel("bps");
		lblBps_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBps_1.setBounds(178, 191, 49, 14);
		frame.getContentPane().add(lblBps_1);
		
		Mbtn = new JRadioButton("Minutes");
		Mbtn.setBackground(Color.LIGHT_GRAY);
		buttonGroup_1.add(Mbtn);
		Mbtn.setBounds(178, 114, 83, 23);
		frame.getContentPane().add(Mbtn);
		
		Hbtn = new JRadioButton("Hour");
		Hbtn.setBackground(Color.LIGHT_GRAY);
		buttonGroup_1.add(Hbtn);
		Hbtn.setBounds(263, 114, 83, 23);
		frame.getContentPane().add(Hbtn);
		
		textFieldDuration = new JTextField();
		textFieldDuration.setBounds(104, 115, 62, 20);
		frame.getContentPane().add(textFieldDuration);
		textFieldDuration.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 166, 62, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 190, 62, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblHeart_1 = new JLabel("Heart Rate:");
		lblHeart_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHeart_1.setBounds(32, 216, 109, 14);
		frame.getContentPane().add(lblHeart_1);
		
		JLabel lblCaloriesBurnt = new JLabel("Calories Burnt:");
		lblCaloriesBurnt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCaloriesBurnt.setBounds(57, 258, 109, 14);
		frame.getContentPane().add(lblCaloriesBurnt);
		
		JLabel lblHeartRate = new JLabel("Heart Rate Increase (bps)");
		lblHeartRate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHeartRate.setBounds(57, 289, 132, 14);
		frame.getContentPane().add(lblHeartRate);
		
		cbValue = new JLabel("0");
		cbValue.setForeground(Color.RED);
		cbValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbValue.setBounds(201, 256, 109, 14);
		frame.getContentPane().add(cbValue);
		
		hriValue = new JLabel("0");
		hriValue.setForeground(Color.RED);
		hriValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hriValue.setBounds(201, 287, 109, 14);
		frame.getContentPane().add(hriValue);
		
		btnNewButton = new JButton("Run");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				getValues();
				
			}
		});
		btnNewButton.setBounds(258, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		list.setBounds(32, 36, 320, 77);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		list_1.setBounds(32, 243, 320, 77);
		frame.getContentPane().add(list_1);
		
	}

	
public static void getValues() {
		
	Duration = Integer.parseInt(textFieldDuration.getText());
	Before = Integer.parseInt(textField_1.getText());
	After = Integer.parseInt(textField_2.getText());

	int cBurnt = 0, hri = 0;

	if (Sbtn.isSelected()) {
	  if (Mbtn.isSelected()) {
	    cBurnt = Duration * 4;

	    hri = (int)(.2 * (cBurnt));
	    hri = After + hri + hri;

	  }

	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");
	  if (Hbtn.isSelected()) {

	    cBurnt = 4 * (Duration * 60);

	    hri = (int)(.2 * (cBurnt));
	    hri = After + hri + hri;
	  }
	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");
	} else if (Rbtn.isSelected()) {
	  if (Mbtn.isSelected()) {
	    cBurnt = Duration * 5;

	    hri = (int)(.3 * (cBurnt));
	    hri = After + hri + hri;
	  }

	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");
	  if (Hbtn.isSelected()) {

	    cBurnt = 5 * (Duration * 60);

	    hri = (int)(.3 * (cBurnt));
	    hri = After + hri + hri;
	  }
	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");

	} else if (KBbtn.isSelected()) {
	  if (Mbtn.isSelected()) {
	    cBurnt = Duration * 3;

	    hri = (int)(.5 * (cBurnt));
	    hri = After + hri + hri;
	  }

	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");
	  if (Hbtn.isSelected()) {

	    cBurnt = 3 * (Duration * 60);

	    hri = (int)(.5 * (cBurnt));
	    hri = After + hri + hri;
	  }
	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");

	} else if (Bbtn.isSelected()) {
	  if (Mbtn.isSelected()) {
	    cBurnt = Duration * 5;

	    hri = (int)(.6 * (cBurnt));
	    hri = After + hri + hri;
	  }

	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");
	  if (Hbtn.isSelected()) {

	    cBurnt = 5 * (Duration * 60);

	    hri = (int)(.6 * (cBurnt));
	    hri = After + hri + hri;
	  }
	  cbValue.setText(cBurnt + " Calories");
	  hriValue.setText(hri + "");

	}
		
}
}
