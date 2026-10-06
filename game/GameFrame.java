import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GameFrame() {
        this.setTitle("Game Frame");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Intro intro = new Intro("gogo.gif",3);
        this.add(intro, BorderLayout.CENTER);
        this.setVisible(true);

        Player player = new Player();
        this.add(player);
        player.requestFocusInWindow();

    }
}
