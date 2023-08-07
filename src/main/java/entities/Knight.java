package entities;

public class Knight extends Piece {
    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
