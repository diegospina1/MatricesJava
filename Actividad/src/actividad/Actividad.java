package actividad;
import java.util.Scanner;

public class Actividad {

    public static void main(String[] args) {
        
        /*III*/
        Scanner leer = new Scanner(System.in);
        int posicion = 0;
        int a = 0;
        int b = 1;
        int c;
        /*I*/
        int matrizQ1[][] = new int[7][7];
        /*IV*/    
        int matrizX[][] = new int[3][3];
        /*V*/
        int matrizSq[][] = new int[4][4];
        
        
        
        /* III */
        
        System.out.println("Punto III: ");
        System.out.print("Cuantos datos desea ver? (MÁXIMO 5): ");
        posicion = leer.nextInt();
        
        int fibonacci[] = new int[posicion];
        
        for(int i = 0; i < (posicion-2); i++){
            
            c = a + b;
            
            fibonacci[i] = c;
            
            a = b;
            b = c;
        }
        System.out.println("\nSucesión fibonacci: ");
        System.out.print("| " + "0" + " | " + "1 ");  
        for(int i = 0;i < (posicion-2); i++){
            System.out.print("| " + fibonacci[i] + " | ");
        }
        
        /*IV*/
        
        System.out.println("\n\nPunto IV: ");
        System.out.println("\nX: ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                if(i == j){
                    matrizX[i][j] = 1;
                }
                else{
                    matrizX[i][j] = 0;
                }
                
            }
        }
        matrizX[0][2] = 1;
        matrizX[2][0] = 1;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                System.out.print("| " + matrizX[i][j] + " | ");
            }
            System.out.println("");
        }
        
        /*V*/
        
        System.out.println("\n\nPunto V: ");
        System.out.println("\nCuadrado: ");
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                if ((i == 0)||(j == 0) ||(j == 3)||(i == 3)){
                    matrizSq[i][j] = 1;
                }
                else{
                    matrizSq[i][j] = 0;
                }     
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                System.out.print("| " + matrizSq[i][j] + " | ");
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
