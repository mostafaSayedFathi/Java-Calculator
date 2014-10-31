import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;


public class CalculatorGUI {

	private JFrame frmCalculator;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//object of class calculator
	Calculator calc = new Calculator();
	
	private void initialize() {
	    
		
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 292, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtResult.setBackground(Color.WHITE);
		txtResult.setEditable(false);
		txtResult.setBounds(10, 11, 268, 29);
		frmCalculator.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "7");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(10, 90, 48, 35);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "4");
			}
		});
		button.setForeground(Color.BLUE);
		button.setBounds(10, 132, 48, 35);
		frmCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "1");
			}
		});
		button_1.setForeground(Color.BLUE);
		button_1.setBounds(10, 174, 48, 35);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "0");
			}
		});
		button_2.setForeground(Color.BLUE);
		button_2.setBounds(10, 216, 48, 35);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "5");
			}
		});
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "8");
			}
		});
		button_3.setForeground(Color.BLUE);
		button_3.setBounds(64, 90, 48, 35);
		frmCalculator.getContentPane().add(button_3);
		button_4.setForeground(Color.BLUE);
		button_4.setBounds(64, 132, 48, 35);
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "2");
			}
		});
		button_5.setForeground(Color.BLUE);
		button_5.setBounds(64, 174, 48, 35);
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("+/-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.plusMinus(txtResult.getText());
				txtResult.setText(calc.getTotal());
			}
		});
		button_6.setForeground(Color.BLUE);
		button_6.setBounds(64, 216, 48, 35);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "9");
			}
		});
		button_7.setForeground(Color.BLUE);
		button_7.setBounds(118, 90, 48, 35);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "6");
			}
		});
		button_8.setForeground(Color.BLUE);
		button_8.setBounds(118, 132, 48, 35);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(txtResult.getText() + "3");
			}
		});
		button_9.setForeground(Color.BLUE);
		button_9.setBounds(118, 174, 48, 35);
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.decimalPoint(".");
				txtResult.setText(txtResult.getText() + calc.getDecimalPoint());
			}
		});
		button_10.setForeground(Color.BLUE);
		button_10.setBounds(118, 216, 48, 35);
		frmCalculator.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.startFirst(txtResult.getText());
				calc.divide();
				txtResult.setText("");
				calc.resetDecimalPoint();
			}
		});
		button_11.setForeground(Color.RED);
		button_11.setBounds(172, 90, 48, 35);
		frmCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.startFirst(txtResult.getText());
				calc.multiply();
				txtResult.setText("");
				calc.resetDecimalPoint();
			}
		});
		button_12.setForeground(Color.RED);
		button_12.setBounds(172, 132, 48, 35);
		frmCalculator.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.startFirst(txtResult.getText());
				calc.subtract();
				txtResult.setText("");
				calc.resetDecimalPoint();
			}
		});
		button_13.setForeground(Color.RED);
		button_13.setBounds(172, 174, 48, 35);
		frmCalculator.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.startFirst(txtResult.getText());
				calc.add();
				txtResult.setText("");
				calc.resetDecimalPoint();
			}
		});
		button_14.setForeground(Color.RED);
		button_14.setBounds(172, 216, 48, 35);
		frmCalculator.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.checkEqual(txtResult.getText());
				txtResult.setText(calc.getTotal());
				calc.reset();
			}
		});
		button_15.setForeground(Color.RED);
		button_15.setBounds(230, 216, 48, 35);
		frmCalculator.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText("");
				calc.reset();
			}
		});
		btnC.setForeground(Color.RED);
		btnC.setBounds(196, 51, 82, 35);
		frmCalculator.getContentPane().add(btnC);
	}
}
