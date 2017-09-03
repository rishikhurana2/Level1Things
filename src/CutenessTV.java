import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		JFrame tv = new JFrame();
		JPanel panel = new JPanel();
		JButton tvButtons1 = new JButton();
		JButton tvButtons2 = new JButton();
		JButton tvButtons3 = new JButton();
		tv.setVisible(true);
		tv.setSize(300, 100);
		tv.add(panel);
		tvButtons1.setText("Ducks?");
		tvButtons2.setText("Frogs?");
		tvButtons3.setText("Fluffy Unicorns?");
		tvButtons1.addActionListener(new CutenessTV());
		panel.add(tvButtons1);
		panel.add(tvButtons2);
		panel.add(tvButtons3);
	}
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}
	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?/v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		showDucks();
	}

}
