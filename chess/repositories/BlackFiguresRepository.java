package chess.repositories;

import chess.figures.Figure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackFiguresRepository implements Repository {

    private final Map<String, Figure> blackFigures;

    public BlackFiguresRepository() {
        this.blackFigures = new HashMap<>();
    }

    @Override
    public void addFigure(Figure figure) {
        this.blackFigures.put(figure.getName(), figure);
    }

    @Override
    public void removeFigure(Figure figure) {
        this.blackFigures.remove(figure.getName());
    }

    @Override
    public Collection<Figure> getFigures() {
        return Collections.unmodifiableCollection(this.blackFigures.values());
    }
}