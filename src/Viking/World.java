package Viking;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import Doctrina.Canvas;
import Doctrina.StaticEntity;

import javax.imageio.ImageIO;

public class World extends StaticEntity {
    private static final String MAP_PATH = "images/demo.png";

    private Image background;

    private ArrayList<Blockade>  blockades = new ArrayList<>();

    public World(){

        blockades.add(new Blockade());
        blockades.add(new Blockade());
        blockades.get(0).setDimension(380,40);
        blockades.get(1).setDimension(400,40);
        blockades.get(1).teleport(480,0);

    }

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
