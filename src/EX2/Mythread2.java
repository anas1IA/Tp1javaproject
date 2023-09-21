package EX2;
import java.util.Random;
public class Mythread2 extends Thread {

	public Mythread2() {
		// TODO Auto-generated constructor stub
	}
	public String name;
	public void run() {
		
		for (int i=1; i<=5;i++) {
			 Random random = new Random();
		        int delaiMillisecondes = random.nextInt(101); // Génère un nombre aléatoire entre 0 et 100
		     
		        try {
		            Thread.sleep(delaiMillisecondes);
		            System.out.println("the name of "+name);
		        } catch (InterruptedException e) {   e.printStackTrace();
		
			}
     
	     }
		

}}
