package kilometerconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KilometerConverter extends JFrame {

	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton, calcButton1;
	private JPanel panel;
	private final int WINDOW_WIDTH = 900;
	private final int WINDOW_HEIGHT = 300;

	public KilometerConverter() {

		setTitle("Kilometer Converter");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 7));

		buildPanel();
		add(panel);

		setVisible(true);
	}

	private void buildPanel() {
		messageLabel = new JLabel("Enter a distance in kilometers");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new calcActionListener());
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
	}

	private class calcActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input;
			double miles;
			input = kiloTextField.getText();
			miles = Double.parseDouble(input) * 1.25631;

			if (e.getSource() == calcButton) {
				JOptionPane.showMessageDialog(null, input + " kilometers equals " + miles + " miles.");
			}

		}
	}
}
