import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BinaryConverter implements ActionListener {
	JTextArea text = new JTextArea(0, 20);
	JTextArea text2 = new JTextArea(0,20);
	public static void main(String[] args) {
		BinaryConverter c = new BinaryConverter();
		c.UI();
	}
	void UI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.setText("Click here to convert");
		frame.setVisible(true);
		frame.setSize(700, 60);
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(text2);
		button.addActionListener(this);
	}
int convert(String binary) {
	if(binary.length() != 8){
		JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		return 0;
	}
	for (int i = 0; i < binary.length(); i++) {
		if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
			JOptionPane.showMessageDialog(null, "Binary!!");
			return 0;
		}
	}
	try {
		int asciiValue = Integer.parseInt(binary, 2);
		return asciiValue;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		//question.setText("");
		return 0;
		}
	
	}
String convert2(String binary) {
  	 int asciiValue = Integer.parseInt(binary, 2);
  	 char theLetter = (char) asciiValue;
  	 return "" + theLetter;
   }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		String input;
		input = text.getText();
		text2.setText("" + convert2(input));
	}
}
