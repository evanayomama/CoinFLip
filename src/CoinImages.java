import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CoinImages {
	void headsImage() {
		Jlabel headsLabel;
		
		ImageIcon corviImage = new ImageIcon("corviknightCoin.png");
		ImageIcon crokImage = new ImageIcon("crocorokCoin.png");
		ImageIcon dialgaImage = new ImageIcon("DialgaCoin.png");
		ImageIcon lycanImage = new ImageIcon("LycanrocCoin.png");
		ImageIcon quaxlyImage = new ImageIcon("QuaxlyCoin.png");
		ImageIcon turchImage = new ImageIcon("turchimpipCoin.png");
		
		ImageIcon headsImage = new ImageIcon();
		Random random = new Random();
		int x = random.nextInt(6);
		if(x==0) {
			headsImage = ImageIcon("corviknightCoin.png");
		} else if(x ==1) {
			headsImage = ImageIcon("crocorokCoin.png");
		} else if(x==2) {
			headsImage = ImageIcon("DialgaCoin.png");
		} else if(x==3) {
			headsImage = ImageIcon("LycanrocCoin.png");
		} else if(x==4) {
			headsImage = ImageIcon("QuaxlyCoin.png");
		} else {
			headsImage = ImageIcon("turchimpipCoin.png");
		}
	}

	private ImageIcon ImageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private Jlabel JLabel(ImageIcon corviImage) {
		// TODO Auto-generated method stub
		return null;
	}
}
