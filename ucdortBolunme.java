import java.util.Scanner;

public class ucdortBolunme {
    public static void main(String[] args) {
        int k ,toplam=0, sayac =0,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("deger giriniz : ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                
                toplam =+i ;
                sayac++;

            }
        }sonuc=toplam/sayac;
        System.out.println("sonuc : " +sonuc);
    }
}