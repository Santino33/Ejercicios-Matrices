package model.Chess;

public class Empty extends Piece {
    public Empty() {
        super(false);
    }

    @Override
    public char getSymbol() {
        return '-';
    }
}
