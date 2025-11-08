import java.util.Random;
import java.awt.Color;

public class Point implements Drawable {
    int x;
    int y;
    Color color;

    private static final Random random = new Random();

 

    Point(int x, int y) {
        this.x = x;
        this.y = y;
            this.color = new Color(random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256));


    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public void draw(Displayable displayable) {
         displayable.display(x, y, color);
    }
    @Override
    public Color getColor() {
        return color;
    }
    public Point random(int width , int height){
        return new Point(random.nextInt(width), random.nextInt(height));


    }

}