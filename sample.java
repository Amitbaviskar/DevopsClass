import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class DigitalClock {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel clockLabel = new JLabel();

        clockLabel.setFont(new Font("Arial", Font.BOLD, 40));
        clockLabel.setHorizontalAlignment(JLabel.CENTER);

        frame.add(clockLabel);
        frame.setSize(400, 200);
        frame.setTitle("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        while (true) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String time = sdf.format(new Date());
            clockLabel.setText(time);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}