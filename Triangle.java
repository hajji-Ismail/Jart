import java.awt.Color;
import java.util.Random;

public class Triangle implements Drawable {
    Point a, b, c;
    Color color;
    private static final Random random = new Random();
    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
          this.color = new Color(random.nextInt(256),  
                               random.nextInt(256),   
                               random.nextInt(256));  
    }

    @Override
    public void draw(Displayable displayable) {
        Line side1 = new Line(a, b, getColor());
        Line side2 = new Line(b, c, getColor());
        Line side3 = new Line(c, a, getColor());
        side1.draw(displayable);
        side2.draw(displayable);
        side3.draw(displayable);

    }
@Override
    public Color getColor() {
        return color;
    }
}