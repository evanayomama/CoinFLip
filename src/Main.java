import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, NullPointerException {
		// TODO Auto-generated method stub
		Coin coin = new Coin();
		coin.flip();
		
		
		//play sound check
		//playSound("coin-flip.wav"); check
		//display coin flip
		//displayImage("CoinFlipASCI.txt");
		//get heads or tails, side of coin equals 1 or 0
		//int coinSide = flipCoin();
		//display coin side. Can use displayImage based on value from flipCoin
		//displayCoin(coinSide,CoinHeads.txt,CoinTails.txt);
		
	}

}
