package view;

import model.Chess.*;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class IoManager {
//atributos
private Scanner scan = new Scanner(System.in);
    Horse horse = new Horse();
    private OtherPiece OtherPiece;
    private Empty Empty;


    //metodos
    public void showMessage (String message){
        System.out.println(message);
    }

    public void printMatrix(int[][] matrix){
        for(int i =0; i< matrix.length; i++){
            for(int j = 0; j <matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void printCharMatrix(char[][] matrix){
        for(int i =0; i< matrix.length; i++){
            for(int j = 0; j <matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
/*
    public void printChessTable(Table table){
        int[] horsePosition;
        horsePosition = table.getHorsePosition(table);

        System.out.print("  ");
        for(int i =0; i<8; i++){
            System.out.print((char) ('a' +i) + " ");
        }
        System.out.println();
        for (int i =0; i<8; i++){
            System.out.print((8 - i) +" ");
            for(int j = 0; j <8; j++){
                Piece piece = table.getPiece(i, j);
                //Evalua si la posicion actual es una opcion para el salto del caballo y si es valida
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.leftUpMove(horsePosition[0], horsePosition[1]))) {
                    printHorseMoves(table, i, j);
                    System.out.print("%");
                }
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.leftDownMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.rightDownMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.rightUpMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.downLeftMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.downRightMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.upRightMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);
                if(table.isValidMove(horsePosition[0], horsePosition[1], horse.upLeftMove(horsePosition[0], horsePosition[1]))) printHorseMoves(table, i, j);


                System.out.print(piece.getSymbol() + " ");
            }
            System.out.println(8 - i);
        }
        System.out.print("  ");
        for(int i = 0; i<8; i++){
            System.out.print((char) ('a' + i) + " ");
        }
        System.out.println();
    }
 */

    //METODOS IMPRESION DE TABLERO AJEDREZ
    public void printChessTable(Table table){
        int[] horsePosition = table.getHorsePosition(table);
        System.out.print("  ");
        for(int i =0; i<8; i++){
            System.out.print((char) ('a' +i) + " ");
        }
        System.out.println();
        for (int i =0; i<8; i++){
            System.out.print((8 - i) +" ");
            for(int j = 0; j <8; j++){
                Piece piece = table.getPiece(i, j);
                if (table.isValidMove(horsePosition[0], horsePosition[1], i, j)) {
                    printHorseMoves(table, i, j);
                } else {
                    System.out.print(piece.getSymbol() + " ");
                }
            }
            System.out.println(8 - i);
        }
        System.out.print("  ");
        for(int i = 0; i<8; i++){
            System.out.print((char) ('a' + i) + " ");
        }
        System.out.println();
    }

    public void printHorseMoves(Table table, int row, int col) {
        Piece piece = table.getPiece(row, col);
        if (piece instanceof Empty) {
            System.out.print("X ");
        } else if (piece.isAlly()) {
            System.out.print(piece.getSymbol() + " ");
        } else {
            System.out.print("O ");
        }
    }

    
    //METODOS GRAFICOS Y DE LECTURA
    public void showGraphicMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    public String readGraphicInt(String message){
        this.showMessage(message);
        return JOptionPane.showInputDialog(message);

    }
    public String readString(String message){
        this.showMessage(message);
        return scan.nextLine();
    }

    public int readInt(String message){
       this.showMessage(message);
       return scan.nextInt();

    } 

    public double readDouble (String message){
    this.showMessage(message);
    return scan.nextDouble();
    }

    public byte readByte (String message){
        this.showMessage(message);
        return scan.nextByte();
  }

  public float readFloat (String message){
    this.showMessage(message);
    return scan.nextFloat();
  }
    public void reversePrintIntTable(int [][] table){
        for(int i=table.length-1; i>0; i--){
            for(int j=0; j<table[0].length; j++){
                System.out.print(table[i][j]);
                System.out.print(" ");
            }
            showMessage("");
        }
    }

    public char getSymbol(Piece[][] pieces, int Row, int Col){
        char Symbol = ' ';
        if(pieces[Row][Col] instanceof Horse) Symbol = 'H';
        if(pieces[Row][Col] instanceof OtherPiece) Symbol = '*';
        if(pieces[Row][Col] instanceof Empty) Symbol = '.';
        return Symbol;
    }


    /*otra opcion
    public int readInt(String message){
        return Integer.parseint(this.readstring(message));
    }*/
}
