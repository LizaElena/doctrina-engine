package MovingRectangle;

import Doctrina.Canvas;
import Doctrina.Controller;

import java.awt.*;

public class Player {
    private GamePad gamepad;
    private int x;
    private int y;
    private int speed;
    public Player(GamePad gamePad){
        x = 200;
        y = 200;
        speed = 3;
        this.gamepad = gamePad;
    }

    public void update(){
       if (gamepad.isDownPressed()){
           y += speed;
       } else if (gamepad.isUpPressed()) {
           y -= speed;
       }else if (gamepad.isLeftPressed()) {
           x -= speed;
       }else if (gamepad.isRightPressed()) {
           x += speed;
       }
    }

    public void draw(Canvas canvas){
        canvas.drawRectagle(x,y,20,60, Color.WHITE);
    }

}
