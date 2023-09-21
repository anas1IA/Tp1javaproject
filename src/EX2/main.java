package EX2;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Mythread2 T2 = new Mythread2();
		T2.name="A2";
		Mythread2 T3 = new Mythread2();
		T3.name="A3";
		Mythread2 T4 = new Mythread2();
		T4.name="A4";
	
	   T2.start();
	   T3.start();
	   T4.start();
	}

}
