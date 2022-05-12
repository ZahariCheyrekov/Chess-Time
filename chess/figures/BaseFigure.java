package chess.figures;

public class BaseFigure implements Figure {

    private int xPoint;
    private int yPoint;
    private String name;
    private boolean isWhite;

    protected BaseFigure(int xPoint, int yPoint, String name, boolean isWhite) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.name = name;
        this.isWhite = isWhite;
    }

    @Override
    public int getPointX() {
        return this.xPoint;
    }

    @Override
    public int getPointY() {
        return this.yPoint;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isWhite() {
        return this.isWhite;
    }
}