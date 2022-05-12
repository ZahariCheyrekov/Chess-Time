package chess.board;

import chess.figures.Figure;

public interface Board {
    int getBoardCols();

    int getBoardRows();

    void addFigure();

    void removeFigure();

    Figure getFigure();

    void moveFigureAtPosition();
}