public class Uebung2Aufgabe7 {
  public static void main(String[] args) {
    /*
    Implementieren Sie die MSE-Zielfunktion in einer Methode 'mse', welche als Parameter ein 2D-Array Y und ein
    2D-Array T erhält, welche die Modellfunktionsoutputs sowie die Zielwerte eines Problems repräsentieren. Die Zahl
    der Zeilen darf als > 0 angenommen werden, die Zahl der Spalten in Y und T ist identisch und kann aus der ersten
    Zeile bestimmt werden.
     */

    double[][] T1 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T1 : " + mse(new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } }, T1));

    double[][] T2 = new double[][] { { 1., 1., 0.5, 0. }, { 1., 1., 1., 1. }, { 1., 0., 0., 0.5 } };
    System.out.println("T2 : " + mse(new double[][] { { 1., 1., 0.5, 0. }, { 1., 1., 1., 1. }, { 1., 0., 0., 0.5 } }, T2));

    double[][] T3 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T3 : " + mse(new double[][] { { 1., 0.5, 0. }, { -1., -1., -1. }, { 0., 0., 0.5 } }, T3));

    double[][] T4 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T4 : " + mse(new double[][] { { 2., 1.5, 1. }, { 2., 2., 2. }, { 1., 1., 1.5 } }, T4));

    double[][] T5 = new double[][] { { 1., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } };
    System.out.println("T5 : " + mse(new double[][] { { 7., 0.5, 0. }, { 1., 1., 1. }, { 0., 0., 0.5 } }, T5));
  }

  public static double mse(double[][] Y, double[][] T) {
    double res = 0.0;

    for (int i = 0; i < Y.length; i++) {
      for (int j = 0; j < Y[i].length; j++) {
        res += (Y[i][j] - T[i][j]) * (Y[i][j] - T[i][j]);
      }
    }

    return res / Y.length;
  }

}
