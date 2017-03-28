/*
Maximiliano Turrubiates González
Ana Silvia Aldape Felizardo
Juan Pablo Castillo Luna
Roxana Reyes Cordova
*/
package spp2.equipox.proyectoparcial2.p5;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2EquipoXProyectoParcial2P5 {
    public static void main(String[] args) {
        Arreglo();
    }
     public static void Arreglo(){
        int x,y;
        
        System.out.println("Introduzca el tamaño (x,y) de las matrices");
        x=asignarTamaño("x = filas:");
        y=asignarTamaño("y = columnas:");
        System.out.println("Valores del arreglo: ");
        int[][]A=asignarValores(x,y);
         System.out.println("\nEl contenido del arreglo es: ");
        mostrarArray(A);
        int suma=0,cont=0;
        for(int j=0; j<A.length;j++){
            for(int i=0;i<A[j].length;i++){
                suma=suma+A[j][i];
               
            } cont++;
            System.out.println("La suma de la fila "+cont+" es: "+suma);
            suma=0;
        }
    }

    
    public static int solicitaDatos(){
        Scanner kb=new Scanner(System.in);
        boolean flag;
        int num=0;
        do{      
            try{ 
                num = kb.nextInt(); 
                flag = true;
            }catch (Exception ex) { 
                flag = false;
                System.out.println("El valor que inserto, no es un entero. Intruduzca un entero: " +ex);
                kb.nextLine();   
            }
            
        }while(flag==false); 
        return num;
    }
public static void mostrarArray(int [][]arreglo){ 
        for(int i=0; i<arreglo.length; i++){
            for (int j=0; j<arreglo[i].length; j++){
                System.out.print("["+arreglo[i][j]+"]");
                if (j+2>arreglo[i].length){
                    System.out.println("\t");
                }  
            }
        } 
        
    }
public static int[][] asignarValores(int x, int y){
        int[][] arreglo = new int [x][y];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.println("  Introduzca valores para: "+i+", "+j);
                arreglo [i][j]=solicitaDatos();
            }    
        }
        
        return arreglo;
    }
public static int asignarTamaño(String dimension){
        int x;
        boolean flag;
        System.out.println("Valor de "+dimension);
        do{
            x=solicitaDatos();
            flag=true;
            if(x<1){
                System.out.println("No se puede introducir valores negativos, introduzca uno positivo:");
                flag=false;
            }
            
        }while(flag==false);
        
        return x; 
    }
}