import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "asdfghjkl;@gmail.com";
	static final String FAKE_PASSWORD = "soupysoup";
	static JTextField text = new JTextField(20);
	static JButton button = new JButton();
	JButton button1 = new JButton();
	static String message = "Hello Friend, /n click here to earn free trip to Hawaii /n NOT SPAM AT ALL /n From /n Bob";
	static String subject = "NOT SPAM";
	static String recipient;
	public static void main(String[] args) {
		Spamalot spam = new Spamalot();
		spam.UI();
		spam.sendSpam(recipient, subject, message);
	}
	void UI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button.setText("BAD");
		button1.setText("GOOD");
		frame.setVisible(true);
		frame.setSize(500, 60);
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
	}
	private static boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
		Spamalot.sendSpam(recipient, subject, message);
		if (sendSpam(recipient, subject, message)) {
			text.setBackground(Color.green);
		}
		}
	}
}
