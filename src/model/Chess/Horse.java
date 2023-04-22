package model.Chess;

public class Horse extends Piece{
    protected String Color = "";
    char Symbol = 'H';

    public Horse(int fil, int col) {
        super(fil, col);
    }

    public Horse(){
    }


    public int getX(){
        return this.fil;
    }
    public int getY(){
        return this.col;
    }


}
