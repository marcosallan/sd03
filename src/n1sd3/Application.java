package n1sd3;

public class Application {

	public static void main(String[] args) {
		Word word = new Word();
		
		Consumer cons = new Consumer("Fulano", word);
		Producer prod = new Producer("Ciclano", word);
		Consumer cons2 = new Consumer("Maquiavel", word);
		Producer prod2 = new Producer("Hobbes", word);
		
		new Thread(cons).start();
		new Thread(prod).start();
		new Thread(cons2).start();
		new Thread(prod2).start();
	}

}
