import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GetTheLatestTweet implements ActionListener {
	JButton button;
	JTextField text;
	JFrame frame;
	JPanel panel;
	public static void main(String[] args) {
		GetTheLatestTweet tweet = new GetTheLatestTweet();
		tweet.createUI();
	}
	void createUI() {
		button = new JButton();
		text = new JTextField(10);
		frame = new JFrame();
		panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 60));
		frame.setVisible(true);
		frame.setTitle("Twitter Reciever");
		button.setText("Search the Twitterverse");
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		button.addActionListener(this);
		frame.pack();
	}
	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			System.out.println("tweet tweet");
			String input = text.getText();
			System.out.println(getLatestTweet(input));
			}
		}
	}
