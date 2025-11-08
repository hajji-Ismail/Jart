import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Image implements Displayable {
    private final BufferedImage image;
    private final int width;
    private final int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    @Override
    public void display(int x, int y, Color color) {
        image.setRGB(x, y, color.getRGB());
    }

    @Override
    public void save(String filename) {
        try {
            ImageIO.write(image, "png", new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
