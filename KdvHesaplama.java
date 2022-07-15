import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double vergisizTutar, vergilitutar;
        Scanner input = new Scanner(System.in);

        System.out.println("deger giriniz");
        while (true) {
            vergisizTutar = input.nextDouble();
            if (vergisizTutar <= 0) {
                System.err.println("hatalı deger girdiniz. Tekar deger giriniz");
            } else {
                break;
            }
        }


        if (vergisizTutar > 0 && vergisizTutar < 1000) {
            vergilitutar = vergisizTutar + (vergisizTutar * 0.18);

        } else {
            vergilitutar = vergisizTutar + (vergisizTutar * 0.08);

        }
        System.out.println("Vergili tutar = " + vergilitutar);

    }
}
