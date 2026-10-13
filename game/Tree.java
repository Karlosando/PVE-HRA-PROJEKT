import com.sun.nio.sctp.AbstractNotificationHandler;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Tree {
    private int positionX;
    private int positionY;
    private Rectangle hitbox;
    private Mouse_hitbox mouse_hitbox;

    ImageIcon tree_icon01 = new ImageIcon("treeimg01.png");
    ImageIcon tree_icon02 = new ImageIcon("treeimg02.png");
    ImageIcon tree_icon03 = new ImageIcon("treeimg03.png");

    private ImageIcon[] tree_icons;
    private int currentImageIndex = 0;

    public Tree(int positionX, int positionY){
        this.positionX=positionX;
        this.positionY=positionY;

        this.tree_icons = new ImageIcon[]{tree_icon01, tree_icon02, tree_icon03};

        this.hitbox=new Rectangle(positionX,positionY,128,128);
    }


    public void changeImage() {
        if(currentImageIndex < tree_icons.length-1){
            currentImageIndex++;
        }
    }

    public Rectangle getHitbox() {
        return this.hitbox;
    }

    public void paint(Graphics2D g2){
        g2.drawImage(tree_icons[currentImageIndex].getImage(),positionX,positionY,null);

    }
}
