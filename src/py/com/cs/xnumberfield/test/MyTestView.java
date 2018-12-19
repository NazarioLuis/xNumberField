package py.com.cs.xnumberfield.test;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import py.com.cs.xnumberfield.component.NumberTextField;

public class MyTestView extends JFrame {

	private static final long serialVersionUID = -6490265128403841601L;
	private JPanel contentPane;
	private JTextField textField;
	private NumberTextField numberTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyTestView frame = new MyTestView();
					frame.setDefaultValues();
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
	public MyTestView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numberTextField = new NumberTextField();
		numberTextField.setFont(new Font("Dialog", Font.PLAIN, 14));
		numberTextField.setBounds(90, 148, 263, 25);
		contentPane.add(numberTextField);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(90, 121, 70, 15);
		contentPane.add(lblNumber);
		
		JLabel lblText = new JLabel("Text");
		lblText.setBounds(90, 37, 70, 15);
		contentPane.add(lblText);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setBounds(90, 57, 263, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnShowValues = new JButton("Show values");
		btnShowValues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showValues();
			}
		});
		btnShowValues.setBounds(143, 209, 158, 25);
		contentPane.add(btnShowValues);
	}
	
	public void setDefaultValues(){
		textField.setText("1000000");
		
		//numberTextField.setText("1000000") This way also works
		numberTextField.setValue(1000000d);		
	}
	
	private void showValues() {
		String text = textField.getText();
		Double number = numberTextField.getValue();
		
		System.out.println("Text: "+text);
		System.out.println("Number: "+number);
	}
}
