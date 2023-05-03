package model.Simulation;

import java.util.ArrayList;
import java.util.Random;

public class Pool {

    private int[][] pool;
    private int [] ballPosition = new int[2];


    public Pool(){
        this.pool = new int[5][5];
        Random rand = new Random();

        for(int i = 0; i < pool.length; i++){
            for(int j = 0; j < pool[i].length; j++){
                int bound = 6;
                pool[i][j] = rand.nextInt(bound);
            }
        }
    }

    public void playGame(){
        String moves = "";
        System.out.println("... play, "+getHeight(ballPosition[0], ballPosition[1]));


        while(getHeight(ballPosition[0], ballPosition[1]) != 0){
            dropBall();
            System.out.println("La posicion de la pelota es "+ballPosition[0]+" "+ballPosition[1]);
            System.out.println("La pelota esta en la altura " +getHeight(ballPosition[0], ballPosition[1]));
            printPool(pool);
            uploadBallPosition();
            moves += saveMoves(moves);
            System.out.println(moves);
        }
    }

    public String saveMoves(String moves){
        moves += ballPosition[0];
        moves += ballPosition[1];
        return moves;
    }
    public void uploadBallPosition(){
        ballPosition = getNewPosition();
    }

    public void dropBall(){
        Random rand = new Random();
        int x = rand.nextInt(5);
        int y = rand.nextInt(5);
        ballPosition[0] = x;
        ballPosition[1] = y;
    }

    private void printPool(int[][] pool){
        for(int i =0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(pool[i][j] + " ");
            }
            System.out.println("");
        }
    }



    private boolean isOnBottom(){
        boolean isOnbottom = false;
        if (getHeight(ballPosition[0],ballPosition[1]) == 0) isOnbottom = true;

        return isOnbottom;
    }


    private int[] getNewPosition() {
        ArrayList<Integer> closeHeights = new ArrayList<Integer>();
        ArrayList<int[]> posiblePositions = new ArrayList<int[]>();

        int nextHeight = 0;
        int[] newPosition = new int[2];
        boolean isOnBottom = false;

        closeHeights = getCloseHeights();
        nextHeight = getNextHeight(closeHeights);
        System.out.println("Las alturas cercanas son: "+closeHeights);
        System.out.println("La siguiente altura es: "+nextHeight);
        if (nextHeight == -1){
            isOnBottom = true;
            newPosition = ballPosition;
        }

        //Tomar las posiciones de los posibles alturas de la piscina si la bola aun no esta en el fondo
        if (isOnBottom){
            for (int i = ballPosition[0]-1; i <= ballPosition[0] + 1; i++){
                for (int j = ballPosition[1] - 1; j <= ballPosition[1] + 1; j++){
                    if (validatePosition(i, j)){
                        if(getHeight(i, j) == nextHeight){
                            int[] position = {i, j};
                            posiblePositions.add(position);
                        }
                    }

                }
            }
        }
        newPosition = chooseRandomPositions(posiblePositions);
        //Elegir aleatoriamente cual posicion escoger
        return newPosition;
    }

    public int[] chooseRandomPositions(ArrayList<int[]> positions){
        Random rand = new Random();
        int next = rand.nextInt(positions.size());
        return positions.get(next);
    }

    public ArrayList getCloseHeights() {
        ArrayList<Integer> closeHeights = new ArrayList<Integer>();
        for (int i = ballPosition[0]-1; i <= ballPosition[0] + 1; i++){
            for (int j = ballPosition[1] - 1; j <= ballPosition[1] + 1; j++){
                closeHeights.add(getHeight(i, j));
            }
        }
        return closeHeights;
    }

    public int getTimesHeightRepited(ArrayList<Integer> closeHeights, int height){
        int timesRepited = 0;
        for (int i = 0; i < closeHeights.size(); i++){
            if(height == closeHeights.get(i)) timesRepited++;
        }
        return timesRepited;
    }
    public int getNextHeight(ArrayList<Integer> closeHeights){
        int nextHeight = -1;
        for(int i = 0; i < closeHeights.size(); i++){
            if((closeHeights.get(i) < getHeight(ballPosition[0],ballPosition[1])) && closeHeights.get(i) > nextHeight){
                nextHeight = closeHeights.get(i);
            }
        }
        return nextHeight;
    }

    private int getHeight(int x, int y){
        int cell = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if(i == x && j == y){
                    cell = pool[i][j];
                }
            }
        }
        return cell;
    }


    private boolean validatePosition(int x, int y){
        boolean isValid = false;
        if((x < 0 || x > 4 || y < 0 || y > 4) && (x!=ballPosition[0] && y!=ballPosition[1])){
            isValid = false;
        }else{
            isValid = true;
        }
        return isValid;
    }

    //Metodo que diga si una posicion en la piscina es valida
    /*
    public boolean isValidPosition(int[] position){

    }

    //Metodo que evalue desde la posicion mas alta, la siguiente mas baja
    public int[] getNextPosition(Pool pool){

    }

     */
}
