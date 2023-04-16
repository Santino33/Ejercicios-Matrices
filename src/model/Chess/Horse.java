package model.Chess;

public class Horse extends Piece{
    protected String Color = "";
    char horseSymbol = 'H';

    public Horse(int fil, int col) {
        super(fil, col);
    }



    public int getX(){
        return this.fil;
    }
    public int getY(){
        return this.col;
    }

}
