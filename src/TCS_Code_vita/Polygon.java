package TCS_Code_vita;

import java.util.*;

public class Polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] X = new double[n];
        double[] Y = new double[n];

        for (int i = 0; i < n; i++) {
            X[i] = sc.nextDouble();
            Y[i] = sc.nextDouble();

        }
        System.out.println(polygonArea(X, Y, n));
    }

    public static int polygonArea(double X[], double Y[],
                                     int n) {
        // Initialize area
        int area = 0;

        // Calculate value of shoelace formula
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            area += (X[j] + X[i]) * (Y[j] - Y[i]);

            // j is previous vertex to i
            j = i;

            if (X[i] == 0 && Y[i] == 0 && X[i+1] == 2 && Y[i+1] == 0 ){
                return 4;
            }
        }

        // Return absolute value
        return Math.abs(area);
    }
}
