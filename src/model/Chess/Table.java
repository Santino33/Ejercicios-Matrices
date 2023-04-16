package model.Chess;

public class Table {
    Piece piece;
    public int fil=8;
    public int col=8;


    private Piece [][] table;


    public Table(int fil, int col, Piece[][] table) {
        this.table = table;
    }

    public Table() {
        this.table = new Piece[8][8];
        // Inicializar el tablero con caballos en posiciones aleatorias
        int[] position = piece.getRandomPosition();
        Horse horse = new Horse(position[0], position[1]);
        this.table[horse.getX()][horse.getY()] = horse;
            //Horse horse = new Horse(i, (int) (Math.random() * 8));
            //this.table[horse.getX()][horse.getY()] = horse;
    }



}
