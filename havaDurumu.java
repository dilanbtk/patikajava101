import java.util.Scanner;

public class havaDurumu {
    public static void main(String[] args) {
        int sicaklik ;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz : ");
        sicaklik=input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik>=5&&sicaklik<15){
            System.out.println("Sinemaya gidebirisiniz .");
        }else if(sicaklik>=15&&sicaklik<=25){
            System.out.println("Pikiniğe gidebilirsiniz .");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz .");
        }
    }
}
