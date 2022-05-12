package chess.visualization;

import chess.common.Constants;
import chess.visualization.renderer.ConsoleRenderer;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
        this.setTitle(Constants.TITLE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.add(new ConsoleRenderer());
    }
}