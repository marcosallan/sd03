package n1sd3;


public class Consumer implements Runnable {
	private Word word;
	private String name;
	
	public Consumer(String name, Word word) {
		this.name = name;
		this.word = word;
	}
	
	public void takeWord() {
		word.consumeWord(name);
	}
	
	public void run() {
		for(int i = 0; i < 11; i++) {
			takeWord();
		}
	}
}
