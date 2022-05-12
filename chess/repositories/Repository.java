package chess.repositories;

import chess.figures.Figure;

import java.util.Collection;

public interface Repository {

    void addFigure(Figure figure);

    void removeFigure(Figure figure);

    Collection<Figure> getFigures();
}