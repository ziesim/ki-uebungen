public class Uebung3Aufgabe3 {
  public static void main(String[] args) {
    /*
    Erstellen Sie eine Funktion 'toOneHot', welche einen int-Parameter 'x' und einen weiteren int-Parameter 'length'
    erwartet (sie können annehmen dass gilt: 0 <= x < length), und ein Array der Länge 'length' zurückliefert. Dieses
    Array soll die Klasse x im one-hot Format codieren.
    */

    System.out.println("T1\nErwartet : [0.0, 1.0]\nErhalten : " + java.util.Arrays.toString(toOneHot(1, 2)));

    System.out.println("T2\nErwartet : [1.0, 0.0]\nErhalten : " + java.util.Arrays.toString(toOneHot(0, 2)));

    System.out.println("T3\nErwartet : [0.0, 0.0, 0.0, 1.0]\nErhalten : " + java.util.Arrays.toString(toOneHot(3, 4)));

    System.out.println("T4\nErwartet : [0.0, 0.0, 0.0, 1.0, 0.0]\nErhalten : " + java.util.Arrays.toString(toOneHot(3, 5)));

    System.out.println("T5\nErwartet : [1.0]\nErhalten : " + java.util.Arrays.toString(toOneHot(0, 1)));

    System.out.println("T6\nErwartet : [1.0, 0.0, 0.0]\nErhalten : " + java.util.Arrays.toString(toOneHot(0, 3)));
  }

  public static double[] toOneHot(int x, int length){
    double[] res = new double[length];

    res[x] = 1.0;

    return res;
  }

}
