import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class mouse_moved extends JPanel implements MouseMotionListener {
    int x , y;
    String texto = "";

    public mouse_moved(){
        addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("1200px-Escudo_Saprissa_2012.png"));
        g.drawImage(imagen.getImage(), x, y, 32, 32, null);
        Font fuente = new Font("Arial", Font.BOLD, 30);
        g.setFont(fuente);
        g.drawString(texto, 20, 400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo MouseMoved");
        frame.getContentPane().add(new mouse_moved());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = (int)e.getPoint().getX();
        y = (int)e.getPoint().getY();
        texto = "X: "+ x + "    Y: " + y;
        repaint();
    }
}
