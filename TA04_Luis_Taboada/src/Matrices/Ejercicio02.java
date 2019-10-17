
package Matrices;
/**
 *
 * TABOADA PAUCAR LUIS.
 */
import java.util.Scanner;
public class Ejercicio02 {

    
    public static void main(String[] args) {
        // VARIBLES
     int s0=0, s1=0, s2=0,i,j;
     //Areglos
     int n[][]=new int[4][3];
     
     //Entrada
     Scanner te=new Scanner(System.in);
        System.out.println("Numero (0,0): ");
        n[0][0]=te.nextInt();
        System.out.println("Numero (0,1): ");
        n[0][1]=te.nextInt();
        System.out.println("Numero (0,2): ");
        n[0][2]=te.nextInt();
        System.out.println("Numero (1,0): ");
        n[1][0]=te.nextInt();
        System.out.println("Numero (1,1): ");
        n[1][1]=te.nextInt();
        System.out.println("Numero (1,2): ");
        n[1][2]=te.nextInt();
        System.out.println("Numero (2,0): ");
        n[2][0]=te.nextInt();
        System.out.println("Numero (2,1): ");
        n[2][1]=te.nextInt();
        System.out.println("Numero (2,2): ");
        n[2][2]=te.nextInt();
        System.out.println("Numero (3,0): ");
        n[3][0]=te.nextInt();
        System.out.println("Numero (3,1): ");
        n[3][1]=te.nextInt();
        System.out.println("Numero (3,2): ");
        n[3][2]=te.nextInt();
        //proceso
        for (i=0;i<=3; i++){
            s0+=n[i][0];
            s1+=n[i][1];
        }
        //salida
        System.out.println("");
        System.out.println("Suma col. o: "+s0);
        System.out.println("Suma Col. 1: "+s1);
        System.out.println("Suma Col. 2: "+s2);
}
}