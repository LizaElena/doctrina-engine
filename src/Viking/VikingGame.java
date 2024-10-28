package Viking;

import Doctrina.Canvas;
import Doctrina.Game;
import Doctrina.RenderingEngine;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class VikingGame extends Game {

    private Player player;
    private GamePad gamePad;
    private World world;
    private Tree tree;


    private int soundCoolDown = 0;
    @Override
    protected void initialize() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        world = new World();
        tree = new Tree();
        world.load();
        tree.load();
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream("audios/music.wav"));

            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        }catch (Exception e){
            e.printStackTrace();
        }

        RenderingEngine.getInstance().getScreen().fullscreen();
        RenderingEngine.getInstance().getScreen().hideCursor();

    }

    @Override
    protected void update() {
        if (gamePad.isquietPressed()){
            stop();
        }
        player.update();
        soundCoolDown--;
        if (gamePad.isFirePressed() && soundCoolDown <= 0){
            soundCoolDown = 100;

            SoundEffect.MURLOC.play();
        }
    }

    @Override
    protected void draw(Canvas canvas) {
        world.draw(canvas);
        //tree.draw(canvas);
        //player.draw(canvas);
        // 80 - 28 (max layer) = 52
        if (player.getY() < tree.getY() + 52){
            player.draw(canvas);
            tree.draw(canvas);
        }else {
            tree.draw(canvas);
            player.draw(canvas);
        }
    }
}
