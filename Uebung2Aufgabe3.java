public class Uebung2Aufgabe3 {
  public static void main(String[] args) {
    /*
    Implementieren Sie eine Matrix-Matrix-Modellfunktion. Dafür soll die gegebene Vektor-Vektor-Modellfunktion
    fVecVec(x) auf die Zeilen der übergebenen Matrix X angewendet werden und das Ergebnis zurückgeliefert werden.
    Die Funktion fVecVec(x) liefert stets den Vektor {1,0} zurück. Sie können annehmen dass die Matrix X mindestens
    eine Zeile hat.
     */

    print2DArray(f(new double[][] { { -1.0 } }));

    print2DArray(f(new double[][] { { -10.0 }, { 0.0 } }));

    print2DArray(f(new double[][] { { -1.0 }, { 1.0 }, { 1.0 } }));
  }

  public static double[] fVecVec(double[] x)
  {
    double[] ret = new double[] { 1., 0. };
    return ret;
  }

  static double[][] f(double[][] X)
  {
    for(int i = 0; i < X.length; i++) {
      X[i] = fVecVec(new double[] {0.0,0.0});
    }
    return X;
  }

  static void print2DArray(double[][] X)
  {
    System.out.print("[");
    for (int i = 0; i < X.length; i++) {
      double[] x = X[i];
      if (x.length == 0) {
        System.out.print("[]");
      } else {
        System.out.print("[");
        for (int j = 0; j < x.length - 1; j++) {
          System.out.print(x[j] + ",");
        }
        System.out.print(x[x.length - 1] + "]");
      }
    }
    System.out.println("]");
  }
}
