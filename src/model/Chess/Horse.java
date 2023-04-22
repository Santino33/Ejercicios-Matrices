package model.Chess;

public class Horse extends Piece{
    protected String Color = "";
    char Symbol = 'H';

    public Horse(boolean isAlly) {
    super (isAlly);
    }

    public Horse() {
        super(true);
    }

    @Override
    public char getSymbol() {
        return Symbol;
    }
}
