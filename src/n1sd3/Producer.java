package n1sd3;

import java.util.Random;

public class Producer implements Runnable {
	private Word word;
	private String name;
	
	public Producer(String name, Word word) {
		this.name = name;
		this.word = word;
	}
	
	public void putWord(String wordStr) {
		Random rand = new Random();
		word.createWord(name, wordStr);
		try {
			Thread.sleep(rand.nextInt(101));
		}
		catch(InterruptedException ie) {}
	}
	
	public void run() {
		for(int i = 0; i < 11; i++) {
			putWord(generate());
		}
	}
	
	public String generate() {
		Random rand = new Random();
		String str = "";
		for(int i = 0; i < 5; i++) {
			str += (char) (rand.nextInt(26) + 65);
		}
		return str;
	}
}
