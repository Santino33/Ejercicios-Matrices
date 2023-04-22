package model.Chess;

import java.util.Random;

public class Piece {
    protected int fil;

    public Piece() {
    }

    protected int col;
    char emptySymbol = '.';
    char horseSymbol = 'H';
    char otherPieceSymbol = '*';

    public Piece(int fil, int col) {
        this.fil = fil;
        this.col = col;
    }

    public void movePiece(int newFil, int newCol) {
        // Cambiar la posición de la pieza a la nueva posición
        this.fil = newFil;
        this.col = newCol;
    }

    public int[] getRandomPosition() {
        Random random = new Random();
        int[] position = new int[2];
        position[0] = random.nextInt(8)+1;
        position[1] = random.nextInt(8)+1;
        return position;
    }



    public int getX(){
        return this.fil;
    }
    public int getY(){
        return this.col;
    }
}
