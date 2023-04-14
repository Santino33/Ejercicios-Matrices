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

//metodos
    public void init (){
        io.showMessage(""+ room.binarySumatory(12, 3));
        io.printMatrix(matriz);
        io.showMessage("¿La matriz es magica? "+room.magicalMatrix(matriz));
    }

}