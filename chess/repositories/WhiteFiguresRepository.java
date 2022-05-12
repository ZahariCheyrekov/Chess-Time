package chess.repositories;

import chess.figures.Figure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WhiteFiguresRepository implements Repository {

    private final Map<String, Figure> whiteFigures;

    public WhiteFiguresRepository() {
        this.whiteFigures = new HashMap<>();
    }

    @Override
    public void addFigure(Figure figure) {
        this.whiteFigures.put(figure.getName(), figure);
    }

    @Override
    public void removeFigure(Figure figure) {
        this.whiteFigures.remove(figure.getName());
    }

    @Override
    public Collection<Figure> getFigures() {
        return Collections.unmodifiableCollection(this.whiteFigures.values());
    }
}