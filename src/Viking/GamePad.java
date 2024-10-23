package Viking;

import Doctrina.MouvementController;

import java.awt.event.KeyEvent;

public class GamePad extends MouvementController {
    private int quitKey = KeyEvent.VK_Q;
    private final int fireKey = KeyEvent.VK_SPACE;
    public GamePad(){
        bindKey(quitKey);
        bindKey(fireKey);
    }
    public boolean isquietPressed(){
        return isKeyPressed(quitKey);
    }

    public boolean isQuitPressed(){
        return isKeyPressed(quitKey);
    }
    public boolean isFirePressed(){
        return isKeyPressed(fireKey);
    }
}
