package MovingRectangle;

import Doctrina.Canvas;
import Doctrina.Controller;
import Doctrina.Game;

import java.awt.*;

public class MovingRectagleGame extends Game {
    private GamePad gamePad;
    private Player player;
    private Npc npc;
    @Override
    protected void initialize() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        npc = new Npc();
    }

    @Override
    protected void update() {
        if (gamePad.isQuitPresssed()){
            stop();
        }
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
