package model.Chess;

public class OtherPiece extends Piece{

    char Symbol = '*';


        private boolean isAlly;

        public OtherPiece(boolean isAlly) {
            this.isAlly = isAlly;
        }


    public OtherPiece() {
    }


    public int getX(){
        return this.fil;
    }
    public int getY(){
        return this.col;
    }

}
