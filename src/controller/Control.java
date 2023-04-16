package controller;


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
    int[][] matriz2 = {{10, 8, -4, 0}, {1, 3, 20, 11}, {15, 4, 7, 9}, {18, 2, 1, -4}};

//metodos
    public void init (){
        io.showMessage(""+ room.binarySumatory(12, 3));
        io.printMatrix(matriz);
        io.showMessage("¿La matriz es magica? "+room.magicalMatrix(matriz));
        //io.showMessage(""+room.getMatrizString(matriz));
        //io.showMessage("La diagonal secundaria es: "+room.getSecondaryDiagonal(matriz2));
        //io.showMessage("Suma triangular superior "+room.getSumSuperiorTriangular(matriz2));
        //io.showMessage("Suma triangular inferior "+room.getSumInferiorTriangular(matriz2));
        


    }

}