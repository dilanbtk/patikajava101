import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        int a, b,c;
        double Alan, u;


        Scanner girdi= new Scanner(System.in);

        System.out.println("1.kenari giriniz :");
        a = girdi.nextInt();
        System.out.println("2.kenari giriniz :");
        b = girdi.nextInt();
        System.out.println("3.kenari giriniz :");
        c = girdi.nextInt();

        u = (a+b+c)/2;

         Alan =Math.sqrt( u* (u - a)* (u -b) * (u - c));

        System.out.println(Alan);
    }
}
