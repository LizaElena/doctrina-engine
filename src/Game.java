import java.awt.*;

public abstract class Game {
    private static final int SLEEP = 25;
    private boolean playing = true;
    private long before;
    private RenderingEngine renderingEngine;


    public Game(){
        renderingEngine = new RenderingEngine();
    }
    public void start(){
        initialize();
        run();
    }

    private void run() {
        renderingEngine.start();
        updateSyncTime();
        while (playing){
            update();
            drawOnBuffer(renderingEngine.buildBuffer());
            renderingEngine.drawBufferOnScreen();
            sleep();
        }
    }

    protected abstract void initialize();
    protected abstract void update();
    protected abstract void drawOnBuffer(Graphics2D bufferEngine);

    private void sleep(){

        try {
            Thread.sleep(getSleepTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateSyncTime();
    }

    private long getSleepTime() {
        long sleep = SLEEP - (System.currentTimeMillis() - before);
        if (sleep < 4){
            sleep = 4;
        }
        return sleep;
    }
    private void updateSyncTime() {
        before = System.currentTimeMillis();
    }
}
