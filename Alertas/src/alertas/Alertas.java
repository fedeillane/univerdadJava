/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertas;

/**
 *
 * @author fmill
 */
public class Alertas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 6;
        test();
        System.out.println(a);

    }
    
    static void test(){
        int a = 7;
        again();
        System.out.println(a);
    }
    
    static void again(){
        int a = 8;
        System.out.println(a);
    }
}
