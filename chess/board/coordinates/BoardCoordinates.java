package chess.board.coordinates;


import java.util.*;

import static chess.common.Constants.*;

public class BoardCoordinates {

    private final ArrayDeque<Coordinate> coordinates;

    public BoardCoordinates() {
        this.coordinates = new ArrayDeque<>();
        this.fillCoordinates();
    }

    private void fillCoordinates() {
        int positionX = BOARD_COORDINATE_X_START;
        int letter = 97;

        for (int letterCoordinate = 0; letterCoordinate < 8; letterCoordinate++) {
            this.coordinates.offer(new Coordinate(String.valueOf((char) (letter)), positionX, BOARD_POINT_Y));

            positionX += BOARD_COORDINATE_DISTANCE;
            letter++;
        }

        int positionY = BOARD_COORDINATE_Y_START;
        for (int numberCoordinate = 8; numberCoordinate >= 1; numberCoordinate--) {
            this.coordinates.offer(new Coordinate(String.valueOf(numberCoordinate), BOARD_POINT_X_POSITION, positionY));

            positionY += BOARD_COORDINATE_DISTANCE;
        }
    }

    public Collection<Coordinate> getBoardCoordinates() {
        return Collections.unmodifiableCollection(this.coordinates);
    }
}