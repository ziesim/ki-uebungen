public class Uebung2Aufgabe2 {
  public static void main(String[] args) {
    /*
    Implementieren Sie eine Modellfunktion f(x) als Vektor-Vektor-Funktion. Sie soll einen Java-Vektor vom Typ double
    übergeben bekommen (Länge 2) und die Klasse als Java-Vektor der Länge 3 im One-Hot-Format zurückgeben. Die
    zurückgelieferte Klasse soll 1 sein falls die erste Komponente von x < 0 ist, sonst 2.
     */

    printArray(f(new double[] { -1.0, 1.0 }));

    printArray(f(new double[] { -10.0, 0.0 }));

    printArray(f(new double[] { 2.0, 0.0 }));

    printArray(f(new double[] { 10.0, 20.0 }));
  }

  public static double[] f(double[] x)
  {
    double[] res = new double[3];

    if(x[0] < 0) {
      res[0] = 1.0;
    } else {
      res[1] = 1.0;
    }

    return res;
  }

  static void printArray(double[] x)
  {
    if (x.length == 0) {
      System.out.println("[]");
      return;
    }
    System.out.print("[");
    for (int i = 0; i < x.length - 1; i++) {
      System.out.print(x[i] + ",");
    }
    System.out.println(x[x.length - 1] + "]");
  }
}
