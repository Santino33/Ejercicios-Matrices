package view;

import model.Chess.*;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class IoManager {
//atributos
private Scanner scan = new Scanner(System.in);
    private Horse Horse;
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

    public void printChessTable(Piece[][] table){
        System.out.println(" ");
        for(int i =0; i<8; i++){
            System.out.println((char) ('a' +1) + "");
        }
        System.out.println(" ");
        for (int i =0; i<8; i++){
            System.out.println((8 - i) +"");
            for(int j = 0; j <8; j++){
                System.out.println(getSymbol(table, i, j));
            }
            System.out.println(8 - i);
        }
        System.out.println(" ");
        for(int i = 0; i<8; i++){
            System.out.println((char) ('a' + i) + " ");
        }
        System.out.println();
    }

    /*
    public void printChessTable1(Table table){
        char [][] tableChar = new char[8][8];
        for(int i =0; i < 8; i++){
            for (int j=0; j< 8; j++){
                if(table.getPieceAtPosition(i,j) == Horse) tableChar[i][j] = 'H';
                if(table.getPieceAtPosition(i,j) == OtherPiece) tableChar[i][j] = '*';
                if(table.getPieceAtPosition(i,j) == Empty) tableChar[i][j] = '.';
            }
        }
        printCharMatrix(tableChar);
    }

     */


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
