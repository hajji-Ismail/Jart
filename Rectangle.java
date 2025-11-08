import java.awt.Color;
import java.util.Random;

public class Rectangle implements Drawable {

    Point a;
    Point b;
    private static final Random random = new Random();
    Color color;

    Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.color = new Color(random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256));
    }

    @Override
    public void draw(Displayable displayable) {
        Point c = new Point(a.x, b.y);
        Point d = new Point(b.x, a.y);
        Line side1 = new Line(a, d, getColor());
        Line side2 = new Line(d, b, getColor());
        Line side3 = new Line(b, c, getColor());
        Line side4 = new Line(c, a, getColor());

        side1.draw(displayable);
        side2.draw(displayable);
        side3.draw(displayable);
        side4.draw(displayable);

    }

    @Override
    public Color getColor() {
        return color;
    }
}