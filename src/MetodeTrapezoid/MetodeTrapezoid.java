/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeTrapezoid;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MetodeTrapezoid {
    // f(x) = x^2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x0, x1, x2, x3, x4, a, b, h, n, L, fx0, fx1, fx2, fx3, fx4;
        a = 2;
        b = 6;
        n = 4;
        
        System.out.println("f(x) = 2x^2 + 3x + 1");
        System.out.println("Batas bawah = " + a);
        System.out.println("Batas atas = " + b);
        System.out.println("Partisi = " + n);     
        
        System.out.println("\nMetode Trapezoid\n==========");
        h = (b-a)/n;
        System.out.println("h = " + h);
        x0 = a + (0*h);
        System.out.println("x0 = " + x0);
        x1 = a + (1*h);
        System.out.println("x1 = " + x1);
        x2 = a + (2*h);
        System.out.println("x2 = " + x2);
        x3 = a + (3*h);
        System.out.println("x3 = " + x3);
        x4 = a + (4*h);
        System.out.println("x4 = " + x4);
        
        fx0 = (2*x0*x0) + (3*x0) + 1;
        System.out.println("fx0 = " + fx0);
        fx1 = (2*x1*x1) + (3*x1) + 1;
        System.out.println("fx1 = " + fx1);
        fx2 = (2*x2*x2) + (3*x2) + 1;
        System.out.println("fx2 = " + fx2);
        fx3 = (2*x3*x3) + (3*x3) + 1;
        System.out.println("fx3 = " + fx3);
        fx4 = (2*x4*x4) + (3*x4) + 1;
        System.out.println("fx4 = " + fx4);
        L = (h/2*(fx0 + (2*(fx1+fx2+fx3)) + fx4));
        System.out.println("L = " + L);
        
    }
}
