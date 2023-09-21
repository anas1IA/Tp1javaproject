package EX3;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Time {
    private long millis;

    public Time() {
        this.millis = System.currentTimeMillis();
    }

    public void tick() {
        millis += 1000;
    }

    public long getMillis() {
        return millis;
    }
}
