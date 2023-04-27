package model.Simulation;

import java.util.Random;

public class Pool {

    private int[][] pool;
    private int[] ballPosition = new int[2];

    public Pool() {
        this.pool = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < pool.length; i++) {
            for (int j = 0; j < pool[i].length; j++) {
                int bound = 6;
                pool[i][j] = rand.nextInt(bound);
            }
        }
    }

    public void dropBall() {
        Random rand = new Random();
        int x = rand.nextInt(5);
        int y = rand.nextInt(5);
        ballPosition[0] = x;
        ballPosition[1] = y;
    }

    public void printPool(int[][] pool) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pool[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] piscina = new int[5][5];
        Random rand = new Random();
        // Llenar la matriz con valores aleatorios entre 0 y 5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                piscina[i][j] = rand.nextInt(6);
            }
        }
        // Imprimir la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(piscina[i][j] + " ");
            }
            System.out.println();
        }
        int x = rand.nextInt(5); // Coordenada x de inicio
        int y = rand.nextInt(5); // Coordenada y de inicio
        System.err.println(x + "," + y);
        System.out.println("Coordenadas de la ruta de la esfera:");
        // Simular la ruta de la esfera
        while (piscina[y][x] > 0) {
            int lowestHeight = 6;
            int newY = y;
            int newX = x;
            // Buscar la baldosa adyacente con la altura más baja
            if (x > 0 && piscina[y][x - 1] < lowestHeight && piscina[y][x - 1] < piscina[y][x]) {
                lowestHeight = piscina[y][x - 1];
                newX = x - 1;
            }
            if (x < 4 && piscina[y][x + 1] < lowestHeight && piscina[y][x + 1] < piscina[y][x]) {
                lowestHeight = piscina[y][x + 1];
                newX = x + 1;
            }
            if (y > 0 && piscina[y - 1][x] < lowestHeight && piscina[y - 1][x] < piscina[y][x]) {
                lowestHeight = piscina[y - 1][x];
                newY = y - 1;
            }
            if (y < 4 && piscina[y + 1][x] < lowestHeight && piscina[y + 1][x] < piscina[y][x]) {
                lowestHeight = piscina[y + 1][x];
                newY = y + 1;
            }
            // Si la baldosa adyacente tiene la misma altura que la actual, elegir
            // aleatoriamente una dirección hacia la que moverse
            if (newY == y && newX == x) {
                int[] directions = new int[4];
                int numDirections = 0;
                if (x > 0 && piscina[y][x - 1] == piscina[y][x]) {
                    directions[numDirections] = 0;
                    numDirections++;
                }
                if (x < 4 && piscina[y][x + 1] == piscina[y][x]) {
                    directions[numDirections] = 1;
                    numDirections++;
                }
                if (y > 0 && piscina[y - 1][x] == piscina[y][x]) {
                    directions[numDirections] = 2;
                    numDirections++;
                }
                if (y < 4 && piscina[y + 1][x] == piscina[y][x]) {
                    directions[numDirections] = 3;
                    numDirections++;
                }
                int direction = directions[rand.nextInt(numDirections)];
                switch (direction) {
                    case 0:
                        newX = x - 1;
                        break;
                    case 1:
                        newX = x + 1;
                        break;
                    case 2:
                        newY = y - 1;
                        break;
                    case 3:
                        newY = y + 1;
                        break;
                }
            }
            // Mover la esfera a la baldosa adyacente con la altura más baja y mostrar las
            // coordenadas
            x = newX;
            y = newY;
            System.out.println("(" + x + "," + y + ")");
        }
        System.out.println("La esfera ha llegado al fondo de la piscina.");
    }
}
