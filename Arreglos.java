import java.util.Scanner;

public class Arreglos{
  public static void main (String[] args){
    try (Scanner dato = new Scanner(System.in)) {
      System.out.print("Cantidad de valores a ingresar al vector: ");
      int dim = dato.nextInt();
      int[] vec = new int[dim];
      
      System.out.println("Ingrese los valores");
      for (int i = 0; i < vec.length; i++){
        System.out.print((i + 1) + ". ");
        vec[i] = dato.nextInt();
      }
      
      System.out.println("");
      for (int i = 0; i < vec.length; i++){
        System.out.print("[" + vec[i] + "]");
      }
      System.out.println("");

      System.out.print("Cantidad de filas en la matriz: ");
      int filas = dato.nextInt();
      System.out.print("Cantidad de columnas en la matriz: ");
      int columnas = dato.nextInt();
  
      int[][] mat = new int[filas][columnas];

      for (int j = 0; j < filas; j++){
        for (int i = 0; i < columnas; i++){
          System.out.print("Ingrese un valor: ");
          mat[j][i] = dato.nextInt();
        }
      }    

      for (int j = 0; j < filas; j++){
        System.out.println("");
        for (int i = 0; i < columnas; i++){
          System.out.print("[" + mat[j][i] + "]");
        }
      }
    }    
  }
}