package chess.figures;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FigureInitialization {

    private final BufferedImage chessImages = ImageIO.read(new File("src/chess/figures/imgs/all-chess-figures.png"));
    private final Image[] images = new Image[12];
    private final List<Figure> chessFigures;

    public FigureInitialization() throws IOException {
        this.chessFigures = new ArrayList<>();
        figuresInit();
        createFigures();
    }

    private void figuresInit() {
        int index = 0;
        for (int y = 0; y < 400; y += 200) {
            for (int x = 0; x < 1200; x += 200) {
                this.images[index] = this.chessImages.getSubimage(x, y, 200, 200)
                        .getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                index++;
            }
        }
    }

    public void createFigures() {
        addWhiteFigures();
        addBlackFigures();
    }

    private void addWhiteFigures() {
        chessFigures.add(new Pawn(0, 6, "pawn", true));
        chessFigures.add(new Pawn(1, 6, "pawn", true));
        chessFigures.add(new Pawn(2, 6, "pawn", true));
        chessFigures.add(new Pawn(3, 6, "pawn", true));
        chessFigures.add(new Pawn(4, 6, "pawn", true));
        chessFigures.add(new Pawn(5, 6, "pawn", true));
        chessFigures.add(new Pawn(6, 6, "pawn", true));
        chessFigures.add(new Pawn(7, 6, "pawn", true));

        chessFigures.add(new Rook(0, 7, "rook", true));
        chessFigures.add(new Rook(7, 7, "rook", true));

        chessFigures.add(new Knight(1, 7, "knight", true));
        chessFigures.add(new Knight(6, 7, "knight", true));

        chessFigures.add(new Bishop(2, 7, "bishop", true));
        chessFigures.add(new Bishop(5, 7, "bishop", true));

        chessFigures.add(new Queen(3, 7, "queen", true));
        chessFigures.add(new King(4, 7, "king", true));
    }

    private void addBlackFigures() {
        chessFigures.add(new Pawn(0, 1, "pawn", false));
        chessFigures.add(new Pawn(1, 1, "pawn", false));
        chessFigures.add(new Pawn(2, 1, "pawn", false));
        chessFigures.add(new Pawn(3, 1, "pawn", false));
        chessFigures.add(new Pawn(4, 1, "pawn", false));
        chessFigures.add(new Pawn(5, 1, "pawn", false));
        chessFigures.add(new Pawn(6, 1, "pawn", false));
        chessFigures.add(new Pawn(7, 1, "pawn", false));

        chessFigures.add(new Rook(0, 0, "rook", false));
        chessFigures.add(new Rook(7, 0, "rook", false));

        chessFigures.add(new Knight(1, 0, "knight", false));
        chessFigures.add(new Knight(6, 0, "knight", false));

        chessFigures.add(new Bishop(2, 0, "bishop", false));
        chessFigures.add(new Bishop(5, 0, "bishop", false));

        chessFigures.add(new Queen(3, 0, "queen", false));
        chessFigures.add(new King(4, 0, "king", false));
    }

    public Image[] getImages() {
        return this.images;
    }

    public List<Figure> getChessFigures() {
        return this.chessFigures;
    }
}