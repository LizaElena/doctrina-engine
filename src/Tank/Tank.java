package Tank;

import Doctrina.Canvas;
import Doctrina.ControllableEntity;
import Doctrina.MouvementController;

import java.awt.*;

public class Tank extends ControllableEntity {
    private int cooldwon = 0;
    public Tank(MouvementController controller) {
        super(controller);
        setDimension(30,30);
        setSpeed(3);
        teleport(300,300);
    }

    public Missile fire(){
        cooldwon = 60;
        return new Missile(this);
    }

    public boolean canFire(){
        return cooldwon == 0;
    }
    @Override
    public void update() {
        super.update();
        moveWithController();

        if (!canFire()){
            cooldwon--;
        }
    }

    @Override
    public void draw(Canvas canvas) {

        canvas.drawRectagle(this, Color.GREEN);
        int coolDownWidth = (cooldwon * width) / 60;
        canvas.drawRectagle(x, y-5, coolDownWidth, 2, Color.RED);

        //HITBOX FOR DEBUG
        if (hasMoved()){
            drawHitBox(canvas);
        }

    }


}
