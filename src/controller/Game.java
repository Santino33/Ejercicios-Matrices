package controller;
import view.IoManager;
import model.Chess.Table;

public class Game {
    private IoManager io;

    Table chessTable = new Table();
    public Game() {
        io = new IoManager();
    }

    public void run() {
        io.printChessTable(chessTable);
    }


}
