public class Uebung3Aufgabe1 {
  public static void main(String[] args) {
    /*
    Als Vorbereitung für das Linear Softmax Modell: implementieren Sie die Matrix-Multiplikation die in diesem
    Modell vorkommt. Dafür soll eine Funktion 'matMul' implementiert werdem, die ein 2D-Array 'W' und ein
    1D-Array 'x' als Parameter erwartet und das Ergebnis der Matrix-Multiplikation als 1D-Array zurückgibt.
    Sie sollten prüfen ob die Dimensionen von W und x übereinstimmen, d.h., es kann eine MM durchgeführt werden.
    Falls nicht soll null zurückgegeben werden. Die Länge des Rückgabevektors soll aus den Dimensionen von W und x
    bestimmt werden. Hintergrund: eine Matrixmultiplikation transformiert einen Vektor x⃗  in einen Vektor y⃗ =Wx⃗  ,
    wobei gilt: yi=∑jWijxj
    */

    double[][] W1 = new double[][] { { 1., 1. }, { 1., 1. } };
    System.out.println("W1\nErwartet : [4.0, 4.0]\nErhalten : " + java.util.Arrays.toString(matMul(W1, new double[] { 2., 2. })));

    double[][] W2 = new double[][] { { 1., 1. }, { 1., 1. } };
    System.out.println("W2\nErwartet : null\nErhalten : " + java.util.Arrays.toString(matMul(W2, new double[] { 2., 2., 2. })));

    double[][] W3 = new double[][] { { -1., 0. }, { -1., 0. } };
    System.out.println("W3\nErwartet : [-2.0, -2.0]\nErhalten : " + java.util.Arrays.toString(matMul(W3, new double[] { 2., 2. })));

    double[][] W4 = new double[][] { { -1., 0. }, { -1., 1. } };
    System.out.println("W4\nErwartet : [-2.0, 0.0]\nErhalten : " + java.util.Arrays.toString(matMul(W4, new double[] { 2., 2. })));

    double[][] W5 = new double[][] { { -1., 0. }, { -1., 1. }, { 1., 0. } };
    System.out.println("W5\nErwartet : [-2.0, 0.0, 2.0]\nErhalten : " + java.util.Arrays.toString(matMul(W5, new double[] { 2., 2. })));

    double[][] W6 = new double[][] { { -1., 0. }, { -1., 1. }, { 1., 0. }, { 1., -1. } };
    System.out.println("W6\nErwartet : [-2.0, 0.0, 2.0, 0.0]\nErhalten : " + java.util.Arrays.toString(matMul(W6, new double[] { 2., 2. })));
  }

  public static double[] matMul(double[][] W, double[] x){
    if (W[0].length != x.length) {
      return null;
    }

    double[] res = new double[W.length];

    for (int i = 0; i < W.length; i++) {
      for (int j = 0; j < x.length; j++) {
        res[i] += x[j] * W[i][j];
      }
    }

    return res;
  }

}
