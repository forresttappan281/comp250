# comp250
import javax.swing.*;
import java.awt.*;
public class SimpleWindow extends JFrame
{
public static final int WIDTH = 300;
public static final int HEIGHT = 200;
public SimpleWindow()
{
setSize(WIDTH,HEIGHT);
Container contentPane = getContentPane();
JLabel label = new JLabel
("You can display text using a label.");
contentPane.add(label);
contentPane.setBackground(Color.CYAN);
addWindowListener(new WindowDestroyer());
}
public static void main(String[] args)
{
SimpleWindow window = new SimpleWindow();
window.setVisible(true);
}
}
