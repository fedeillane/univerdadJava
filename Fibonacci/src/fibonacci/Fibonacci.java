/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author fmill
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resul = fibonacci(5);
        System.out.println(resul);
    }
    
    public static int fibonacci (int n){
        if(n<0)
            return -1;
        if(n<2)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
