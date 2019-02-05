import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {


    // Blatt 03 #################################################################################

    // Aufgabe 3-4
    public static void giveMeBeer() {
        System.out.println("Mogst a Bier?!");
        System.out.print("Natürlich mogst eins... Wie alt samma? :");

        Scanner sc = new Scanner(System.in);
        int alter = sc.nextInt();

        if (alter >= 16) {
            System.out.print("Wieviele? :");
            int anzahl = sc.nextInt();
            System.out.println("Hier, " + anzahl + " Bier!");
        } else {
            System.out.println("Zupf di!");
        }
    }




    // Blatt 04 #################################################################################

    // Aufgabe 4-3 a)
    public static int ggT(int a, int b) {
        while(b != 0) {
            if (a > b) {
                a = a - b;
            } else  {
                b = b - a;
            }
        }
        return a;
    }




    // Aufgabe 4-3 b)
    public static void ggTProdukt() {

        int kandidat = 1;

        while(kandidat < 1000) {

            kandidat = kandidat + 1;

            int ggTProdukt = 1;
            int i = 2;
            while(i < kandidat) {
                ggTProdukt = ggTProdukt * ggT(i,kandidat);
                i = i+1;
            }

            if(ggTProdukt == 1) {
                System.out.print(" " + kandidat);
            }
        }
    }





    // Blatt 05 #################################################################################

    // Aufgabe 5-2
    public static double quadratwurzel(double n, int i) {
        if (i == 0) {
            return (n + 1) / 2;
        } else {
            return 0.5 * ( quadratwurzel (n,i - 1)+ n / quadratwurzel (n,i - 1));
        }
    }


    // Aufgabe 5-3
    public static double vietaFaktor(int n) {
        if (n == 0) {
            return 0.5 * quadratwurzel(2, 10);
        } else {
            return (0.5 * quadratwurzel(2 + 2 * vietaFaktor(n - 1), 10)) * vietaFaktor(n - 1);
        }
    }

    public static double pi(int n) {
        if(n == 0)
            return 2.0/vietaFaktor(0);
        else
            return 1.0/vietaFaktor(n)*pi(n-1);
    }


    // Aufgabe 5-4
    public static double berechneDistanz(double x1, double y1, double x2, double y2) {
        double dx = x2-x1;
        double dy = y2-y1;
        return quadratwurzel(dx*dx+dy*dy,10);
    }






    // Blatt 06 #################################################################################


    // Aufgabe 6-3 a)
    public static double potenz(double x, int y) {
        if (x == 0) {
            return 0;
        } else if (y == 0) {
            return 1;
        } else if (y < 0) {
            return (1 / x) * potenz(x, y + 1);
        } else {
            return x * potenz(x, y - 1);
        }
    }

    // Aufgabe 6-3 b)
    public static long spiegelzahl(long m) {
        if (m == 0) {
            return 0;
        } else {
            return  (m % 10) + spiegelzahl(m / 10);
        }

    }

    public static int stellen(long z) {
        if (z  == 0) {
            return 0;
        } else {
            return 1 + stellen(z / 10);
        }
    }

    public static boolean istPalindrom(long z) {
        if (z % 10 == 0) {
            return false;
        } else {
            return true;
        }
    }



    // Aufgabe 6-4
    public static int peer(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n % 2 == 1) {
            return 1 + peer(n - 1);
        } else {
            return 2 + peer(n / 2 - 2);
        }
    }


    // Aufgabe 6-5
    // a)
    public static int summeRek(int i) {
        if (i == 0) {
            return 0;
        } else {
            return i + summeRek(i - 1);
        }
    }

    // b)
    public static int summeIt(int i) {
        int temp = 0;
        for (int j = 0; j < i + 1; j++ ) {
            temp = temp + j;
        }
        return temp;
    }

    // c)
    public static double wurzelIt(double x, int n) {
        double f1 = (x + 1) / 2;
        double result = 0;

        for (int i = 0; i < n; i++) {
            result = 0.5 * (f1 + x / f1);
            f1 = result;
        }

        return result;
    }

    // d)
    public static int fibIt(int n) {
        int f2 = 1;
        int f1 = 1;
        int fn = 0;

        if (n == 1 || n == 2) {
            return 1;
        }

        for (int i = 3; i < n+1; i ++) {
            fn = f2 + f1;
            f2 = f1;
            f1 = fn;
        }

        return fn;
    }


    // Blatt 07 #################################################################################

    // Aufgabe 7-1

    public static void typecast() {
        int x = 9;
        int y = 12;
        int z = 16;

        // (i)
        System.out.println(10/4.); // double 2.5
        // (ii)
        System.out.println(10/4); // int 2
        // (iii)
        System.out.println(x == y ? x < y : y > z); // boolean false
        // (iv)
        System.out.println(false && true); // boolean false
        // (v)
        // System.out.println(1 || 0); syntaktisch inkorrekt
        // (vi)
        System.out.println((byte)(127+1)); // int -128
        // (vii)
        System.out.println('x' + y + z); // string 928
        // (viii)
        System.out.println(x + y + "z"); // string 21z


    }

    // Aufgabe 7-2
    // a) terminiert
    // b) terminiert nicht - j erreicht niemals 1
    // c) terminiert nicht - j ist immer doppelt so groß
    // d) terminiert nicht - einmal

    // Aufgabe 7-3

    public static void e(){
        int i = 0;
        int j = 42;
        while(i < j ^ i > j); {
            i++;
            j--;
        }
        // Schleife ist immer true
        // j geht gegen minut unendlich, i geht gegen plus unendlich
        System.out.println(i + "  " + j);
    }

    public static void f(){
        int n = 1;
        double x = 0;
        double s;
        do {
            s = 1.0 / (n * n);
            x = x + s;
            n++;
        } while (s > 0.01);
        System.out.println(n + "  " + x + "  " + s);
    }

    public static void g(int n) {
        double x = 0.;
        double y = 1.;
        int i = 1;
        do {
            x = x + y;
            y = y / i;
        } while(i++ <= n);

        System.out.print("  " + x + "-" + y);
    }


    // Aufgabe 7-4

    private static boolean test = true;

    public static void sortiere(int x, int y, int z){
        int a = 0;
        a += (x > y ? 1 : 0);
        a += (x > z ? 2 : 0);
        a += (y > z ? 4 : 0);

        switch(a) {
            case 1:
                ausgabe(y, x, z);
                break;
            case 4:
                ausgabe(x, z, y);
                break;
            case 3:
                ausgabe(y, z, x);
                break;
            case 6:
                ausgabe(z, x, y);
                break;
            case 0:
                ausgabe(x, y, z);
                break;
            case 7:
                ausgabe(z, y ,x);
                break;

        }

    }

    public static void ausgabe(int a, int b, int c) {
        if(a > b || a > c || b > c) {
            System.out.println("Da stimmt etwas nicht!");
            test = false;
        }
        System.out.println("Es gilt: " + a + " <= " + b + " <= " + c);
    }

    public static void auswerten() {
        for(int i = 0; i < 10000; i++) {
            int x,y,z;
            Random random = new Random();
            x = random.nextInt()%50+50;
            y = random.nextInt()%50+50;
            z = random.nextInt()%50+50;
            System.out.println(x + " " + y + " " + z);
            sortiere(x,y,z);
        }

        if(test)
            System.out.println("--------------------\nAlles gut!");
        else
            System.out.println("--------------------\nLeider gab es Fehler!");
    }




    // Blatt 08 #################################################################################

    // Aufgabe 8-1

    public static int[] testArray = {1, 4, 6, 3, 46, 1, 34, 5, 26, 22};

    public static int arrayGet (int[] array, int i) {
        if (i < 0) {
            return array[0];
        } else if (i >= array.length) {
            return array[array.length-1];
        } else return array[i];
    }

    public static int sum (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double mean (int[] array) {
        int temp = sum(array);
        return temp / array.length;
    }

    public static void square (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
    }

    public static int max (int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Aufgabe 8-2

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
    }

    public static int[] resize(int[] array, int length) {
        int[] output;
         if (length < array.length) {
             output = new int[length];
             for(int i = 0; i < length; i++) {
                 output[i] = array[i];
                 return output;
             }
         } else {
             output = new int[length];
             for (int i = 0; i < array.length; i++) {
                 output[i] = array[i];
             }
             for (int i = array.length; i < length; i++) {
                 output[i] = 0;
             }
             return output;

         }
         return output;

    }

    // Aufgabe 10-1





    public static void main(String[] args) {
        Seminarraum zimmer1 = new Seminarraum();
        Seminarraum zimmer2 = new Seminarraum();

        System.out.println(zimmer1.equals(zimmer2));


        // typecast();
        sort(testArray);

        System.out.println(Arrays.toString(resize(testArray, 15)));
        // auswerten();


    }
}

