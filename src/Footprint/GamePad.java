package Footprint;

import Doctrina.MouvementController;

import java.awt.event.KeyEvent;

public class GamePad extends MouvementController {
    private int quitKey = KeyEvent.VK_Q;

    public GamePad(){
        bindKey(quitKey);
    }
    public boolean isquietPressed(){
        return isKeyPressed(quitKey);
    }
}
