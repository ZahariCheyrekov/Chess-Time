package chess.visualization.renderer;

import chess.board.coordinates.Coordinate;
import chess.board.coordinates.BoardCoordinates;
import chess.common.Constants;
import chess.figures.Figure;
import chess.figures.FigureInitialization;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import static chess.common.Constants.*;

public class ConsoleRenderer extends JPanel {

    public ConsoleRenderer() {
        this.setSize(Constants.GAME_WIDTH - Constants.BOARD_PANEL_OFFSET, Constants.GAME_HEIGHT);
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        renderBoard(g);
        try {
            renderPieces(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
        renderCoordinates(g);
    }

    private void renderPieces(Graphics g) throws IOException {
        FigureInitialization figureInitialization = new FigureInitialization();
        List<Figure> chessFigures = figureInitialization.getChessFigures();
        Image[] images = figureInitialization.getImages();

        for (Figure figure : chessFigures) {
            String figureName = figure.getName();
            int index = -1;

            switch (figureName) {
                case "king" -> index = 0;
                case "queen" -> index = 1;
                case "bishop" -> index = 2;
                case "knight" -> index = 3;
                case "rook" -> index = 4;
                case "pawn" -> index = 5;
            }

            if (!figure.isWhite()) {
                index += 6;
            }

            g.drawImage(images[index], figure.getPointX() * SQUARE_SIZE, figure.getPointY() * SQUARE_SIZE, this);
        }
    }

    private void renderBoard(Graphics g) {
        boolean isDark = true;

        for (int row = 0; row < CHESS_ROWS; row++) {
            for (int col = 0; col < CHESS_COLS; col++) {

                if (isDark) {
                    g.setColor(LIGHT_SQUARE);
                } else {
                    g.setColor(DARK_SQUARE);
                }
                g.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);

                isDark = !isDark;
            }
            isDark = !isDark;
        }
    }

    private void renderCoordinates(Graphics g) {
        BoardCoordinates boardCoordinates = new BoardCoordinates();
        Collection<Coordinate> chessCoordinates = boardCoordinates.getBoardCoordinates();

        boolean isDark = true;
        g.setFont(CHESS_COORDINATES_FONT);

        for (Coordinate current : chessCoordinates) {
            if (isDark) {
                g.setColor(LIGHT_SQUARE);
            } else {
                g.setColor(DARK_SQUARE);
            }
            g.drawString(current.getValue(), current.getX(), current.getY());
            isDark = !isDark;

            if (current.getValue().equals("h")) {
                isDark = !isDark;
            }
        }
    }
}