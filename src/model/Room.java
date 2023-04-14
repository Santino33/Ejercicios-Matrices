package model;

public class Room {

    public String binarySumatory(int firstNumber, int secondNumber){

        int sumatory = firstNumber + secondNumber;

        String binario= "";
        int resto = 0;
        while(sumatory > 0){
            resto = sumatory%2;
            //System.out.println(resto);
            binario = resto + binario  ;
            sumatory /= 2;
        }
        return binario;


    }

    private int cifras(int numero){
        int counter = 0;
        while(numero>=1){
            numero = numero/10;
            counter++;
        }
        return counter;
    }
    public String decimalToBinary(int decNumber){
        String binario= "";
        int resto = 0;
        while(decNumber > 0){
            resto = decNumber%2;
            //System.out.println(resto);
            binario = resto + binario  ;
            decNumber /= 2;
        }
        return binario;
    }

    //EJERCICIO MATRIZ MAGICA
    public boolean magicalMatrix(int[][] matrix){
        boolean isMagic = false;
        int sumatory = 0;
        int reference =0;
        int counter = 0;
        int principalDiagonal = 0;
        int secondaryDiagonal = 0;

        //Evaluar columnas
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumatory += matrix[j][i];
            }
            if(i == 0) reference = sumatory;
            //Si la sumatoria si es igual a la referencia se aumenta counter
            if(sumatory == reference) counter++;
            sumatory =0;
        }
        //Evaluar filas
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumatory += matrix[j][i];
            }
            //Si la sumatoria si es igual a la referencia se aumenta counter
            if(sumatory == reference) counter++;
            sumatory =0;
        }
        //Evaluar diagonales
        for (int i = 0; i < matrix.length; i++) {
            principalDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][matrix.length - i - 1];
        }
        if(principalDiagonal == reference) counter++;
        if (secondaryDiagonal == reference) counter++;

        System.out.println(counter);
        System.out.println(((matrix.length) * 2 )+2);
        if(counter == ((matrix.length) * 2 )+2) isMagic = true;
        return isMagic;
    }

    public int matrixSize(int[][] matrix){
        return matrix.length;
    }



}
