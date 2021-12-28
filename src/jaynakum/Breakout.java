package jaynakum;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Breakout extends JFrame {

	private static final long serialVersionUID = 1L;

	public Breakout() {
        initUI();
    }

    private void initUI() {

        add(new Board());
        pack();
        
        setTitle("Breakout");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Breakout();
            game.setVisible(true);
        });
    }
}