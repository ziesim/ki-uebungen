public class Uebung2Aufgabe8 {
  public static void main(String[] args) {
    /*
    Implementieren Sie die Root Mean Squared Error (RMSE)-Zielfunktion in einer Methode 'rmse', welche als Parameter
    ein 2D-Array Y und ein 2D-Array T erhält, welche die Modellfunktionsoutputs sowie die Zielwerte eines Problems
    repräsentieren. Die Zahl der Zeilen darf als > 0 angenommen werden, die Zahl der Spalten in Y und T ist identisch
    und kann aus der ersten Zeile bestimmt werden. Der Unterschied zu MSE ist, dass der Betrag der Differenz zwischen
    Modellausgabe und Zielwert nicht quadriert wird uns somit die Quadratwurzel stehenbleibt. Die Quadratwurzel
    berechnen Sie mit der Funktion Math.sqrt (kein Import nötig)
     */

    double[][] T1 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T1 : " + rmse(new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } }, T1));

    double[][] T2 = new double[][] { { 1., 0.5, 0. }, { 2., 0., 0. }, { 0., 0., 0.5 } };
    System.out.println("T2 : " + rmse(new double[][] { { 1., 0.5, 0. }, { 0., 0., 0. }, { 0., 0., 0.5 } }, T2));

    double[][] T3 = new double[][] { { 1., 0.5, 0., 0. }, { 1., 1., 1., 1. }, { 0., 0., 0.5, 2. } };
    System.out.println("T3 : " + rmse(new double[][] { { 1., 0.5, 0., 0. }, { 1., 1., 1., 1. }, { 0., 0., 0.5, 2. } }, T3));

    double[][] T4 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T4 : " + rmse(new double[][] { { 2., 1.5, 1. }, { 2., 2., 2. }, { 1., 1., 1.5 } }, T4));

    double[][] T5 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T5 : " + rmse(new double[][] { { 7., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } }, T5));
  }

  public static double rmse(double[][] Y, double[][] T) {
    double res = 0.0;

    for (int i = 0; i < Y.length; i++) {
      double tmp = 0.0;
      for (int j = 0; j < Y[i].length; j++) {
        tmp += (Y[i][j] - T[i][j]) * (Y[i][j] - T[i][j]);
      }

      res += Math.sqrt(tmp);
    }

    return res / Y.length;
  }
}
