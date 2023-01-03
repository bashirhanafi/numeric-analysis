/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeBisection;

import java.util.Scanner;
import java.*;

/**
 *
 * @author ACER
 */
public class MetodeBisection {
    public static void main(String[] args) {
        // f(x) = 1.5x^3 + 3.5e - 2pi
        // batas bawah = -1.5
        // batas atas = -1
        
        Scanner input = new Scanner(System.in);
        double fx_i, fx_u, fx_r, x_i, x_u, x_r = 0, iterasi = 0;
        
        System.out.println("======= METODE BISECTION ========");
        System.out.println("f(x) = 1.5x^3 + 3.5e - 2pi");
        System.out.print("Masukkan nilai x_i : "); x_i = input.nextDouble();
        System.out.print("Masukkan nilai x_u : "); x_u = input.nextDouble();
        System.out.print("Jumlah iterasi   : "); iterasi = input.nextDouble();
        System.out.print("\n");
        
        int i = 0;
        do {
           x_r = (x_i+x_u)/2;
           System.out.println("iterasi ke-" + (i+1));
           System.out.println("x_i = " + x_i);
           System.out.println("x_u = " + x_u);
           System.out.println("x_r = " + x_r);
           
           // compute
           fx_i = (1.5*x_i*x_i*x_i) + (3.5*Math.E) - (2*Math.PI);
           fx_u = (1.5*x_u*x_u*x_u) + (3.5*Math.E) - (2*Math.PI);
           fx_r = (1.5*x_r*x_r*x_r) + (3.5*Math.E) - (2*Math.PI);
           
           if((fx_i*fx_r)<0) {
               x_u = x_r;
           } else if((fx_i*fx_r)>0) {
               x_i = x_r;
           } else {
               System.out.println("\nKomputasi berhenti pada iterasi ke-" + i);
               break;
           }
           
           System.out.println("f(x_i) = " + fx_i);
           System.out.println("f(x_u) = " + fx_u);
           System.out.println("f(x_r) = " + fx_r);
           System.out.println();
           i++;
           
        } while(i < iterasi);
        
        System.out.println("\nNilai akar (aproksimasi) pada iterasi ke-" + (i) + " adalah " + x_r);
        
    }
}
