package model.Chess;

public class Horse extends Piece{
    protected String Color = "";
    char Symbol = 'H';
    int positionX = 0;
    int positionY = 0;

    public Horse(boolean isAlly, int x, int y) {
    super (isAlly);
    }

    public Horse() {
        super(true);
    }

    //METODOS DE LOGICA DEL MOVIMIENTO DEL CABALLO
    public  int[] upRightMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX + 1;
        newPosition[1] = actualY + 2;

        return newPosition;
    }
    public  int[] upLeftMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX - 1;
        newPosition[1] = actualY + 2;

        return newPosition;
    }

    public  int[] leftUpMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX - 2;
        newPosition[1] = actualY + 1;

        return newPosition;
    }

    public  int[] leftDownMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX -2;
        newPosition[1] = actualY - 1;

        return newPosition;
    }

    public  int[] downRightMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX + 1;
        newPosition[1] = actualY - 2;

        return newPosition;
    }

    public  int[] downLeftMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX - 1;
        newPosition[1] = actualY - 2;

        return newPosition;
    }

    public  int[] rightUpMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX + 2;
        newPosition[1] = actualY + 1;

        return newPosition;
    }

    public  int[] rightDownMove(int actualX, int actualY) {
        int [] newPosition = new int[2];
        actualX = getPositionX();
        actualY = getPositionY();

        newPosition[0] = actualX + 2;
        newPosition[1] = actualY - 1;

        return newPosition;
    }


    @Override
    public char getSymbol() {
        return Symbol;
    }

    public int getPositionX(){
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
}
