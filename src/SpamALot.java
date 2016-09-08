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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamALot implements ActionListener {

	JFrame f = new JFrame();	
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JTextField tf = new JTextField();
	
	
	static final String FAKE_USERNAME = "Not.A.Hacker.Today";
	static final String FAKE_PASSWORD = "firebreathingrubberduck";
	
 public static void main(String[] args) {
	
	 SpamALot SAL = new SpamALot();
	 SAL.Phone();

}



void Phone(){
f.add(p);
p.add(tf);
p.add(b1);
p.add(b2);
tf.setText("Phone number");
b1.setText("BAD");
b2.setText("GOOD");
f.setVisible(true);
f.setSize(500, 200);
tf.setSize(150, 10);
b1.setSize(50,10);
b2.setSize(50,10);
b1.addActionListener(this);
b2.addActionListener(this);

}


private boolean sendSpam(String recipient, String subject, String content) {

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
	
	if(e.getSource() == b2){
		JOptionPane.showMessageDialog(null, "Hi, how are you?");
		sendSpam("leagueofamazing@gmail.com", "Hello", "Hi, how are you? Have a nice day.");
		tf.setBackground(Color.green);


	}

if(e.getSource() == b1){
	JOptionPane.showMessageDialog(null, "I see you.");
	sendSpam("leagueofamazing@gmail.com", "This is not A SPAM!!!", 
			"Hi, this is a spam. Please do not have a nice day.");
	tf.setBackground(Color.RED);

}


}

}