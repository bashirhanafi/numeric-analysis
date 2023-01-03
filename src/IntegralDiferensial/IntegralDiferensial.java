/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegralDiferensial;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class IntegralDiferensial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int a = 3;
            int b = 8;
            int c = 1;
            int d = 20;
            
            int pangkat1 = 3;
            int pangkat2 = 2;
            int pangkat3 = 1;
            int pangkat4 = 0;
        // f(t) = 3t^3 - 8t^2 + t + 20
        System.out.print("Diketahui fungsi f(t) = 3t^3 - 8t^2 + t + 20\nTentukan:\n1. Integral\n2. Diferensial\nMasukkan menu: "); int menu = input.nextInt();
        
        if(menu == 1) {
            System.out.println("==== INTEGRAL ====");
            a = 3;
            b = 8;
            c = 1;
            d = 20;
            
            pangkat1 = 3;
            pangkat2 = 2;
            pangkat3 = 1;
            pangkat4 = 0;
            
            System.out.println("Hasil Integral = ");
            System.out.println(a + "/" + ++pangkat1 + "t^" + pangkat1++ + " - " + b + "/" + ++pangkat2 + "t^" + pangkat2++ + " + " + c + "/" + ++pangkat3 + "t^" + pangkat3++
             + " + " + d + "t + C");
        } else if(menu == 2) {
            System.out.println("==== Diferensial ====");
            pangkat1 = 3;
            pangkat2 = 2;
            pangkat3 = 1;
            pangkat4 = 0;
            
            a = 3;
            int turunan1 = pangkat1*a;
            b = 8;
            int turunan2 = pangkat2*b;
            c = 1;
            int turunan3 = pangkat3*c;
            d = 20;
            int turunan4 = pangkat4*d;
            System.out.println("Hasil Diferensial = ");
            System.out.println(turunan1 + "t^" + --pangkat1 + " - " + turunan2 + "t" + " + " + turunan3);
        } else {
            System.exit(0);
        }
    }
}
