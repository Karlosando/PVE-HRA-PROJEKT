import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Player_model playermodel;
    Player_movement playermovement;
    private Tree[] trees={
            new Tree(100, 100),
            new Tree(250, 50),
            new Tree(50, 300),
            new Tree(150, 250),
            new Tree(350, 150),
            new Tree(300, 200)
    };

    Panel(){
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(new Color(34, 139, 34));

        this.playermodel=new Player_model(400,100);

        this.playermovement = new Player_movement(this.playermodel);
        this.setFocusable(true);
        this.addKeyListener(playermovement);

        Mouse_hitbox mouseHitbox = new Mouse_hitbox(this.trees);
        this.addMouseListener(mouseHitbox);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));
        g2.drawRect(50,50,100,200);
        g2.setFont(new Font("arial",Font.BOLD,100));
        g2.drawString("ahoj ondro jak se ti to libi?",50,500);

        this.playermodel.paint(g2);

        for(Tree s : trees){
            s.paint(g2);
        }

        repaint();

    }
}
