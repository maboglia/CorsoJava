package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class QuadranteCartesiano extends JFrame {
    private PannelloQuadrante pannello;

    public QuadranteCartesiano() {
        setTitle("Quadrante Cartesiano con Punti Casuali");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        pannello = new PannelloQuadrante();

        JButton btnAggiungiPunto = new JButton("Aggiungi punto casuale");
        btnAggiungiPunto.addActionListener(e -> pannello.aggiungiPuntoCasuale());

        add(pannello, BorderLayout.CENTER);
        add(btnAggiungiPunto, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuadranteCartesiano::new);
    }
}

class PannelloQuadrante extends JPanel {
    private List<Point> punti = new ArrayList<>();
    private Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        disegnaAssi(g);
        disegnaPunti(g);
    }

    private void disegnaAssi(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        int centroX = w / 2;
        int centroY = h / 2;

        // Assi
        g.setColor(Color.BLACK);
        g.drawLine(0, centroY, w, centroY); // Asse X
        g.drawLine(centroX, 0, centroX, h); // Asse Y

        // Tacche sugli assi
        for (int i = -w/2; i <= w/2; i += 50) {
            g.drawLine(centroX + i, centroY - 5, centroX + i, centroY + 5);
            g.drawLine(centroX - 5, centroY + i, centroX + 5, centroY + i);
        }

        // Etichette
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        for (int i = -w/2; i <= w/2; i += 50) {
            if (i != 0) {
                g.drawString(String.valueOf(i / 50), centroX + i - 5, centroY + 15);
                g.drawString(String.valueOf(-i / 50), centroX + 5, centroY - i + 5);
            }
        }
    }

    private void disegnaPunti(Graphics g) {
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;

        g.setColor(Color.RED);
        for (Point p : punti) {
            int x = centroX + p.x;
            int y = centroY - p.y;
            g.fillOval(x - 4, y - 4, 8, 8);
        }
    }

    public void aggiungiPuntoCasuale() {
        int maxX = getWidth() / 2 - 20;
        int maxY = getHeight() / 2 - 20;
        int x = random.nextInt(maxX * 2) - maxX;
        int y = random.nextInt(maxY * 2) - maxY;
        punti.add(new Point(x, y));
        repaint();
    }
}
