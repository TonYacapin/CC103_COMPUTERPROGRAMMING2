import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Activity10_2 {

	private JFrame frmAgeCalculator;
	public static JTextField Day,Month,Year;
	public static JLabel Result;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity10_2 window = new Activity10_2();
					window.frmAgeCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Activity10_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgeCalculator = new JFrame();
		frmAgeCalculator.setTitle("Age Calculator");
		frmAgeCalculator.setBounds(100, 100, 450, 300);
		frmAgeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgeCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date of Birth:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(22, 24, 116, 14);
		frmAgeCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResult.setBounds(209, 26, 116, 14);
		frmAgeCalculator.getContentPane().add(lblResult);
		
		JLabel lblDate = new JLabel("Month");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDate.setBounds(22, 62, 116, 14);
		frmAgeCalculator.getContentPane().add(lblDate);
		
		JLabel lblNewLabel_2_1 = new JLabel("Day");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(22, 87, 116, 14);
		frmAgeCalculator.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Year");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(22, 111, 116, 14);
		frmAgeCalculator.getContentPane().add(lblNewLabel_2_2);
		
		Result = new JLabel("None");
		Result.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Result.setBounds(209, 63, 203, 14);
		frmAgeCalculator.getContentPane().add(Result);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				getResults();
			}
		});
		Calculate.setBounds(22, 145, 89, 23);
		frmAgeCalculator.getContentPane().add(Calculate);
		
		
		
		JButton Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				runClear();
			}
		});
		Reset.setBounds(22, 187, 89, 23);
		frmAgeCalculator.getContentPane().add(Reset);
		
		Day = new JTextField();
		Day.setBounds(84, 85, 86, 20);
		frmAgeCalculator.getContentPane().add(Day);
		Day.setColumns(10);
		
		Month = new JTextField();
		Month.setColumns(10);
		Month.setBounds(84, 60, 86, 20);
		frmAgeCalculator.getContentPane().add(Month);
		
		Year = new JTextField();
		Year.setColumns(10);
		Year.setBounds(84, 109, 86, 20);
		frmAgeCalculator.getContentPane().add(Year);
	}
	
	public static void getResults() {
		
		try {
		int Year2 = Integer.parseInt(Year.getText());
		int Month2 = Integer.parseInt(Month.getText());
		int Day2 = Integer.parseInt(Day.getText());
		
		LocalDate userDate =LocalDate.of(Year2, Month2, Day2);
		LocalDate dateToday =LocalDate.now();
		
		Period period = Period.between(userDate, dateToday);
		
		Result.setText(period.getYears()+" Years "+period.getMonths() +" Months "+ period.getDays()+" Days " );
		
	}
		
		catch(Exception e) {
			Result.setText("Please provide a valid date.");
			}
		}
		
		
	
	
	public static void runClear() {
		
	Year.setText("");
	Month.setText("");
	Day.setText("");
	Result.setText("None");
		
		
	}
	
}
