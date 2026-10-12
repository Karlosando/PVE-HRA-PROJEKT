import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Player_movement implements KeyListener {

    boolean up,left,down,right;
    public int speed = 4;


    private Player_model playermodel;

    public Player_movement(Player_model playermodel) {
        this.playermodel = playermodel;
    }


    public void update(){
        if (up == true) playermodel.move(0, -speed);
        if (left == true) playermodel.move(-speed, 0);
        if (down == true) playermodel.move(0, +speed);
        if (right == true) playermodel.move(+speed, 0);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W) up = true;
        if(key == KeyEvent.VK_A) left = true;
        if(key == KeyEvent.VK_S) down = true;
        if(key == KeyEvent.VK_D) right = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W) up = false;
        if(key == KeyEvent.VK_A) left = false;
        if(key == KeyEvent.VK_S) down = false;
        if(key == KeyEvent.VK_D) right = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
