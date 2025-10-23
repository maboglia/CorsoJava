package bersaglio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class QuadranteCartesiano extends JFrame {
    private PannelloQuadrante pannello;
    private JLabel lblInfo;

    public QuadranteCartesiano() {
        setTitle("Gioco delle Freccette - Quadrante Cartesiano");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        pannello = new PannelloQuadrante();

        // --- Pulsanti ---
        JButton btnAggiungiPunto = new JButton("Lancia una freccetta 🎯");
        JButton btnReset = new JButton("Reset 🧹");

        lblInfo = new JLabel("Punteggio: 0", SwingConstants.CENTER);
        lblInfo.setFont(new Font("Arial", Font.BOLD, 14));

        // --- Azioni ---
        btnAggiungiPunto.addActionListener(e -> {
            double distanza = pannello.aggiungiPuntoCasuale();
            double punteggio = pannello.getPunteggioTotale();
            lblInfo.setText(String.format("Ultima distanza: %.2f - Punteggio totale: %.1f", distanza, punteggio));
        });

        btnReset.addActionListener(e -> {
            pannello.reset();
            lblInfo.setText("Punteggio: 0");
        });

        // --- Pannello pulsanti ---
        JPanel pannelloBottoni = new JPanel();
        pannelloBottoni.add(btnAggiungiPunto);
        pannelloBottoni.add(btnReset);

        // --- Layout finestra ---
        add(lblInfo, BorderLayout.NORTH);
        add(pannello, BorderLayout.CENTER);
        add(pannelloBottoni, BorderLayout.SOUTH);
        
        setVisible(true);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuadranteCartesiano::new);
    }
}

class PannelloQuadrante extends JPanel {
    private static class Punto {
        int x, y;
        double distanza;
        Punto(int x, int y, double distanza) {
            this.x = x; this.y = y; this.distanza = distanza;
        }
    }

    private List<Punto> punti = new ArrayList<>();
    private Random random = new Random();
    private double punteggioTotale = 0.0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        disegnaAssi(g);
        disegnaPunti(g);
    }

    private void disegnaAssi(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        int cx = w / 2;
        int cy = h / 2;

        g.setColor(Color.BLACK);
        g.drawLine(0, cy, w, cy); // Asse X
        g.drawLine(cx, 0, cx, h); // Asse Y

        // Cerchi concentrici per effetto "bersaglio"
        g.setColor(Color.RED);
        for (int r = 50; r <= Math.min(cx, cy); r += 50) {
            g.drawOval(cx - r, cy - r, 2 * r, 2 * r);
        }
    }

    private void disegnaPunti(Graphics g) {
        int cx = getWidth() / 2;
        int cy = getHeight() / 2;

        for (Punto p : punti) {
            int x = cx + p.x;
            int y = cy - p.y;

            // Colore in base alla distanza
            if (p.distanza < 50)
                g.setColor(Color.GREEN);
            else if (p.distanza < 100)
                g.setColor(Color.YELLOW);
            else
                g.setColor(Color.RED);

            g.fillOval(x - 5, y - 5, 10, 10);
        }
    }

    /** Aggiunge un punto casuale e restituisce la distanza dall’origine */
    public double aggiungiPuntoCasuale() {
        int maxX = getWidth() / 2 - 20;
        int maxY = getHeight() / 2 - 20;

        int x = random.nextInt(maxX * 2) - maxX;
        int y = random.nextInt(maxY * 2) - maxY;

        double distanza = calcolaDistanza(x, y);
        punti.add(new Punto(x, y, distanza));

        // Assegna punteggio inversamente proporzionale alla distanza
        double punteggio = calcolaPunteggio(distanza);
        punteggioTotale += punteggio;

        repaint();
        return distanza;
    }

    /** Calcola distanza euclidea dall’origine */
    private double calcolaDistanza(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    /** Punteggio decrescente con la distanza */
    private double calcolaPunteggio(double distanza) {
        // Più vicino => più punti. Nessuno sopra 250 pixel.
        if (distanza > 250) return 0;
        return Math.max(0, (250 - distanza) / 10.0);
    }

    /** Resetta tutti i punti e il punteggio */
    public void reset() {
        punti.clear();
        punteggioTotale = 0.0;
        repaint();
    }
    
    public double getPunteggioTotale() {
        return punteggioTotale;
    }
}