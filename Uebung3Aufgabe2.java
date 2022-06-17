public class Uebung3Aufgabe2 {
  public static void main(String[] args) {
    /*
    Eine Matrixmultiplikation kann auch auf eine Sammlung von Datenvektoren angewendet werden: implementieren Sie
    die Matrix-Multiplikation im Linear Softmax-Modell, diesmal nicht für auf einen einzelnen Datenvektor x,
    sondern für eine Matrix X (mit den einzelnen Datenvektoren als Zeilen). Dafür soll eine Funktion 'matMul'
    implementiert werdem, die ein 2D-Array 'W' und ein 2D-Array 'X' als Parameter erwartet und das Ergebnis der
    Matrix-Multiplikation XW als 2D-Array zurückgibt. Sie sollten prüfen ob die Dimensionen von W und X
    übereinstimmen, d.h., es kann eine MM durchgeführt werden. Falls nicht soll null zurückgegeben werden. Die Länge
    der Rückgabematrix soll aus den Dimensionen von W und X bestimmt werden. Hinweis: mit Copy&Paste von der
    vorherigen Aufgabe kommt man recht weit...
    */

    double[][] W1 = new double[][] { { 1., 1. }, { 1., 1. } };
    System.out.println("W1\nErwartet : [[4.0, 4.0]]\nErhalten : " + java.util.Arrays.deepToString(matMul(W1, new double[][] { { 2., 2. } })));

    double[][] W2 = new double[][] { { 1., 1. }, { 1., 1. } };
    System.out.println("W2\nErwartet : null\nErhalten : " + java.util.Arrays.deepToString(matMul(W2, new double[][] { { 2., 2., 2. } })));

    double[][] W3 = new double[][] { { -1., 0. }, { -1., 0. } };
    System.out.println("W3\nErwartet : [[-4.0, 0.0]]\nErhalten : " + java.util.Arrays.deepToString(matMul(W3, new double[][] { { 2., 2. } })));

    double[][] W3b = new double[][] { { -1., 0. }, { -1., 0. } };
    System.out.println("W3b\nErwartet : [[-4.0, 0.0], [-2.0, 0.0]]\nErhalten : " + java.util.Arrays.deepToString(matMul(W3b, new double[][] { { 2., 2. }, { 1., 1. } })));

    double[][] W4 = new double[][] { { -1., 0. }, { -1., 1. } };
    System.out.println("W4\nErwartet : [[-4.0, 2.0], [-1.0, 0.0]]\nErhalten : " + java.util.Arrays.deepToString(matMul(W4, new double[][] { { 2., 2. }, { 1., 0. } })));

    double[][] W5 = new double[][] { { -1., 0. }, { -1., 1. }, { 1., 0. } };
    System.out.println("W5\nErwartet : null\nErhalten : " + java.util.Arrays.deepToString(matMul(W5, new double[][] { { 2., 2. } })));
  }

  public static double[][] matMul(double[][] W, double[][] X){
    if (W.length != X[0].length) {
      return null;
    }

    double[][] res = new double[X.length][W.length];

    for (int i = 0; i < X.length; i++) {
      for (int j = 0; j < W.length; j++) {
        for (int k = 0; k < W[0].length; k++) {
          res[i][k] += X[i][j] * W[j][k];
        }
      }
    }

    return res;
  }

}
