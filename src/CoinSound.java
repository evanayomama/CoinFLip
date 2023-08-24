import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class CoinSound {
	public static void coinSound() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	File file = new File("coin-flip-88793.wav");
	AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	Clip clip = AudioSystem.getClip();
	clip.open(audioStream);
	clip.start();
	}
}
