package EX4;
import java.util.Random;
public class Lievre implements Runnable{

	public Lievre() {
		// TODO Auto-generated constructor stub
	}
	 public void run() {
	        System.out.println("Le lièvre commence la course.");
	        
	        try {
	            // Le lièvre dort au milieu de la course pendant 2 secondes.
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.out.println("Le lièvre a été réveillé !");
	        }
	        
	        System.out.println("Le lièvre se réveille, mais c'est trop tard. La tortue a gagné la course.");
	    }
	}

