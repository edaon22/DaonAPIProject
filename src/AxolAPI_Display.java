import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class AxolAPI_Display {
    public static void main(String args[]) {
        var frame = new JFrame();
        var icon = new ImageIcon("axolImage.jpg");
        var label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        


    }

}
