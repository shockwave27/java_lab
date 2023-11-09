import java.applet.Applet;
import java.awt.Graphics;

public class Kite extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {100, 150, 100, 50};
        int[] yPoints = {100, 150, 200, 150};

        // Draw the diamond shape
        g.setColor(java.awt.Color.red);
        g.fillPolygon(xPoints, yPoints, 4);

        // Draw the tail
        g.setColor(java.awt.Color.blue);
        g.drawLine(100, 200, 100, 300);

        // Draw the string
        g.setColor(java.awt.Color.black);
        g.drawLine(100, 300, 100, 400);
    }
}
