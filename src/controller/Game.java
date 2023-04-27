package controller;
import view.IoManager;
import model.Chess.Table;

public class Game {
    private IoManager io;

    Table chessTable = new Table();
    public Game() {
        io = new IoManager();
    }

    public void runChess() {
        io.showMessage("Ambiente grafico que representa los movimientos del caballo representado con 'H' \n " +
                "'O' representaque el caballo puede saltar a la posicion pero hay una ficha enemiga alli, por lo puede comersela \n" +
                "'X' representa las posiciones vacias a las que puede ir el caballo  y 'A' son las fichas aliadas ");
        io.printChessTable(chessTable);

    }




}
