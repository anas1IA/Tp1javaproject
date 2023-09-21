package EX1;

public class AfficheNombres  implements Runnable {

	public AfficheNombres() {
		// TODO Auto-generated constructor stub
	}
	 public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Nombre : " + i);
	        }
	    }
	}

