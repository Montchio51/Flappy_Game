import javax.swing.*;
import java.awt.*;

public class Display extends JPanel{   // JPanel ( ist ein Container_Objekt) verwendet man, um andere elemente zu gruppieren oder anzuordnen
    private final FlappyGame game;
    
    // Konstruktor für die Klasse Display
    public Display(FlappyGame game){     // Flappygame ist ein Fenster.
        this.game = game;
        game.add(this);
    }

    @Override
    public void paint(Graphics g){      // Überschreibung der Methode Paint der KLasse JPanel. Diese Methode dient zum Zeichnen von Inhalt von JPanel 
        Graphics2D g2 = (Graphics2D) g;  // Umwandlung von g (von typ Gaphics) in einem Objekt vom Typ Graphics2D, einfach weil Graphics2D eine Erweiterung von Graphics, die Funktionen Methoden hat 
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Diese Zeile schaltet die Kantenglättung (Antialiasing) ein, was bedeutet, dass gezeichnete Linien und Kanten glatter aussehen.
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);  // Diese Zeile stellt sicher, dass die Zeichnungen in hoher Qualität gerendert werden.
        game.render (g2);
    }
}
