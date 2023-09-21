package EX4;

public class CourseLievreTortue {

	public CourseLievreTortue() {
		// TODO Auto-generated constructor stub
	}

	
    public static void main(String[] args) {
        Runnable lievreRunnable = new Lievre();
        Runnable tortueRunnable = new Tortue();

        Thread lievreThread = new Thread(lievreRunnable);
        Thread tortueThread = new Thread(tortueRunnable);

        lievreThread.start();
        tortueThread.start();
    }
}

