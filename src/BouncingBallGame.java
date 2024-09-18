
import java.awt.*;


public final class BouncingBallGame extends Game {
    private int score;
    private Ball ball;


    @Override
    protected void initialize() {
        ball = new Ball(25);
    }

    @Override
    public void update(){
        ball.update();
        if (  ball.hasTouched()  ){
            score += 10;
        }
    }
    @Override
    public void draw(Canvas canvas){
        ball.draw(canvas);
        canvas.drawString("Score: " + score, 10, 20, Color.WHITE);
        canvas.drawString(GameTime.getElapsedFormattedTime(), 10, 40, Color.WHITE);
        canvas.drawString("FPS:" + GameTime.getCurrentFps(), 10, 60, Color.WHITE);
    }




}
