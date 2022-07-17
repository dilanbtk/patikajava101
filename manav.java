import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67 ,domates=1.11,muz=0.95,patlican=5;
        double elmakilo, armutkilo,domateskilo,muzkilo,patlicankilo;

        Scanner input= new Scanner(System.in);
        System.out.println("elma kac kilo : ");
        elmakilo =input.nextDouble();

        System.out.println("armut kac kilo : ");
        armutkilo =input.nextDouble();

        System.out.println("muz kac kilo : ");
        muzkilo =input.nextDouble();

        System.out.println("domates kac kilo : ");
        domateskilo=input.nextDouble();

        System.out.println("patlican kac kilo : ");
        patlicankilo =input.nextDouble();

        double toplam =(armutkilo*armut)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.println("Toplam tutarınız : " + toplam);
    }
}
