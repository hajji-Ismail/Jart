import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private final Point x;
    private final Point y;
    Color color;
    private static final Random random = new Random();

    public Line(Point x, Point y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Line(Point x, Point y) {
        this.x = x;
        this.y = y;
        this.color = new Color(random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256));
    }

    @Override
    public void draw(Displayable displayable) {
        int x0 = x.x;
        int y0 = x.y;
        int x1 = y.x;
        int y1 = y.y;

        int dx = x1 - x0;
        int dy = y1 - y0;
        int step = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);

        float x_incr = (float) dx / step;
        float y_incr = (float) dy / step;

        float xf = x0;
        float yf = y0;

        for (int i = 0; i <= step; i++) {
            displayable.display(Math.round(xf), Math.round(yf), color);
            xf += x_incr;
            yf += y_incr;
        }
    }

    @Override
    public Color getColor() {
        return color;
    }

    public Line random(int width , int height){
        return new Line(new Point(random.nextInt(width), random.nextInt(height)), new Point(random.nextInt(width), random.nextInt(height)));
    }
}
