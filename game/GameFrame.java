import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {
        this.setTitle("Game Frame");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Player player = new Player();
        this.add(player);
        Intro intro = new Intro(this,"gogo.gif",5);
        this.add(intro);

        this.setVisible(true);
    }
}
