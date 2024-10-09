// 12S24043 - desnita pardosi
// 12S24018 - kelvin yohanes putra
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, total, hargaterkecil, nilaitransaksi;

        hargabuku = Double.parseDouble(input.nextLine());
        total = hargabuku;
        hargaterkecil = hargabuku;
        while (hargabuku != 0) {
            if (hargaterkecil <= hargabuku) {
                hargaterkecil = hargaterkecil;
            } else {
                hargaterkecil = hargabuku;
            }
            hargabuku = Double.parseDouble(input.nextLine());
            total = total + hargabuku;
        }
        if (total >= 100) {
            nilaitransaksi = total - hargaterkecil;
        } else {
            nilaitransaksi = total;
        }
        System.out.println(toFixed(nilaitransaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
