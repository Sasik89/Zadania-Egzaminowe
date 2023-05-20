public class Kucharz {
    public static void kucharz(int j, int p, int z) {

        while (z > 0) {
            if (j > p) p++;
            else {
                j++;
            }
            z--;
        }

        if (j > p) System.out.println("Minimalna różnica: " + (j - p));
        else System.out.println("Minimalna różnica: " + (p - j));
        System.out.println("Ilość jabłek: " + j);
        System.out.println("Ilość pomarańczy " + p + "\n");
    }

}
