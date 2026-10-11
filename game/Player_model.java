import java.awt.*;

public class Player_model {
    private int playerX;
    private int playerY;

    public Player_model(int playerX,int playerY){
        this.playerX=playerX;
        this.playerY=playerY;
    }


    public void paint(Graphics2D g2){
        g2.setColor(Color.MAGENTA);
        g2.fillRect(playerX,playerY,50,50);
    }

    public void move(int muchX, int muchY){
        this.playerX += muchX;
        this.playerY += muchY;
    }
}
