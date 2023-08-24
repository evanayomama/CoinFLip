import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Coin{
	Random random;
	String heads = "heads";
	String tails = "tails";
	int number;

	void flip() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
		//CoinFrame coinFrame = new CoinFrame();
		//coinFrame.coinFrame();

		//play sound
		//playSound("coin-flip.wav");
		//display coin flip
		//displayImage("CoinFlipASCI.txt");
		//get heads or tails, side of coin equals 1 or 0
		//remove coinflipasci
		//int coinSide = flipCoin();
		//display coin side in frame. Can use displayImage based on value from flipCoin
		//displayCoin(coinSide,CoinHeads.txt,CoinTails.txt);


		//take all heads images and randomize.
		JPanel flipPanel = createCoinFlipPanel();

		String[] images = new String[] {"corviknightCoin.png","crocorokCoin.png","DialgaCoin.png","LycanrocCoin.png","QuaxlyCoin.png","turchimpipCoin.png"};

		int index = (int) (Math.random() * (images.length -1));
		JLabel headsLabel = new JLabel(new ImageIcon(images[index]));
		System.out.println(index);

		JPanel headsPanel = new JPanel();
		headsPanel.add(headsLabel);

		ImageIcon tailsImage = new ImageIcon("PokemonTails.png");
		JLabel tailsLabel = new JLabel(tailsImage);
		JPanel tailsPanel = new JPanel();
		tailsPanel.add(tailsLabel);


		JFrame frame = new JFrame();
		frame.setTitle("Coin Flip"); // sets title of this
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //hitting the x closes the app. without this it still runs in the background
		frame.setResizable(false); //prevents this from being resized		this.setIconImage(image);i
		frame.setSize(600,600); // sets the x-dimension and y dimension


		ImageIcon image = new ImageIcon("Evana.png");
		frame.setIconImage(image.getImage()); //change icon of this
		frame.getContentPane().setBackground(new Color(0,0,0)); //change color of background
		frame.add(flipPanel);
		frame.pack();

		frame.setVisible(true); //make this visible

		File audioFile = new File("coin-flip-88793.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();




		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.remove(flipPanel);
		frame.revalidate();
		frame.repaint();
		Random random2 = new Random();
		number = random2.nextInt(2);
		if(number == 1) {
			frame.add(headsPanel);
			frame.pack();
			System.out.println("Heads!");

			clip.close();
		} else {
			frame.add(tailsPanel);
			frame.pack();
			System.out.println("Tails!");
			clip.close();
		}
		clip.close();
	}

	private JPanel createCoinFlipPanel() {
		ImageIcon flipImage = new ImageIcon("coinflip.jpg");
		JLabel flipLabel = new JLabel(flipImage);
		JPanel flipPanel = new JPanel();
		flipPanel.add(flipLabel);
		return flipPanel;
	}

}
