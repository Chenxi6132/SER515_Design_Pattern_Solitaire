import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sprite {
    public static BufferedImage spriteSheet;
    public static int spriteWidth;
    private static int spriteHeight;

    public static void getSpriteSheet(String fileName) throws IOException {
        File file = new File(fileName);
        spriteSheet = ImageIO.read(file);
        spriteWidth = spriteSheet.getWidth() / 13;
        spriteHeight = spriteSheet.getHeight() / 4;
    }

    public static BufferedImage getSprite(int x, int y) {
        if (spriteSheet == null) {
            throw new IllegalStateException("Sprite sheet not loaded");
        }
        if (x < 0 || x >= 13 || y < 0 || y >= 4) {
            throw new IllegalArgumentException("Invalid sprite coordinates");
        }
        return spriteSheet.getSubimage(x * spriteWidth, y * spriteHeight, spriteWidth, spriteHeight);
    }

}