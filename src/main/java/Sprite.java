import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sprite {
    private BufferedImage spriteSheet;
    private int spriteWidth;
    private int spriteHeight;

    public void getSpriteSheet(String fileName) throws IOException {
        File file = new File(fileName);
        spriteSheet = ImageIO.read(file);
        spriteWidth = spriteSheet.getWidth() / 13;
        spriteHeight = spriteSheet.getHeight() / 4;
    }

    public BufferedImage getSprite(int x, int y) {
        return spriteSheet.getSubimage(x * spriteWidth, y * spriteHeight, spriteWidth, spriteHeight);
    }

}
