/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

import java.util.Scanner;

/**
 *
 * @author Carlos Hernandez C
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1er cambio: declararacion de tipos
        int n1,n2,n3;
        String cadena;
        boolean encontrado=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        n1=sc.nextInt();
        sc.nextLine();
        System.out.println("Escriba otro numero: ");
        n2=sc.nextInt();
        sc.nextLine();
        n3=n1+n2;
        System.out.println("El resultado es: "+n3);
        sc.close();
    }
    
}
