/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author fmill
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introducir numero de elementos a iterar:");
        int maxElementos;
        Scanner entradaScanner = new Scanner(System.in);
        maxElementos = entradaScanner.nextInt();
        int contador = 0;
        while (contador < maxElementos) {
            System.out.println("contaodor = " + contador);
            contador++;
        }
    }
    
}
