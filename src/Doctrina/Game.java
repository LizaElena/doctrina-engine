package Doctrina;

import java.awt.event.KeyListener;

public abstract class Game {

    private boolean playing = true;
    private RenderingEngine renderingEngine;
    private GameTime gameTime;

    public Game(){
        renderingEngine = new RenderingEngine();
    }
    public final void start(){
        initialize();
        run();
    }
    public  void addKeyListenner(KeyListener keyListener){
        renderingEngine.addKeyListenner(keyListener);
    }
    private void run() {
        renderingEngine.start();
        gameTime = new GameTime();
        while (playing){
            update();
            draw(renderingEngine.buildCanvas());
            renderingEngine.drawBufferOnScreen();
            gameTime.synchronize();
        }
    }

    protected abstract void initialize();
    protected abstract void update();
    protected abstract void draw(Canvas canvas);


}
