import java.util.Scanner;

public class daireDilimAlan {
    public static void main(String[] args) {

        double r,pi=3.14 ,aci ;

        Scanner input = new Scanner(System.in);
        System.out.println("yarı çapını giriniz");
        r = input.nextInt();
        System.out.println("açıyı giriniz");
        aci = input.nextInt();
        double alan  = (pi*(r*r)*aci)/360;
        System.out.println("dilim alanı : "+ alan);

    }
}
