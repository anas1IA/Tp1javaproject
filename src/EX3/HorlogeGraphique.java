package EX3;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HorlogeGraphique extends JLabel implements Runnable {
    private Time time;

    public HorlogeGraphique() {
        this.time = new Time();
        setHorizontalAlignment(JLabel.CENTER);
        setFont(new Font("Arial", Font.PLAIN, 24));
        updateClockText();
    }

    public void updateClockText() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        setText(sdf.format(new Date(time.getMillis())));
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Mettez à jour l'heure chaque seconde
                time.tick();
                SwingUtilities.invokeLater(this::updateClockText);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Horloge Graphique");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HorlogeGraphique clockLabel = new HorlogeGraphique();
        frame.add(clockLabel);

        frame.setVisible(true);

        // Créez et démarrez le thread de l'horloge
        Thread clockThread = new Thread(clockLabel);
        clockThread.start();
    }
}
