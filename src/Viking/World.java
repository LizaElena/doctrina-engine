package Viking;

import java.awt.*;
import java.io.IOException;

import Doctrina.Canvas;

import javax.imageio.ImageIO;

public class World {
    private static final String MAP_PATH = "images/demo.png";

    private Image background;

    public void load(){
        try {
            background =  ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(MAP_PATH));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //System.out.println("toujours exécuter");
        }
    }

    public void draw(Canvas canvas){
        canvas.drawImage(background,0,-64);
    }
}