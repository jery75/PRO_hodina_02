public class Main {
    public static void main(String[] args) {
        int c1 = 10;
        int c2 = 20;
        float f1 = 1f;
        double d1 = 2d;
        boolean b1 = true;
        String s1 = "dsada";
        int soucet = c1 + c2;

        System.out.println("Součet" + c1 + " + " + c2 + " = " + soucet);
        int deleni = c2 / c1;
        System.out.println("Dělení" + deleni);
        float deleni2 = c1 / (float) c2;
        System.out.println("F Dělení" + deleni2);
        if (soucet < 15) {
            System.out.println("číslo je mensi než 15");
        } else {
            System.out.println("číslo je větsí než 15");
        }

        Kalkulacka calc = new Kalkulacka();
        int soucet2 = calc.soucet(55, 5);
        System.out.println(soucet2 + soucet2);
        soucet2 = soucet2 + soucet2;
        soucet2 = soucet2 + soucet;
        System.out.println(soucet2 + soucet);
        System.out.println("poslední součet:" + calc.getPosledniSoucet());
        int c10 = 10;
        int c11 = c10;

        Kalkulacka calc2 = new Kalkulacka();
        Kalkulacka calc3 = new Kalkulacka();
        if (calc2 != calc3) {
            System.out.println("calc nejsou stejny");
        }

        Kalkulacka calc4 = calc2;
        if (calc4 == calc2)
            System.out.println("calc jsou stejny");
        calc2.soucet(10, 11);
        System.out.println("poslední součet z calc4:" + calc4.getPosledniSoucet());
    }
}