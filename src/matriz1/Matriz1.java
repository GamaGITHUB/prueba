
package matriz1;

import java.util.Scanner;


public class Matriz1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa los datos de la primera matriz");
        System.out.println("**************************************");
       
        System.out.println("Ingresa el tamaño de la matriz");
        int tamaño = sc.nextInt();
        
        int matriz[][] = new int[tamaño][tamaño];//creamos la matriz
        
        for (int i = 0; i < matriz.length; i++) {//declaramos el contenido de la matriz mediante los datos que ingresa el usuario
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduzca el elemento ["+i+","+j+"]");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("***************************");
        System.out.println("Tu matriz es: \n");
        
        for (int i = 0; i < matriz.length; i++) {//mostramos la matriz ya creada 
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("***************************");
        System.out.println("La diagonal es: ");
        for (int i = 0; i < matriz.length; i++) {//mandamos a invocar la diagonal y despues la mandamos a imprimir
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j] + " "); 
                }
                
            }
        }
        System.out.println();
        System.out.println("***************************");
        System.out.println("La triangular superior es: ");
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = i+1; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " "); 
            }
        }
        
        System.out.println();
        System.out.println("***************************");
        System.out.println("La triangular inferior es: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j <= i-1; j++) {
                System.out.println(matriz[i][j] + " "); 
                      
            }
    
        }
    }
}        
                

    
    
