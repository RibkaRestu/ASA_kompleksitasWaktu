/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asa;

import java.util.Arrays;

/**
 *
 * @author Ribka Restu
 */
public class ASA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int MAX_DATA = 10000000;
        int[] test = new int[MAX_DATA];
        int[] insertion = new int[MAX_DATA];
        int[] merge = new int[MAX_DATA];
        for (int i = 0; i < MAX_DATA; i++) {
            test[i] = (int) (Math.random() * MAX_DATA);
        }

        long start, stop;
        //1.000
        start = System.nanoTime();
        Larik.insertionSortAsc(Arrays.copyOfRange(test, 0, 999));
        stop = System.nanoTime();
        System.out.println("Untuk 1.000 data");
        System.out.println("Waktu sorting insertionSortAsc : " + (double) (stop - start) / 1000000000 + " s");

        //merge
        start = System.nanoTime();
        Larik.mergeSort(Arrays.copyOfRange(test, 0, 999));
        stop = System.nanoTime();
        System.out.println("Waktu sorting Merge  : " + (double) (stop - start) / 1000000000 + " s");

        //10.000
        start = System.nanoTime();
        Larik.insertionSortAsc(Arrays.copyOfRange(test, 0, 9999));
        stop = System.nanoTime();
        System.out.println("Untuk 10.000 data");
        System.out.println("Waktu sorting insertionSortAsc : " + (double) (stop - start) / 1000000000 + " s");

        //merge
        start = System.nanoTime();
        Larik.mergeSort(Arrays.copyOfRange(test, 0, 9999));
        stop = System.nanoTime();
        System.out.println("Waktu sorting Merge  : " + (double) (stop - start) / 1000000000 + " s");
        
        //100.000
        start = System.nanoTime();
        Larik.insertionSortAsc(Arrays.copyOfRange(test, 0, 99999));
        stop = System.nanoTime();
        System.out.println("Untuk 100.000 data");
        System.out.println("Waktu sorting insertionSortAsc : " + (double) (stop - start) / 1000000000 + " s");

        //merge
        start = System.nanoTime();
        Larik.mergeSort(Arrays.copyOfRange(test, 0, 99999));
        stop = System.nanoTime();
        System.out.println("Waktu sorting Merge  : " + (double) (stop - start) / 1000000000 + " s");
        
        //1.000.000
        start = System.nanoTime();
        Larik.insertionSortAsc(Arrays.copyOfRange(test, 0, 999999));
        stop = System.nanoTime();
        System.out.println("Untuk 1.000.000 data");
        System.out.println("Waktu sorting insertionSortAsc : " + (double) (stop - start) / 1000000000 + " s");

        //merge
        start = System.nanoTime();
        Larik.mergeSort(Arrays.copyOfRange(test, 0, 999999));
        stop = System.nanoTime();
        System.out.println("Waktu sorting Merge  : " + (double) (stop - start) / 1000000000 + " s");
        
        //10.000.000
        start = System.nanoTime();
        Larik.insertionSortAsc(Arrays.copyOfRange(test, 0, 9999999));
        stop = System.nanoTime();
        System.out.println("Untuk 10.000.000 data");
        System.out.println("Waktu sorting insertionSortAsc : " + (double) (stop - start) / 1000000000 + " s");

        //merge
        start = System.nanoTime();
        Larik.mergeSort(Arrays.copyOfRange(test, 0, 9999999));
        stop = System.nanoTime();
        System.out.println("Waktu sorting Merge  : " + (double) (stop - start) / 1000000000 + " s");

    }

}
//        int[] array = {4, 2, 3, 1, 5, 9};
//        Larik.cetak(array);
//        Larik.mergeSort(array);
//        Larik.cetak(array);
