import static java.lang.Math.*; // Import Math

public class lab1 {
    public static void main(String[] args) {
        long[] a = {3, 5, 7, 9, 11, 13, 15, 17}; // Create and fill first array
        float[] x = new float[20]; // Create second array
        for (int i = 0; i < 20; i++) {
            x[i] = (float) (-7.0 + (13.0 - (-7.0)) * random()); // Fill with random numbers from -7.0 to 13.0
        }
        createFillAndOutLastArray(a, x); // Call function to complete task
    }

    public static void createFillAndOutLastArray(long[] a, float[] x) {
        double[][] c = new double[8][20]; // Create array 8*20
        for (int j = 0; j < 20; j++) {
            float fx = x[j]; // Get value x from second array
            for (int i = 0; i < 8; i++) {
                long fa = a[i]; // Get value a from first array
                if (fa == 15) {
                    c[i][j] = function1(fx);
                } else if ((fa == 3) || (fa == 9) || (fa == 11) || (fa == 17)) {
                    c[i][j] = function2(fx);
                } else {
                    c[i][j] = function3(fx);
                }
                System.out.printf("%10.5f ", c[i][j]); // Output value to the screen
            }
            System.out.println(); // Next line
        }
    }
    // Functions for calculating
    public static double function1(float fx) {
        return sin(pow(((cbrt(fx) + 1) / 2), 3));
    }

    public static double function2(float fx) {
        return asin(sin(fx)) * (PI - pow(fx, 0.25 / fx) * (2 / 3 + pow(fx / (fx - 0.5), 3)));
    }

    public static double function3(float fx) {
        return (cos(log(abs(fx))) + 1) / PI;
    }
}