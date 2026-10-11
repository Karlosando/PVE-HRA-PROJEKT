//GameFrame
import javax.swing.*;

public class GameFrame extends JFrame {

    Panel panel;

    GameFrame() {
        this.setTitle("Game Frame");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new Panel();

        this.add(panel);
        this.pack();


        this.setVisible(true);
    }
}
