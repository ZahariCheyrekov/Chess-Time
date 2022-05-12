package chess.board.coordinates;

public class Coordinate {

    private String value;
    private int x;
    private int y;

    public Coordinate(String value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public String getValue() {
        return value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}