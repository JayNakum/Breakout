package jaynakum.gameObjects;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import jaynakum.Commons;

public class Paddle extends Sprite  {

    private int dx;

    public Paddle() {
        initPaddle();
    }

    private void initPaddle() {
        loadImage();
        getImageDimensions();

        resetState();
    }

    private void loadImage() {
        var ii = new ImageIcon("resources/paddle.png");
        image = ii.getImage();
    }

    public void move() {
        x += dx;

        if (x <= 0) {
            x = 0;
        }

        if (x >= Commons.WIDTH - imageWidth) {
            x = Commons.WIDTH - imageWidth;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_ESCAPE) {
        	System.exit(0);
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    private void resetState() {
        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }
}