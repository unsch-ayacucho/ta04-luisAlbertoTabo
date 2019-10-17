
package Matrices;
import java.util.Scanner;
public class Ejercicio01 {

    /**
     * Realiza un programa que rellene un array de 6 filas 
     * por 10 columnas con números enteros positivos comprendidos entre 0
     * y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
     * tanto del máximo como del mínimo.
     */
    public static void main(String[] args) {
        // VARIBLES
    int nmax,nmin,i,j,p1,p2;
    String r="";
    //arreglos 
    int n[][] = new int[4][3];
    // entrada
    Scanner te= new Scanner(System.in);
        System.out.println("numero (0,0):");
        n[0][0]=te.nextInt();
        System.out.println("numero (0,1):");
        n[0][1]=te.nextInt();
        System.out.println("numero (0,2):");
        n[0][2]=te.nextInt();
        System.out.println("numero (1,0):");
        n[1][0]=te.nextInt();
        System.out.println("numero (1,1):");
        n[1][1]=te.nextInt();
        System.out.println("numero (1,2):");
        n[1][2]=te.nextInt();
        System.out.println("numero (2,0):");
        n[2][0]=te.nextInt();
        System.out.println("numero (2,1):");
        n[2][1]=te.nextInt();
        System.out.println("numero (2,2):");
        n[2][2]=te.nextInt();
        System.out.println("numero (3,0):");
        n[3][0]=te.nextInt();
        System.out.println("numero (3,1):");
        n[3][1]=te.nextInt();
        System.out.println("numero (3,2):");
        n[3][2]=te.nextInt();
        
        //proceso
      
           nmax=n[0][0];
           
           for(i=0; i<=3; i++){
               for(j=0;j<=2;j++){
                   if(n[i][j]>nmax ){
                       nmax=n[i][j];
                   }
               } 
           }
             nmin=n[0][0];          
            for(i=0; i<=3; i++){
               for(j=0;j<=2;j++){
                   if(n[i][j]<nmin ){
                       
                       nmin=n[i][j];          
                   }
                   
               }
               
            }
           //salida
           System.out.println("");
           System.out.println("MAYOR: "+nmax);
           System.out.println("MINIMO: "+nmin);
           
    
    
                   }
               }