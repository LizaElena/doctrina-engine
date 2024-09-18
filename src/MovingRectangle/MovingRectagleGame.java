package MovingRectangle;

import Doctrina.Canvas;
import Doctrina.Game;

import java.awt.*;

public class MovingRectagleGame extends Game {
    private Player player;
    private Npc npc;
    @Override
    protected void initialize() {
        player = new Player();
        npc = new Npc();
    }

    @Override
    protected void update() {
        player.update();
        npc.update();
    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectagle(0,0,800,600, Color.BLUE);
        player.draw(canvas);
        npc.draw(canvas);
    }
}
