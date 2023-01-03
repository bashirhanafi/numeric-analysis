/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeSecant;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MetodeSecant {
    // f(x) = 1.6x^2 - 5.4x + 2
    // toleransi error = 0.01
    // x0 = -1
    // x1 = 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double xnm1, xn, xnp1, toleransi, e, fxnm1, fxn;
        // xnm1 = xn-1
        // xn
        // xnp1 = xn+1
        // fxnm1 = f(xn-1)
        // fxn
        // fxnp1 = f(xn+1)
        // e = toleransi error
        System.out.println("========= Metode Secant =========");
        System.out.println("f(x) = 1.6x^2 - 5.4x + 2");
        System.out.print("Masukkan x0: "); xnm1 = input.nextDouble();
        System.out.print("Masukkan x1: "); xn = input.nextDouble();
        System.out.print("Masukkan toleransi error (e): "); toleransi = input.nextDouble();
        
        int nm1 = 0;
        int n = 1;
        
        do {
            System.out.println();
            System.out.println("Iterasi ke-" + (n));
            fxnm1 = (1.6*xnm1*xnm1) - (5.4*xnm1) + 2;
            fxn = (1.6*xn*xn) - (5.4*xn) + 2;
            xnp1 = xn - ((fxn)*((xn-xnm1)/(fxn-fxnm1)));
            
            System.out.println("x" + nm1 + " = " + xnm1);
            System.out.println("x" + n + " = " + xn);
            System.out.println("f(" + nm1 + ") = " + fxnm1);
            System.out.println("f(" + n + ") = " + fxn);
            System.out.println("x" + (n+1) + " = " + xnp1);
            
            e = Math.abs((xnp1 - xn)/xnp1);
            
            System.out.println("error = " + e);
            
            if(e >= toleransi) {
                xnm1 = xn;
                xn = xnp1;
                
                System.out.println(e + " >= " + toleransi);
            }
            
            nm1++; n++;
            
        } while(e >= toleransi);
        
        System.out.println(e + " <= " + toleransi);
        System.out.println("\nNilai akar persamaan adalah : " + xnp1);
    }
}
