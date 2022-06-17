public class Uebung2Aufgabe4 {
  public static void main(String[] args) {
    /*
    Implementieren Sie die Klassifikationsgenauigkeit-Zielfunktion in einer Methode 'classAccuracy', welche als
    Parameter ein 2D-Array Y und ein 2D-Array T erhält, welche die Modellfunktionsoutputs sowie die Zielwerte eines
    Problems repräsentieren. Hier wird ein Klassifikationsproblem behandelt, d.h. die Zeilenvektoren des Zielwert-
    Arrays T repräsentieren diskrete Klassen: falls Klasse k gemeint ist, steht an der Stelle k im Zeilenvektor eine
    1 und 0 überall sonst. Klar ist: ein Zielwert-Vektor der Länge K kann auf diese Weise genau K verschiedene Klassen
    repräsentieren. Die Zahl der Zeilen darf als > 0 angenommen werden, die Zahl der Spalten in Y und T ist identisch
    und kann aus der ersten Zeile bestimmt werden. Die Modelloutputs Y sind garantiert im [0,1]-Intervall und
    repräsentieren die Wahrscheinlichkeiten, die das Modell für eine bestimmte Klasse berechnet hat. Eine Modelloutput
    wird als korrekt angehsehen, wenn die höchste Wahrscheinlichkeit an der Stelle steht, wo der zugehörige Zielwert
    eine 1 hat. classAccuracy soll die Anzahl der korrekten Modelloutputs liefern, dividiert durch die Gesamtzahl der
    Modelloutputs. Also die Wahrscheinlichkeit dass ein einzelner Modelloutput die richtige Klasse liefert.
    Zum Nachdenken: Was sind obere und untere Schranken für diese Zielfunktion?
     */

    double[][] T1 = new double[][] { { 1., 0., 0. }, { 0., 0., 1. }, { 0., 1., 0. } };
    System.out.println("T1 : " + classAccuracy(new double[][] { { 0.5, 0.4, 0.1 }, { 0.4, 0., 0.6 }, { 0., 0.9, 0.1 } }, T1));

    double[][] T2 = new double[][] { { 1., 0., 0., 0. }, { 0., 0., 1., 0. }, { 0., 1., 0., 0. } };
    System.out.println("T2 : " + classAccuracy(new double[][] { { 0.5, 0.4, 0.1, 0. }, { 0.4, 0., 0.6, 0. }, { 0., 0.9, 0.1, 0. } }, T2));

    double[][] T3 = new double[][] { { 1., 0., 0., 0. }, { 0., 0., 1., 0. }, { 0., 1., 0., 0. } };
    System.out.println("T3 : " + classAccuracy(new double[][] { { 0.4, 0.5, 0.1, 0. }, { 0.6, 0., 0.4, 0. }, { 0., 0.1, 0.9, 0. } }, T3));

    double[][] T4 = new double[][] { { 1., 0. }, { 0., 1. }, { 0., 1. }, { 1., 0. } };
    System.out.println("T4 : " + classAccuracy(new double[][] { { 0.6, 0.4 }, { 0.4, 0.6 }, { 0.8, 0.2 }, { 0.3, 0.7 } }, T4));

    double[][] T5 = new double[][] { { 1., 0. }, { 0., 1. }, { 0., 1. }, { 1., 0. } };
    System.out.println("T5 : " + classAccuracy(new double[][] { { 0.4, 0.6 }, { 0.6, 0.4 }, { 0.1, 0.9 }, { 0.7, 0.3 } }, T5));
  }

  public static double classAccuracy(double[][] Y, double[][] T) {
    double largest = -1.0;
    double counter = 0.0;
    for (int i = 0; i < Y.length; i++) {
      for (int j = 0; j < Y[i].length; j++) {
        if (Y[i][j] > largest) {
          largest = Y[i][j];
        }
      }
      for (int k = 0; k < Y[i].length; k++) {
        if (Y[i][k] == largest && T[i][k] == 1.0) {
          counter++;
          largest = -1.0;
        }
      }
    }
    return counter / Y.length;
  }
}
