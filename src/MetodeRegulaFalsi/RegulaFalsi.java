/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeRegulaFalsi;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author ACER
 */
public class RegulaFalsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, jumlahIterasi, fa, fb, fc;
        
        System.out.println("====== METODE REGULA FALSI ======");
        System.out.println("f(x) = -3x^2 - 7x + 9.5");
        System.out.print("Masukkan nilai a : "); a = input.nextDouble();
        System.out.print("Masukkan nilai b : "); b = input.nextDouble();
        System.out.print("Masukkan jumlah iterasi : "); jumlahIterasi = input.nextDouble();
        
        int i = 0;
        
        do {
            System.out.println("\nIterasi ke-" + (i+1));
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            
            fa = (-3*a*a) - (7*a) + 9.5;
            fb = (-3*b*b) - (7*b) + 9.5;
            c = (((fb*a) - (fa*b))/(fb-fa));
            fc = (-3*c*c) - (7*c) + 9.5;
            
            System.out.println("f(a) = f(" + a + ") = " + fa);
            System.out.println("f(b) = f(" + b + ") = " + fb);
            System.out.println("c = " + c);
            System.out.println("f(c) = f(" + c + ") = " + fc);
            
            if(fa*fb < 0) {
                if(fa*fc < 0) {
                    b = c;
                }
                
                if(fb*fc < 0) {
                    a = c;
                }
            } 
            i++;
        } while(i < jumlahIterasi);
        
        System.out.println("\nNilai akar pada iterasi ke-" + i +  " adalah : " + c);
    }
}
