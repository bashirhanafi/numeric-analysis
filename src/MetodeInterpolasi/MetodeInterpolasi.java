/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeInterpolasi;

import java.util.Scanner;

public class MetodeInterpolasi {

    public static int interpolationSearch(int[] sortedArray, int pos) {
        int awal = 0;
        int akhir = sortedArray.length - 1;
        int tengah;
        while (sortedArray[awal] <= pos && sortedArray[akhir] >= pos) {
            if (sortedArray[akhir] - sortedArray[awal] == 0) {
                return (awal + akhir)/2;
            }
            tengah = awal + ((pos - sortedArray[awal]) * (akhir - awal))/(sortedArray[akhir] - sortedArray[awal]);
            if (sortedArray[tengah] < pos) {
                awal = tengah + 1;
            } else if (sortedArray[tengah] > pos) {
                akhir = tengah - 1;
            } else {
                return tengah;
            }
        }
        if (sortedArray[awal] == pos) {
            return awal;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element;

        System.out.println("=== METODE INTERPOLASI LINIER ===\n");
        System.out.print("Masukkan jumlah elemen bilangan bulat: "); element = input.nextInt();

        int arr[] = new int[element];
        
        System.out.println("Masukkan " + element + " data bilangan bulat : ");
        for (int i = 0; i < element; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Masukkan element yang dicari (pos): "); int pos = input.nextInt();
        
        int result = interpolationSearch(arr, pos);
        if (result == -1) {
            System.out.println("Bilangan " + pos + " pada data tidak ditemukan!");
        } else {
            System.out.println("Bilangan " + pos + " pada data berada pada index ke- " + result);
        }
    }
}
