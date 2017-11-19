import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		Random random = new Random();
		WhackAMole m = new WhackAMole();
		int rr = random.nextInt(24);
		m.drawButtons(rr);
	}
	static JButton button;
	void drawButtons(int r) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		for (int i = 0; i < 24; i++) {
			button = new JButton();
			if (i == r) {
				button.setText("mole!");
				button.addActionListener(this);
			}
			panel.add(button);
		}
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.add(panel);
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}catch (Exception e) {
			e.printStackTrace();
			}
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
