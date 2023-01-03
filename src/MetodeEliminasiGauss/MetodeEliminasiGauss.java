/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeEliminasiGauss;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MetodeEliminasiGauss {

    private static final double x = 1e-10;

    public static double[] cari(double[][] A, double[] b) {
        int batas = b.length;
        for (int p = 0; p < batas; p++) {
            int max = p;
            for (int i = p + 1; i < batas; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }
            double[] temp = A[p];
            A[p] = A[max];
            A[max] = temp;
            double t = b[p];
            b[p] = b[max];
            b[max] = t;
            if (Math.abs(A[p][p]) <= x) {
                throw new RuntimeException("Matriks tunggal");
            }
            for (int i = p + 1; i < batas; i++) {
                double alpha = A[i][p] / A[p][p];
                b[i] -= alpha * b[p];
                for (int j = p; j < batas; j++) {
                    A[i][j] -= alpha * A[p][j];
                }
            }
        }
        double[] x = new double[batas];
        for (int i = batas - 1; i >= 0; i--) {
            double jum = 0.0;
            for (int j = i + 1; j < batas; j++) {
                jum += A[i][j] * x[j];
            }
            x[i] = (b[i] - jum) / A[i][i];
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Metode Eliminasi Gauss - Matrix 3x3");
        System.out.println();
        
        double[][] matrix = new double[3][3];
        
        System.out.println("Masukkan nilai matriks : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris ke-" + (i + 1) + " dan kolom ke-" + (j + 1) + " : "); matrix[i][j] = in.nextDouble();
            }
        }
        System.out.println();
        
        System.out.println("Matriks Ax");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Masukkan nilai B : ");
        double[] B = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Nilai " + (i + 1) + " = "); B[i] = in.nextDouble();
        }
        
        System.out.println();
        System.out.println("Nilai B : ");
        for(int i = 0; i < 3; i++) {
            System.out.print(B[i] + "\n");
        }
        
        double[] x = cari(matrix, B);
        System.out.println("");
        System.out.println("Hasil Eliminasi Gauss ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nilai x" + (i + 1) + " = " + x[i]);
        }
    }
}
