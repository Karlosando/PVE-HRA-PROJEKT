import java.awt.*;
import java.awt.event.*;

public class Mouse_hitbox implements MouseListener{
    private Tree[] trees;

    public Mouse_hitbox(Tree[] trees) {
        this.trees = trees;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
            for(Tree s : trees){
                if(s.getHitbox().contains(e.getPoint())){
                    s.changeImage();
                    e.getComponent().repaint();
                }
            }
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
