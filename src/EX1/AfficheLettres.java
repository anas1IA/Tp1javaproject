package EX1;

public class AfficheLettres  implements Runnable {

	public AfficheLettres() {
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public void run() {
	        for (char c = 'a'; c <= 'z'; c++) {
	            System.out.println("Lettre : " + c);
	        }
	    }
	}

