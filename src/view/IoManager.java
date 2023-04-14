package view;

import java.util.Scanner;

public class IoManager {
//atributos
private Scanner scan = new Scanner(System.in);

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
    /*otra opcion
    public int readInt(String message){
        return Integer.parseint(this.readstring(message));
    }*/
}
