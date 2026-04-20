import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class DigitalClock {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            JLabel clockLabel = new JLabel();

            clockLabel.setFont(new Font("Arial", Font.BOLD, 40));
            clockLabel.setHorizontalAlignment(JLabel.CENTER);

            frame.add(clockLabel);
            frame.setSize(400, 200);
            frame.setTitle("Digital Clock");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            Timer timer = new Timer(1000, e -> {
                String time = sdf.format(new Date());
                clockLabel.setText(time);
            });
            timer.start();
        });
    }
}