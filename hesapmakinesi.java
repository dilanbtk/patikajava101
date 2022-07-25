import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int s1,s2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz :");
        s1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
        s2 =input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-bölme\n4-carpma");
        System.out.println("işleminizi seçin : ");
        select =input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam = "+(s1+s2));
                break;
            case 2:
                System.out.println("Çıkarama = "+(s1-s2));
                break;
            case 3:
                System.out.println("Bölme = "+(s1/s2));
                break;
            case 4:
                System.out.println("Çarpma = "+(s1*s2));
                break;

            default:
                System.out.println("Yanlış işlem yaptınız tekrar deneyiniz...");

        }

    }
}
