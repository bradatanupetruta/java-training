package pieces;

import common.Location;

public class Bishop extends Piece {
    public Bishop(Location location, PieceColor pieceColor) {
        super(location, pieceColor);
        this.name = "Bishop";
    }

    @Override
    public boolean isValidMove(int xc, int yc, int x, int y) {
        boolean isOk = xc >= 0 && xc <= 7 && yc >= 0 && yc <= 7 && x >= 0 && x <= 7 && y >= 0 && y <= 7;
        if (isOk) {
            return (x + y == xc + yc) || (Math.abs(x - y) == (Math.abs(xc - yc)));
        }
        return false;
    }
}
