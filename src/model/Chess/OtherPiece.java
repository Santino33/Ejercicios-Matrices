package model.Chess;

public class OtherPiece extends Piece{

    char Symbol = '*';
    private boolean isAlly;

    public OtherPiece(boolean isAlly) {
        super(isAlly);
    }

    @Override
    public char getSymbol() {
        return isAlly() ? 'A' : 'E';
    }

}
