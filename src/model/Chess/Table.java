package model.Chess;

public class Table {

    int Col = 0;
    int Row = 0;

    private Piece[][] pieces;

    public Table(){
        this.pieces = new Piece[8][8];
        //Llenar la matriz con espacios en blanco
        for(int i =0; i<8; i++){
            for(int j =0; j<8; j++){
                this.pieces[i][j] = new Empty();
            }
        }
        //Posicionar Caballo aleatoriamente
        int horseRow = (int) (Math.random() *8);
        int horseCol = (int) (Math.random() *8);
        this.pieces[horseRow][horseCol] = new Horse();

        //Posicionar fichas aliadas y enemigas aleatoriamente
        for(int i =0; i <4; i++){
            int allyRow, allyCol, enemyRow, enemyCol;
            do {
                allyRow = (int) (Math.random() *8);
                allyCol = (int) (Math.random() *8);
            } while(!(this.pieces[allyRow][allyCol] instanceof  Empty));
            do {
                enemyRow = (int) (Math.random() *8);
                enemyCol = (int) (Math.random() *8);
            } while (!(this.pieces[enemyRow][enemyCol] instanceof Empty));
            this.pieces[enemyRow][enemyCol] = new OtherPiece();
        }
    }


    /*
    Piece piece = new Piece();
    public int fil=8;
    public int col=8;


    private Piece [][] table;


    public Table(int fil, int col, Piece[][] table) {
        this.table = table;
    }

    public Table() {
        this.table = new Piece[8][8];
        // Inicializar el tablero con caballos en posiciones aleatorias
        int[] horsePosition = piece.getRandomPosition();
        Horse horse = new Horse(horsePosition[0], horsePosition[1]);
        //this.table[horse.getX()][horse.getY()] = horse;

        //Ubicar 4 de las otras piezas en posiciones aleatorias
        for(int i =0; i < 4; i++){
            int [] otherPiecePosition  = piece.getRandomPosition();
            OtherPiece otherPiece = new OtherPiece(otherPiecePosition[0], otherPiecePosition[1]);
            this.table[otherPiece.getX()][otherPiece.getY()] = otherPiece;
        }

        //Rellena las posiciones sobrantes con posiciones libres
        for(int i =0; i < 8; i++){
            for(int j =0; j < 8; j++){
                if(this.table[i][j] == null) this.table[i][j] = new Empty(i, j);
            }
        }

        //Rellena las posiciones sobrantes con posiciones libres

    }

    public Piece getPieceAtPosition(int x, int y) {
        return table[x][y];
    }

     */


}
