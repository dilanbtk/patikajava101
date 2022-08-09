import java.util.Scanner;

public class dersGecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notu : ");
        mat = input.nextInt();

        System.out.print("fizik notu : ");
        fizik = input.nextInt();

        System.out.print("kimya notu : ");
        kimya = input.nextInt();

        System.out.print("turkce notu : ");
        turkce = input.nextInt();

        System.out.print("muzik notu : ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100) mat = 0;
        else if (fizik < 0 || fizik > 100) fizik = 0;
        else if (turkce < 0 || turkce > 100) turkce = 0;
        else if (kimya < 0 || kimya > 100) kimya = 0;
        else if (muzik < 0 || muzik > 100) muzik = 0;

        else {
            int toplam = (mat + fizik + kimya + turkce + muzik);
            double sonuc = toplam / 5.0;

            if (sonuc <= 55) {
                System.out.println("Sınıfta kaldınız");
                System.out.println("Ortalamanız : " + sonuc);
            } else {
                System.out.println("Sınıfı geçtiniz ");
                System.out.println("Ortalamanız : " + sonuc);
            }

        }
    }

}
