package model.Chess;

public class Empty extends Piece{
    protected int fil;
    protected int col;

    char Symbol = '.';

    public Empty() {
    }

    public char getSymbol(){
        return Symbol;
    }
}
