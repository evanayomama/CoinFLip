import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HeadsLabel {
	void HeadsFrame() {
	JFrame frame = new JFrame();
	frame.setTitle("Coin Flip"); // sets title of this
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hitting the x closes the app. without this it still runs in the background
	frame.setResizable(false); //prevents this from being resized		this.setIconImage(image);i
	frame.setSize(300,300); // sets the x-dimension and y dimension
	frame.setVisible(true); //make this visible

	ImageIcon image = new ImageIcon("Evana.png");
	frame.setIconImage(image.getImage()); //change icon of this
	frame.getContentPane().setBackground(new Color(0,0,0)); //change color of background
	
//	Jlabel headsLabel = new Jlabel();
//	headsLabel.setText("Heads!");
//	headsLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
}
