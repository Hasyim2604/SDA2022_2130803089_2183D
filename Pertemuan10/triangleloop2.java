package Pertemuan10;

import java.io.*;

public class triangleloop2 {
  static int theNumber;

  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number :");
    System.out.flush();
    theNumber = getInt();
    int theAnswer = triangle(theNumber);
    System.out.println("Triangle = " + theAnswer);
  }

  public static int triangle(int n) {
    if (n == 1)
      return 1;
    else
      return (n + triangle(n - 1));
  }

  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);
  }
}
