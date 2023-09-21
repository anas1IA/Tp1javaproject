package EX4;
import java.util.Random;
public class Tortue implements Runnable {

	public Tortue() {
		// TODO Auto-generated constructor stub
	}
	@Override
    public void run() {
        System.out.println("La tortue commence la course.");
        
        // La tortue se d�place lentement, sans s'arr�ter.
        for (int i = 1; i <= 10; i++) {
            System.out.println("La tortue a parcouru " + i + " �tape(s).");
            try {
                // Pause al�atoire entre les �tapes pour simuler la lenteur.
                Thread.sleep(new Random().nextInt(1000) + 1000);
            } catch (InterruptedException e) {
                System.out.println("La tortue a �t� interrompue !");
                return;
            }
        }
        
        System.out.println("La tortue a termin� la course et gagn� !");
    }
}



