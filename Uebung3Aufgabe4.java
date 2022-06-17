public class Uebung3Aufgabe4 {
  public static void main(String[] args) {
    /*
    Implementieren Sie die Softmax-Funktion sm(x): sie nimmt ein double-Array 'x' (1D) und liefert ein double-Array
    der selben Länge zurück. Hierbei soll die Formel aus der Vorlesung gelten: yi=exp(xi)∑jexp(xj) . Für die Berechnung
    der Exponentialfunktion benutzen Sie Math.exp. Sobald die Funktion tut wass sie soll: überzeugen Sie sich, dass die
    Ausgabe tatsächlich die Bedingungen für eine Wahrscheinlichkeitsverteilung erfüllt.
     */

    double[] T1 = new double[] { 10., 10. };
    System.out.println("T1\nErwartet : [0.5, 0.5]\nErhalten : " + java.util.Arrays.toString(sm(T1)));

    double[] T2 = new double[] { -10., -10. };
    System.out.println("T2\nErwartet : [0.5, 0.5]\nErhalten : " + java.util.Arrays.toString(sm(T2)));

    double[] T3 = new double[] { -10., 10. };
    System.out.println("T3\nErwartet : [2.0611536181902033E-9, 0.9999999979388463]\nErhalten : " + java.util.Arrays.toString(sm(T3)));

    double[] T4 = new double[] { 1., 2. };
    System.out.println("T4\nErwartet : [0.2689414213699951, 0.7310585786300049]\nErhalten : " + java.util.Arrays.toString(sm(T4)));

    double[] T5 = new double[] { 1., 1., 1., 1. };
    System.out.println("T5\nErwartet : [0.25, 0.25, 0.25, 0.25]\nErhalten : " + java.util.Arrays.toString(sm(T5)));
  }

  public static double[] sm(double[] x) {
    double[] res = new double[x.length];

    for (int i = 0; i < x.length; i++) {
      double tmp = 0.0;

      for (int j = 0; j < x.length; j++) {
        tmp += Math.exp(x[j]);
      }

      res[i] = Math.exp(x[i]) / tmp;
    }

    return res;
  }
}
