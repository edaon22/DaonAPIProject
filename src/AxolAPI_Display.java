import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AxolAPI_Display {
    public static void main(String args[]) {
//        var frame = new JFrame();
//        //var icon = new ImageIcon("axolImage.jpg");
//        Image icon = new ImageIcon("axolImage.jpg").getImage();
//        var label = new JLabel(icon);
//        frame.add(label);
//        frame.setDefaultCloseOperation
//                (JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);

        try {
            Image picture = ImageIO.read(new File("axolImage.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
