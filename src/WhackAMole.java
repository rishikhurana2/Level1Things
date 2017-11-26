import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static Date startTime;
	int wack = 0;
	int empty = 0;
	public static void main(String[] args) {
		startTime = new Date();
		Random random = new Random();
		WhackAMole m = new WhackAMole();
		int rr = random.nextInt(24);
		m.drawButtons(rr);
	}
	JButton button;
	JButton mole;
	JPanel panel;
	JFrame frame; 
	void drawButtons(int r) {
		frame = new JFrame();
		panel = new JPanel();
		mole = new JButton("mole!");
		for (int i = 0; i < 24; i++) {
			button = new JButton();
			if (i == r) {
				panel.add(mole);
				mole.addActionListener(this);
			}
			else {
				panel.add(button);	
				button.addActionListener(this);
			}
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
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int r = rand.nextInt(24);
		if (e.getSource() == mole) {
			//playSound();
			frame.dispose();
			drawButtons(r);
			wack = wack + 1;
			if (wack == 10) {
				endGame(startTime, 10);
			}
		}
		
		else if (e.getSource() != mole) {
			empty = empty + 1;
			if (empty < 2) {
				speak("dork");
			}
			else if (empty ==  2) {
				speak("idiot");
			}
			else if (empty ==  3) {
				speak("moron");
			}
			else if (empty == 4) {
				speak("Your a waste of atoms");
			}
			else {
				speak("dork");
			}
		}
	}

}
