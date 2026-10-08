import javax.swing.*;
import java.awt.*;

public class Enemy01 extends JPanel {
    private int Enemy01X = 400;
    private int Enemy01Y = 300;


    Timer t = new Timer(16, e -> {

    });



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillOval(400,400,20,20);

        }
    }
