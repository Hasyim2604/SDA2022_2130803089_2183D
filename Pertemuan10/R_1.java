package Pertemuan10;

import java.util.*;

public class R_1 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Masukkan Nilai : ");
    int nilai = userInput.nextInt();
    System.out.println("Anda Memasukkan Nilai = " + nilai);
    printNilai(nilai);
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
