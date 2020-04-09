package n1sd3;

public class Word {
	private String indexWord;
	private boolean available = false;
	
	public synchronized void consumeWord(String who) {
		while(!available) {
			try {
				wait();
			}
			catch (InterruptedException e) {}
		}
		available = false;
		notifyAll();
		System.out.println(who + " consumiu a palavra " + indexWord);
	}
	
	public synchronized void createWord(String who, String word) {
		while(available) {
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		indexWord = word;
		available = true;
		System.out.println(who + " gerou a palavra " + indexWord);
		notifyAll();
	}
}
