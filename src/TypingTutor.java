import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor	tt = new TypingTutor();
		tt.GUI();
	}
	char currentLetter = generateRandomLetter();
	String char2 = Character.toString(currentLetter);
	JLabel label;
	JPanel panel;
	JFrame frame;
	public void GUI() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.add(panel);
		label.setText(char2);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);
		panel.add(label);
		frame.addKeyListener(this);
	}
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar() + " which is");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		String mmm = "";
		char n = e.getKeyChar();
		mmm += n;
//		System.out.println(mmm + "Typed Character");
		if (mmm.equals(char2)) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
		}
		else {
			System.out.println("Incorrect");
			panel.setBackground(Color.RED);
		}
		currentLetter = generateRandomLetter();
		char2 = Character.toString(currentLetter);
		label.setText(char2);
	}
}
