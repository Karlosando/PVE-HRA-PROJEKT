import java.awt.*;
import java.awt.event.*;

public class Mouse_hitbox implements MouseListener{
    private Tree tree;

    public Mouse_hitbox(Tree tree) {
        this.tree = tree;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && tree.getHitbox().contains(e.getPoint())) {
            tree.changeImage();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
