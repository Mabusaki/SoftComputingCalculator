// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Double[] C1 = { };
        Double[] C2 = { };
        Double[] C3 = { };
        Double[] C4 = { };
        Double[] C5 = { };
        int number = 5;
        double a = 0. *number;
        double b = 0. *number;
        double c = 0. *number;
        double d = 0. *number;
        double e = 0. *number;
        double[] C1d = new double[C1.length];
        double[] C2d = new double[C2.length];
        double[] C3d = new double[C3.length];
        double[] C4d = new double[C4.length];
        double[] C5d = new double[5];
        for(int i = 0; i < C1.length; i++){
            double value = Math.pow(C1[i],a);
            C1d[i] = value;
        }
        for(int i = 0; i < C2.length; i++){
            Double value = Math.pow(C2[i],b);
            C2d[i] = value;
        }
        for(int i = 0; i < C3.length; i++){
            double value = Math.pow(C3[i],c);
            C3d[i] = value;
        }
        for(int i = 0; i < C4.length; i++){
            double value = Math.pow(C4[i],d);
            C4d[i] = value;
        }
        for(int i = 0; i < C5.length; i++){
            double value = Math.pow(C5[i],e);
            C5d[i] = value;
        }

        System.out.println(Arrays.toString(C1d));
        System.out.println(Arrays.toString(C2d));
        System.out.println(Arrays.toString(C3d));
        System.out.println(Arrays.toString(C4d));
        System.out.println(Arrays.toString(C5d));


    }
}
