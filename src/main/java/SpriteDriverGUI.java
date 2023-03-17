import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.net.URL;
//from   www.java2s.com
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;

    public class SpriteDriverGUI {
        public static void main(String avg[]) throws Exception {
            Sprite sprite = new Sprite();
            String fileName = "English_pattern_playing_cards_deck.svg.png";
            sprite.getSpriteSheet(fileName);  // this knows the size of a card
            BufferedImage imgKS = sprite.getSprite(0, 12);  // 4 Suits X 13 Ranks
            BufferedImage img10c = sprite.getSprite(3, 9);  // 4 Suits X 13 Ranks
            // 0 spades, 1 hearts, 2 diamonds, 3 clubs


//		ImageIcon icon = new ImageIcon(imgKS); // default size
            ImageIcon iconKC = new ImageIcon(imgKS.getScaledInstance(100, 200, imgKS.getType())); // smaller image
            ImageIcon icon10c = new ImageIcon(img10c.getScaledInstance(100, 200, img10c.getType())); // smaller image
            JFrame frame = new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(500, 600);
            JLabel lbl = new JLabel();
            lbl.setIcon(iconKC);
            frame.add(lbl);
            JLabel lbl10c = new JLabel();
            lbl10c.setIcon(icon10c);
            frame.add(lbl10c);

            JButton btnReset = new JButton("Reset Game");
            btnReset.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // TODO: implement reset game logic here
                    JOptionPane.showMessageDialog(frame, "Game has been reset!");
                }
            });
            frame.add(btnReset);

            JButton btnRules = new JButton("Choose Rules");
            btnRules.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // TODO: implement choose rules logic here
                    JOptionPane.showMessageDialog(frame, "You have chosen the rules!");
                }
            });
            frame.add(btnRules);

            JButton btnEnd = new JButton("End Game");
            btnEnd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to end the game?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                }
            });
            frame.add(btnEnd);

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

