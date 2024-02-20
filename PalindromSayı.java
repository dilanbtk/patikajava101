public class PalindromSayı {

    static boolean PalidromMu(int n) {
        int deger = n, tersSayi = 0, sonSayi;

        while (deger != 0) {
            System.out.println("sayi = " + deger);

            sonSayi = deger % 10;
           System.out.println("son basmak = " + sonSayi);

            tersSayi = (tersSayi * 10) + sonSayi;
           System.out.println("ters sayi = " + tersSayi);
            deger /= 10;
        }
        System.out.println("skks"+tersSayi);
        System.out.println("aaa"+deger);
        if (n == tersSayi) {
            return true;

        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(PalidromMu(1021));
    }
}
