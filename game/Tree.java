import java.awt.*;

public class Tree {
    private int positionX;
    private int positionY;

    public Tree(int positionX, int positionY){
        this.positionX=positionX;
        this.positionY=positionY;
    }

    public void paint(Graphics2D g2){
        g2.setColor(new Color(139, 69, 19));
        g2.fillRect(positionX,positionY,10,50);
    }
}
