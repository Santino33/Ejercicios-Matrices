package controller;


import model.Chess.Piece;
import model.Chess.Table;
import model.Room;
import view.IoManager;

public class Control {
private IoManager io;
Room room = new Room();


//Constructor

public Control(){
io = new IoManager();
}

    int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    int[][] matriz4 = {{1, 4, 6}, {3, 8, 2},{5, 6, 1}};
    int[][] matriz2 = {{10, 8, -4, 0}, {1, 3, 20, 11}, {15, 4, 7, 9}, {18, 2, 1, -4}};
    int[][] matriz3 = {{1, 2}, {3, 4}, {5, 6}, {7, -2}};

    int[][] matriz5 = {{5, 3}, {2, 9}, {2, 4}};
    int[][] matriz6 = {{1, 5, 3}, {5, 3, 3}};
    Table chessTable = new Table();
    int [] combination = {5, 8, 1, 6};
    String keyNumber = "3486";


//metodos
    public void init (){
        //io.showMessage(""+ room.binarySumatory(12, 3));
        //io.printMatrix(matriz);
        //io.showMessage("¿La matriz es magica? "+room.magicalMatrix(matriz));
        //io.showMessage(""+room.getMatrizString(matriz));
        //io.showMessage("La diagonal secundaria es: "+room.getSecondaryDiagonal(matriz2));
        //io.showMessage("Suma triangular superior "+room.getSumSuperiorTriangular(matriz2));
        //io.showMessage("Suma triangular inferior "+room.getSumInferiorTriangular(matriz2));
        //io.printChessTable1(chessTable);
        //io.reversePrintIntTable(matriz2);
        System.out.println("");
        //io.showMessage("picas: "+ room.getPicas(combination, keyNumber));
        //io.showMessage("fijas: "+ room.getFijas(combination, keyNumber));
        //io.showMessage("num aleatorio: "+room.generarVectorJugador());
        //io.showMessage("nuevo numero: "+room.borrarCifras(92500047, 4));
        //io.printMatrix(matriz);
        //io.printMatrix(matriz4);
        System.out.println("");
        //io.printMatrix(room.sumaDeMatrices(matriz, matriz4));
        System.out.println("");
        io.printMatrix(room.multiplicacionDeMatrices(matriz5, matriz6));
        System.out.println("");
        io.printMatrix(room.multiplicacionDeMatricesGPT(matriz5, matriz6));
    }

}