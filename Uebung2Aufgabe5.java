public class Uebung2Aufgabe5 {
  public static void main(String[] args) {
    /*
    Implementieren Sie die Klassifikationsfehler-Zielfunktion in einer Methode 'classError', welche als Parameter
    ein 2D-Array Y und ein 2D-Array T erhält, welche die Modellfunktionsoutputs sowie die Zielwerte eines Problems
    repräsentieren. Diese tut genau das was die Methode classAccuracy aus der vorherigen Aufgabe auch tut, mit dem
    folgenden Unterschied: sie berechnet die Zahl der inkorrekten Modelloutputs (anstelle der korrekten), natürlich
    auch dividiert durch die Gesamtzahl der Beispiele. Wieder: was ist der Wertebereich dieser Zielfunktion?
     */

    double[][] T1 = new double[][] { { 1., 0., 0. }, { 0., 0., 1. }, { 0., 1., 0. } };
    System.out.println("T1 : " + classError(new double[][] { { 0.5, 0.4, 0.1 }, { 0.4, 0., 0.6 }, { 0., 0.9, 0.1 } }, T1));

    double[][] T2 = new double[][] { { 1., 0., 0., 0. }, { 0., 0., 1., 0. }, { 0., 1., 0., 0. } };
    System.out.println("T2 : " + classError(new double[][] { { 0.5, 0.4, 0.1, 0. }, { 0.4, 0., 0.6, 0. }, { 0., 0.9, 0.1, 0. } }, T2));

    double[][] T3 = new double[][] { { 1., 0., 0., 0. }, { 0., 0., 1., 0. }, { 0., 1., 0., 0. } };
    System.out.println("T3 : " + classError(new double[][] { { 0.4, 0.5, 0.1, 0. }, { 0.6, 0., 0.4, 0. }, { 0., 0.1, 0.9, 0. } }, T3));

    double[][] T4 = new double[][] { { 1., 0. }, { 0., 1. }, { 0., 1. }, { 1., 0. } };
    System.out.println("T4 : " + classError(new double[][] { { 0.6, 0.4 }, { 0.4, 0.6 }, { 0.8, 0.2 }, { 0.3, 0.7 } }, T4));

    double[][] T5 = new double[][] { { 1., 0. }, { 0., 1. }, { 0., 1. }, { 1., 0. } };
    System.out.println("T5 : " + classError(new double[][] { { 0.4, 0.6 }, { 0.6, 0.4 }, { 0.1, 0.9 }, { 0.7, 0.3 } }, T5));
  }

  public static double classError(double[][] Y, double[][] T) {
    double largest = -1.0;
    double counter = 0.0;
    for (int i = 0; i < Y.length; i++) {
      for (int j = 0; j < Y[i].length; j++) {
        if (Y[i][j] > largest) {
          largest = Y[i][j];
        }
      }
      for (int k = 0; k < Y[i].length; k++) {
        if (Y[i][k] == largest && T[i][k] == 0.0) {
          counter++;
          largest = -1.0;
        }
      }
    }
    return counter / Y.length;
  }
}
