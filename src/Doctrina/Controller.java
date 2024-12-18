package Doctrina;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;


public class Controller implements KeyListener {
    private final HashMap<Integer, Boolean> pressedKeys;

    public Controller(){
        pressedKeys = new HashMap<>();
        RenderingEngine.getInstance().addKeyListenner(this);
    }

    protected void bindKey(int keyCode){
        pressedKeys.put(keyCode,false);
    }
    protected void unbindKey(int keyCode){
        pressedKeys.put(keyCode,true); //TODO: Valider la methode.
    }

    protected void clearKeys(){
        pressedKeys.clear();
    }

    public boolean isKeyPressed(int keyCode){
        return pressedKeys.containsKey(keyCode) && pressedKeys.get(keyCode);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (pressedKeys.containsKey(keyCode)){
            pressedKeys.put(keyCode,true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (pressedKeys.containsKey(keyCode)){
            pressedKeys.put(keyCode,false);
        }
    }
}
