package EX4;
import java.util.Random;
public class Lievre implements Runnable{

	public Lievre() {
		// TODO Auto-generated constructor stub
	}
	 public void run() {
	        System.out.println("Le li�vre commence la course.");
	        
	        try {
	            // Le li�vre dort au milieu de la course pendant 2 secondes.
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.out.println("Le li�vre a �t� r�veill� !");
	        }
	        
	        System.out.println("Le li�vre se r�veille, mais c'est trop tard. La tortue a gagn� la course.");
	    }
	}

