package model;

import java.util.Random;

public class Room {


    public static final int fil =0;
    public static final int col =0;
    private static int[][] matriz;



    public Room(){
        matriz = new int[fil][col];
        for(int i =0; i < matriz.length; i++){
            for(int j=0; j < matriz[0].length; j++){
                matriz[i][j]=0;
            }
        }
    }
    public Room(int [][] matriz){
        this.matriz = matriz;
    }

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



    public int numberStringtoInt(String numberString){
        int numberInt = 0;

        for(int i = 0; i < numberString.length();i++){
            numberInt = numberInt*10 + numberString.charAt(i)-'0';
        }
        return numberInt;
    }
    public String fillBinarires(String binary){
        String binaryFilled="";
        for(int i =0; i < 8-binary.length(); i++){
            binaryFilled += "0";
        }
        binaryFilled += binary;
        return binaryFilled;
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
    public static int exponent(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public int charToInt(char character){
        int numberInt =0;
        numberInt = numberInt*10 + character-'0';
        return numberInt;
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

        
        if(counter == ((matrix.length) * 2 )+2) isMagic = true;
        return isMagic;
    }

    //

    //****
    // EJERCICIOS HECHOS EN CLASE
    public String getMatrizString(int [][] matriz){
        String txt ="";
        for(int i =0; i < matriz.length; i++){
            for(int j =0; j<matriz[0].length; j++){
                txt += matriz[i][j] + " ";
            }
            txt += "\n";
        }
        return txt;
    }


    public static int[][] getMatriz() {
        return matriz;
    }

    public String getPrimaryDiagonal(int [][] matrix){
        String principalDiagonal="";

        for (int i = 0; i < matrix.length; i++) {
            principalDiagonal += matrix[i][i];
            principalDiagonal += " ";
        }
        return principalDiagonal;
    }

    public String getSecondaryDiagonal(int [][] matrix){
        String secondaryDiagonal="";
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonal += matrix[i][matrix.length - i - 1] +" ";
        }
        return secondaryDiagonal;
    }

    public int getSumSuperiorTriangular(int [][] matrix){
        int sumatory=0;
        for(int i=0; i < matrix.length; i++){
            for(int j =0; j<matrix.length; j++){
                if(i>j) sumatory += matrix[i][j];
            }
        }
        return sumatory;
    }

    public int getSumInferiorTriangular(int [][] matrix){
        int sumatory=0;
        for(int i=0; i < matrix.length; i++){
            for(int j =0; j<matrix.length; j++){
                if(i<j) sumatory += matrix[i][j];
            }
        }
        return sumatory;
    }


    //METODOS PROYECTO PICAS Y FIJAS DE TODO EL CURSO

    public int getFijas(int [] vector, String keyNumber){
        int fijas =0;
        for(int i=0; i < vector.length; i++){
            if (vector [i] == Character.getNumericValue(keyNumber.charAt(i))) fijas++;
        }
        return fijas;
    }

    public int getPicas(int [] vector, String keyNumber){
        int picas =0;
        //Cuenta picas y fijas
        for(int i=0; i < vector.length; i++){
            for (int j = 0; j < keyNumber.length(); j++){
                if (vector [i] == Character.getNumericValue(keyNumber.charAt(j))) picas++;

            }
        }
        //Elimina las fijas
        for (int k =0; k<vector.length; k++) {
            if (vector[k] == Character.getNumericValue(keyNumber.charAt(k))) picas--;
        }
        return picas;
    }

    public String generarVectorJugador(){
        String vectorJugador = "";
        Random random = new Random();
        int keyNumber = random.nextInt();
        //Validar las cifras del numero generado
        int test = cifras(keyNumber);

        return String.valueOf(borrarCifras(keyNumber, 4));
    }
    public int cifras(int numero){
        int counter = 0;
        while(numero>=1){
            numero = numero/10;
            counter++;
        }
        return counter;
    }

    public int borrarCifras(int numero, int cifrasResultantes){
        for(int i=0; i<cifras(numero) - cifrasResultantes +4; i++){
            numero /= 10;
        }
        return numero;
    }

    public int[][] getMatrizTranspuesta(int [][] matriz){
        int [][] result = new int[matriz[0].length][matriz.length];
        for(int i=0; i<result.length; i++){
            for (int j =0; j<result[0].length;j++){
                result[i][j] = matriz[j][i];
            }
        }
        return result;
    }

    public int sumatoriaMatriz(int [][] matriz){
        int suma=0;
        for(int i=0; i<matriz.length; i++){
            for (int j =0; j<matriz[0].length; j++){
                suma+= matriz[i][j];
            }
        }
        return suma;
    }

    public int[][] sumaDeMatrices(int [][] matriz1, int [][] matriz2) {
        int[][] result = new int[matriz1.length][matriz1[0].length];

        for (int i=0; i<matriz1.length; i++){
            for (int j=0; j<matriz1[0].length;j++){
                result[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplicacionDeMatrices(int [][] matrizA, int [][] matrizB){
        int [][] resultado = new int[matrizA.length][matrizB[0].length];
        int posX =0;
        int posY =0;

        for (int i=0; i<matrizA.length; i++){
            for (int j=0; j<matrizB[0].length; j++){
                int suma = 0;
                for (int k =0; k<matrizB.length; k++){
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                resultado[posX][posY] = suma;
                posY++;
                if (posY == resultado[0].length){
                    posX++;
                    posY = 0;
                }
            }
        }
        System.out.println("El tamaño del resultado es: "+resultado.length+ " "+resultado[0].length);

        return resultado;
    }

    public int[][] multiplicacionDeMatricesGPT(int[][] matrizA, int[][] matrizB) {
        // validar que las matrices sean multiplicables
        if (matrizA[0].length != matrizB.length) {
            throw new IllegalArgumentException("No se puede multiplicar estas matrices");
        }
        // crear matriz resultado con el numero de filas de la matriz A y el numero de columnas de la matriz B
        int[][] resultado = new int[matrizA.length][matrizB[0].length];
        // multiplicar los elementos de las matrices
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

//ejercicio rotar matriz hacia la izquierda las veces que se den por parametro
    public int[][] rotarMatriz(int[][] matriz, int turns){
        int[][] resultado = matriz;
        while (turns != 0) {
            resultado = reverseMatriz(resultado);
            resultado = getMatrizTranspuesta(resultado);
            turns--;
        }
        return resultado;
    }

    public int[][] reverseMatriz(int[][] matriz){
        int[][] resultado = new int[matriz.length][matriz.length];
        for (int i =0; i<matriz.length;i++){
            for (int j =0; j<matriz.length ; j++){
                resultado[i][j] = matriz[i][matriz.length-j-1];
            }
        }
        return resultado;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }



}
