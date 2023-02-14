public class Kalkulacka {
    private int PosledniSoucet;

    public int soucet(int c1, int c2) {
        int soucet2 = c1 + c2;

        System.out.println("Součet " + c1 + " + " + c2 + " = " + soucet2);
        return soucet2;

    }

    public int getPosledniSoucet() {
        return PosledniSoucet;


    }
}
