package runner;

import controller.Control;
import controller.Game;
import model.Simulation.Pool;

import javax.swing.*;

public class Run {

    public static void main (String [] args){
        Control control = new Control();
        Game game = new Game();
        Pool pool = new Pool();
        //pool.playGame();
        //game.runChess();

        control.init();

       /* */

    }
}
