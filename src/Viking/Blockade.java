package Viking;

import Doctrina.Canvas;
import Doctrina.CollidableRepository;
import Doctrina.StaticEntity;

import java.awt.*;

public class Blockade extends StaticEntity {
    public Blockade() {
        CollidableRepository.getInstance().registredEntity(this);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectagle(this, new Color(255,0,0,125));
    }
}
