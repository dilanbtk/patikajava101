import java.util.Scanner;

public class hesap {
    public static void main(String[] args) {
       int number,toplam=0;
       do {
           Scanner input= new Scanner(System.in);
           System.out.println("sayı giriniz : ");
           number =input.nextInt();
           if (number%2==0 && number%4==0){
               toplam +=number;
           }
       }while (number%2==0);
        System.out.println("Toplam = "+toplam);

    }
}
