package Tank;

import Doctrina.MouvementController;

import java.awt.event.KeyEvent;

public class GamePad extends MouvementController {
    private final int quitKey = KeyEvent.VK_Q;
    private final int fireKey = KeyEvent.VK_SPACE;

    public GamePad() {
        bindKey(quitKey);
        bindKey(fireKey);
    }

    public boolean isQuitPressed(){
        return isKeyPressed(quitKey);
    }
    public boolean isFirePressed(){
        return isKeyPressed(fireKey);
    }
}
