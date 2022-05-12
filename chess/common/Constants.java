package chess.common;

import java.awt.*;
import java.awt.Color;

public class Constants {

    public static final String TITLE = "Chess";

    public static final int CHESS_ROWS = 8;
    public static final int CHESS_COLS = 8;

    public static final int SQUARE_SIZE = 64;

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 600;
    public static final int BOARD_PANEL_OFFSET = 200;

    public static final int BOARD_POINT_X_POSITION = 5;
    public static final int BOARD_POINT_Y = 505;
    public static final int BOARD_COORDINATE_X_START = 50;
    public static final int BOARD_COORDINATE_Y_START = 18;
    public static final int BOARD_COORDINATE_DISTANCE = 64;

    public static final Color DARK_SQUARE = new Color(143, 75, 32);
    public static final Color LIGHT_SQUARE = new Color(230, 177, 123);
    public static final Font CHESS_COORDINATES_FONT = new Font("Arial", Font.PLAIN, 15);
}