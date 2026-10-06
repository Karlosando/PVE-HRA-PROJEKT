import javax.swing.*;
import java.awt.*;

public class Intro extends JPanel{

    public Intro(String gif,int sekundy) {
        this.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());

        ImageIcon gifintro = new ImageIcon(gif);
        JLabel label = new JLabel(gifintro);
        this.add(label,BorderLayout.CENTER);


        Timer t = new Timer(sekundy * 1000,actionEvent -> {
            this.remove(label); // Smaže GIF z plochy
            this.setVisible(false);
            this.revalidate(); // Obnoví uspořádání prvků
            this.repaint();    // Fyzicky překreslí obrazovku načisto

        });
        t.setRepeats(false);
        t.start();
    }

}
