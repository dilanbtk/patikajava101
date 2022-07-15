import java.util.Scanner;

class Ort {

    public static void main(String[] args){

        int mat ,fizik ,kimya, turkce,tarih,muzik;
        Scanner input =new Scanner(System.in);


        System.out.print("Matematik notu : ");
        mat =input.nextInt();

        System.out.print("fizik notu : ");
        fizik =input.nextInt();

        System.out.print("kimya notu : ");
        kimya =input.nextInt();

        System.out.print("turkce notu : ");
        turkce =input.nextInt();

        System.out.print("tarih notu : ");
        tarih =input.nextInt();

        System.out.print("muzik notu : ");
        muzik =input.nextInt();


        int toplam =(mat+fizik+kimya+turkce+tarih+ muzik);
        double sonuc = toplam/6.0;
        System.out.println("Ortalama : " + sonuc);


    }
}
