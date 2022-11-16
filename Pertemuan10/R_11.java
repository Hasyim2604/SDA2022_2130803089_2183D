package Pertemuan10;

import java.util.*;

public class R_11 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Masukkan Nilai : ");
    int nilai = userInput.nextInt();
    System.out.println("Anda Memasukkan Nilai = " + nilai);
    printNilai(nilai);
    int jumlah = jumlahNilai(nilai);
    System.out.println("Nilai Penjumlahan = " + jumlah);
  }

  private static int jumlahNilai(int parameter1) {
    System.out.println("Parameter = " + parameter1);
    if (parameter1 == 1) {
      return parameter1;
    }
    // Faktorial
    // return parameter1 + jumlahNilai(parameter1 - 1);
    return parameter1 * jumlahNilai(parameter1 - 1);
  }

  // Fungsi Rekursif Sederhana
  private static void printNilai(int parameter) {
    System.out.println("Nilai = " + parameter);
    if (parameter == 0) {
      return;
    }
    parameter--;
    printNilai(parameter);
  }
}