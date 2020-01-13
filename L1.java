import static java.lang.Math.*;

public class L1 {
	public static void main(String[] args) {
        int i, j;
        int a[] = {6, 8, 10, 12, 14, 16, 18};
        float x[] = new float[12];
        for (i = 0; i < 12; i++) {
            x[i] = (float)((random()*12) - 4.0);
        }
        float b[][] = new float[7][12];
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 12; j++) {
                if (a[i] == 14) {
                    b[i][j] = (float)(cos(exp(tan(x[j]))));
                }
                else if (a[i] == 8 || a[i] == 12 || a[i] == 18) {
                    b[i][j] = (float)(pow(2 * pow(log(abs(x[j]))/(atan((x[j] + 2) / 12) - 1), 2), cos(pow(x[j], 2))));
                }
                else {
                    b[i][j] = (float)(pow(cbrt(log(pow(PI/abs(x[j]), 2))), tan(pow((pow(x[j], x[j]/0.5)*(tan(x[j])+ 2/3d)), pow(x[j], (1/3d - x[j])/3)))));
                }
            }
        }
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 12; j++) {
                System.out.printf("%.5f"+ " ", b[i][j]);
            }
            System.out.println();
        }
    }
}