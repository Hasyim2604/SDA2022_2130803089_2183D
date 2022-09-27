import java.io.*;

class Array {
  public static void main(String[] args) throws IOException {
    int[] Arr;
    Arr = new int[100];
    int nElems = 0;
    int j;
    int searchKey;
    Arr[0] = 77;
    Arr[1] = 99;
    Arr[2] = 44;
    Arr[3] = 55;
    Arr[4] = 22;
    Arr[5] = 88;
    Arr[6] = 11;
    Arr[7] = 00;
    Arr[8] = 66;
    Arr[9] = 33;
    nElems = 10;

    for (j = 0; j < nElems; j++)
      System.out.println(Arr[j] + " ");
    System.out.println("");

    searchKey = 66;
    for (j = 0; j < nElems; j++)
      System.out.println();
    if (Arr[j] == searchKey)
      if (j == nElems)
        System.out.println("Can't Find" + searchKey);
      else
        ;
    System.out.println("Found" + searchKey);

    searchKey = 55;
    for (j = 0; j < nElems; j++)
      if (Arr[j] == searchKey)
        for (int k = j; k < nElems; k++)
          Arr[k] = Arr[k + 1];
    nElems--;

    for (j = 0; j < nElems; j++)
      System.out.println(Arr[j] + " ");
    System.out.println("");
  }
}