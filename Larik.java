/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asa;

/**
 *
 * @author Ribka Restu
 */
public class Larik {

    public static void cetak(int[] a) {//method untuk cetak array bertipe integer
        System.out.print("data array ={");//cetak "data array={"
        for (int i = 0; i < a.length; i++) {//for untuk cetak data array
            System.out.print(a[i] + " ");//cetak array ke i
            if (i < a.length - 1) {//untuk merapihkan output saja
                System.out.print(",");//cetak","
            } else if (i > a.length) {
                System.out.print("");
            }
        }
        System.out.println("}");//cetak"}"
    }

    public static void insertionSortAsc(int[] larik) {
        for (int iterasi = 1; iterasi < larik.length; iterasi++) {
            int sisip = larik[iterasi];
            int elemen;
            for (elemen = iterasi; elemen >= 1; elemen--) {
                if (sisip < larik[elemen - 1]) {
                    larik[elemen] = larik[elemen - 1];
                } else {
                    break;
                }
            }
            larik[elemen] = sisip;
        }
    }

    public static void mergeSort(int[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            int mid = array.length / 2;

            // Split left part
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }

            // Split right part
            int[] right = new int[array.length - mid];
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while (i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
}
