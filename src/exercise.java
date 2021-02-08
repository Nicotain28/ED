public class exercise {
    public static float determinant(double[] ints, double[] ints1, double[] ints2) {
        double cad1 = (ints[0] * ints1[1] * ints2[2]) + (ints[1] * ints1[2] * ints2[0]) + (ints[2] * ints1[0] * ints2[1]);
        double cad2 = (ints2[0] * ints1[1] * ints[2]) + (ints2[1] * ints1[2] * ints[0]) + (ints2[2] * ints1[0] * ints[1]);
        double result = cad1 - cad2;
        float result1 = (float) result;
        return result1;
    }
}
