import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends JPanel implements KeyListener {



    private int playerX = 400;
    private int playerY = 300;
    private int speed = 4;
    private ImageIcon playerImg = new ImageIcon("Crash.png");


    private boolean up, down, left, right, shift;

    public Player() {
        this.setFocusable(true);
        this.addKeyListener(this);

        Timer timer = new Timer(16, e -> {

            if (up)    playerY -= speed;
            if (down)  playerY += speed;
            if (left)  playerX -= speed;
            if (right) playerX += speed;
            if (shift) speed = 8;
                else speed = 4;

            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (playerImg != null) {
            g2d.drawImage(playerImg.getImage(), playerX - 20, playerY - 20, 200,200,null);

        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W) up = true;
        if (key == KeyEvent.VK_S) down = true;
        if (key == KeyEvent.VK_A) left = true;
        if (key == KeyEvent.VK_D) right = true;
        if (key == KeyEvent.VK_SHIFT) shift = true;
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) up = false;
        if (code == KeyEvent.VK_S) down = false;
        if (code == KeyEvent.VK_A) left = false;
        if (code == KeyEvent.VK_D) right = false;
        if (code == KeyEvent.VK_SHIFT) shift = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
