package Tank;

import Doctrina.Canvas;
import Doctrina.ControllableEntity;
import Doctrina.MouvementController;

import java.awt.*;

public class Tank extends ControllableEntity {
    public Tank(MouvementController controller) {
        super(controller);
        setDimension(30,30);
        setSpeed(3);
        teleport(300,300);
    }

    @Override
    public void update() {
        moveWithController();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectagle(this, Color.GREEN);
    }
}
