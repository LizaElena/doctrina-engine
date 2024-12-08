package Doctrina;

import java.awt.*;

public class Canvas {

    private Graphics2D graphics;
    public Canvas(Graphics2D graphics){
        this.graphics = graphics;
    }
    public void drawString(String text, int x, int y, Paint paint){
        graphics.setPaint(paint);
        graphics.drawString(text,x,y);
    }
    public void drawCircle(int x, int y, int radius, Paint paint){
        graphics.setPaint(paint);
        graphics.fillOval(x,y,radius*2, radius*2);
    }
    public void drawRectagle(StaticEntity entity, Paint paint){
        drawRectagle(entity.x, entity.y, entity.width, entity.height, paint);
    }

    public void drawRectagle(int x, int y, int width, int height, Paint paint){
        graphics.setPaint(paint);
        graphics.fillRect(x,y,width, height);
    }

    public void drawImage(Image image, int x, int y){
        graphics.drawImage(image,x,y,null);
    }

    public void setGraphics(Graphics2D graphics) {
        this.graphics = graphics;
    }

    public Graphics2D getGraphics() {
        return graphics;
    }
}
