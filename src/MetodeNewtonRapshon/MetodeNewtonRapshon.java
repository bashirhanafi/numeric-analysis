/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeNewtonRapshon;

import java.util.Scanner;
import java.*;

/**
 *
 * @author ACER
 */
public class MetodeNewtonRapshon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        double fx, fx_derivative, xi;
        
        // Kasus Sistem Persamaan Non-Linier dengan Satu Tebakan Awal
        // Metode Newton-Rapshon
        // f(x) = e^(2x)-6x-1.5
        // f'(x) = 2e^(2x)-6
        
        System.out.print("Masukkan tebakan awal (x0) : "); double x0 = input.nextDouble();
        System.out.print("Masukkan jumlah iterasi : "); int iterasi = input.nextInt();
        System.out.println();
        
        do {
            fx = (Math.exp(2*x0)-(6*x0)-1.5);
            fx_derivative = (2*Math.exp(2*x0)-6);
            xi = x0 - (fx/fx_derivative);
            
            System.out.println("f(x" + i + ")" + " = f(x" + x0 + ") = " + fx);
            System.out.println("f(x" + i + ")" + " = f(x" + x0 + ") = " + fx_derivative);
            i++;
            System.out.println("x" + i + " = " + xi);
            
            x0 = xi;
            System.out.println();
        } while(i < iterasi);
        System.out.println("Akar persamaan dari xi terakhir adalah " + xi);
    }
}
