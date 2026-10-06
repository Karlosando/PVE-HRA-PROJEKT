import javax.swing.*;
import java.awt.*;

public class Intro extends JPanel {

    public Intro(JFrame okno, String gif, int sekundy) {
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        // Vložení GIFu na střed panelu
        add(new JLabel(new ImageIcon(gif)), BorderLayout.CENTER);

        Timer t = new Timer(sekundy * 1000, e -> {
            SwingUtilities.invokeLater(() -> {

                okno.remove(this); // 1. OBRATEM smaže intro z okna
                okno.revalidate(); // 3. Osvěží vnitřní strukturu okna (opraví bugy s rozvržením)
                okno.repaint();    // Fyzicky překreslí grafiku na obrazovce
            });
        });
        t.setRepeats(false); // Spustí se pouze jednou
        t.start();
    }
}
