package model.Chess;

import java.util.Random;

public abstract class Piece {
    private boolean isAlly;

    public Piece(boolean isAlly) {
        this.isAlly = isAlly;
    }

    public boolean isAlly() {
        return isAlly;
    }

    public abstract char getSymbol();
}
