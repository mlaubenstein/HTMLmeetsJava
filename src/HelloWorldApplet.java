
// Datei: HelloWorldApplet.java
import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet
{
    public void paint (Graphics g) // g ist eine Referenz auf den
    {                              // Zeichenbereich des Applets
        g.drawString ("Hello, world", 50, 20);
    }
}