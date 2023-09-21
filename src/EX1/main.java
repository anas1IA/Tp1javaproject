package EX1;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
        // Créez les instances des classes Runnable
        Runnable runnable1 = new AfficheNombres();
        Runnable runnable2 = new AfficheLettres();

        // Créez les threads et démarrez-les
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
}
}