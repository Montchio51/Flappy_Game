import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FlappyGame extends JFrame {  //JFrame ist damit, dass der Benutzer Interagieren kann.

    private Display display;

    public FlappyGame() {
        super("Flappy Game"); // Aufruft des Konstruktors der Klasse JFrame
        setSize(500, 500);   // Größe des Fensters
        setResizable(false); // Damit der Benutzer die Size nicht ändern kann. spricht der Benutzer kann nicht das Fenster größer oder kleiner machen
        setDefaultCloseOperation(EXIT_ON_CLOSE); //sorgt dafür, dass sich der Prozess beendet, wenn der Benutzer auf X clique. Ohne das würde der Prozess weiterlaufen, auch wenn der Benutzer auf X clique
        setLocationRelativeTo(null); // damit das Fenster zentriert ist
        display = new Display(this); 
        setVisible(true); // Damit der Benutzer etwas sieht
        startLoop();
    }

    private void startLoop(){
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            tick();
            display.repaint();
        }, 0L, 1000L / 60L, TimeUnit.MILLISECONDS);
    }

    public void tick(){
        
    }

    public void render (Graphics2D g){
        g.setColor(Color.yellow);  // g wird eine Farbe gegeben
        g.fillRect(0, 0, display.getWidth(), display.getHeight()); // hier wird die fläche (getWidth*getheight) in cyan gefäbrt

    }

    public static void main(String[] args) {
        new FlappyGame();
    }
}
