package EX4;
import java.util.Random;
public class Tortue implements Runnable {

	public Tortue() {
		// TODO Auto-generated constructor stub
	}
	@Override
    public void run() {
        System.out.println("La tortue commence la course.");
        
        // La tortue se déplace lentement, sans s'arrêter.
        for (int i = 1; i <= 10; i++) {
            System.out.println("La tortue a parcouru " + i + " étape(s).");
            try {
                // Pause aléatoire entre les étapes pour simuler la lenteur.
                Thread.sleep(new Random().nextInt(1000) + 1000);
            } catch (InterruptedException e) {
                System.out.println("La tortue a été interrompue !");
                return;
            }
        }
        
        System.out.println("La tortue a terminé la course et gagné !");
    }
}



