import java.awt.*;
import java.util.Random;

public class Ball {
    public static final int DEFAULT_SPEED = 5;
    private int radius;
    private int speed;
    private int x;
    private int y;
    private int dx;
    private int dy;


    public Ball(int raduis, int speed){
        this.radius = raduis;
        this.speed = speed;
        initializePosition();
    }
    public Ball(int raduis){
        this(raduis, DEFAULT_SPEED);
    }


    private void initializePosition(){
         x = randomNumber(radius*2, 800 - radius*2);
         y = randomNumber(radius*2, 600 - radius*2);
         dx = randomNumber(0,1) == 0 ? speed : -speed;
             dy = randomNumber(0,1) == 0 ? speed : -speed;
    }
    public void update(){
        x += dx;
        y += dy;

        if (hasTouchedVertical()){
            dy *= -1;
        }
        if (hasTouchedHorizontal()){
            dx *= -1;
        }
    }

    public void draw(Graphics2D bufferEngine){
        bufferEngine.setPaint(Color.RED);
        bufferEngine.fillOval(x,y, radius*2, radius*2);
    }


    public boolean hasTouched(){
        return hasTouchedHorizontal()
                || hasTouchedVertical();
    }

    private int randomNumber(int min, int max){
        return (new Random()).nextInt((max-min) + 1) + min;
    }
    private boolean hasTouchedVertical(){
        return y <= radius || y >= 600-radius;
    }
    private boolean hasTouchedHorizontal(){
        return x <= radius || x >= 800-radius;
    }
}
