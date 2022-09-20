import java.util.Scanner;

public class dortBesKat {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Sınır degerini giriniz : ");
        number = input.nextInt();

        System.out.println("4'ün Katları");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(+i);
        }
        System.out.println("5'in Katları");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(+i);
        }
    }
}