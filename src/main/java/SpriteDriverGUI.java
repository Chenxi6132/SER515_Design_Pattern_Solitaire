import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
    public static JLabel resultLabel;
    public static void main(String avg[]) throws Exception {
        Sprite sprite = new Sprite();
        String fileName = "src/main/resources/English_pattern_playing_cards_deck.svg.png";
        sprite.getSpriteSheet(fileName);  // this knows the size of a card
        BufferedImage imgKS = sprite.getSprite(0, 0);  // 4 Suits X 13 Ranks
        BufferedImage img10c = sprite.getSprite(12, 3);  // 4 Suits X 13 Ranks


        // 0 spades, 1 hearts, 2 diamonds, 3 clubs

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
                DeckSingleton.cards.clear();
                DeckSingleton deck = new DeckSingleton();
                deck.printDeck();
                DeckSingleton.hand.clear();
                JOptionPane.showMessageDialog(frame, "Game has been reset!");
                if (resultLabel != null) {
                    frame.getContentPane().remove(resultLabel);
                    resultLabel = null; // reset the reference to the JLabel
                }

                // Refresh the JFrame
                frame.revalidate();
                frame.repaint();
            }
        });
        frame.add(btnReset);

        JButton btnShuffle = new JButton("Shuffle Card");
        btnShuffle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: implement choose rules logic here
                DeckSingleton.shuffle();
                JOptionPane.showMessageDialog(frame, "cards shuffled. You can shuffled as much as you wanted");
            }
        });
        frame.add(btnShuffle);

        JButton btnRulesBasic = new JButton("Basic rules");
        btnRulesBasic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: implement choose rules logic here
                JOptionPane.showMessageDialog(frame, "You chosen the Basic rules! Let's start !!!");
                Driver.dealCardBasic();
                Driver.lastStepBasic();
                int sizeofHandF = DeckSingleton.hand.size();
                // Create a new JLabel to display the result
                JLabel resultLabel = new JLabel("The result is: " + Driver.getResult(sizeofHandF));

                // Add the JLabel to the JFrame
                frame.getContentPane().add(resultLabel);

                // Refresh the JFrame

                frame.revalidate();
                frame.repaint();
            }
        });
        frame.add(btnRulesBasic);

        JButton btnRulesIntermediate = new JButton("Intermediate Rules");
        btnRulesIntermediate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: implement choose rules logic here
                JOptionPane.showMessageDialog(frame, "You chosen the Intermediate rules! Let's start !!!");
                Driver.dealCardIntermediate();
                Driver.lastStepIntermediate();
                int sizeofHandF = DeckSingleton.hand.size();
                // Create a new JLabel to display the result
                JLabel resultLabel = new JLabel("The result is: " + Driver.getResult(sizeofHandF));

                // Add the JLabel to the JFrame
                frame.getContentPane().add(resultLabel);

                // Refresh the JFrame
                frame.revalidate();
                frame.repaint();
            }
        });
        frame.add(btnRulesIntermediate);

        JButton btnRulesHouse = new JButton("House Rules");
        btnRulesHouse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: implement choose rules logic here
                JOptionPane.showMessageDialog(frame, "You chosen the House rules! Let's start !!!");
                Driver.dealCardHouseRule();
                Driver.lastStepHouseRule();
                int sizeofHandF = DeckSingleton.hand.size();
                // Create a new JLabel to display the result
                JLabel resultLabel = new JLabel("The result is: " + Driver.getResult(sizeofHandF));

                // Add the JLabel to the JFrame
                frame.getContentPane().add(resultLabel);

                // Refresh the JFrame
                frame.revalidate();
                frame.repaint();
            }
        });
        frame.add(btnRulesHouse);

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