import java.util.Scanner;

public class sifreBelirleme {
    public static void main(String[] args) {
        String userName, password, passwordReset, newPasspord;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Username : ");
        userName = inp.nextLine();

        System.out.println("Enter Your Password : ");
        password = inp.nextLine();

        if (userName.equals("timeless") && password.equals("perfections") ){
            System.out.println(" You are logged in ");

        }
        else{
            System.out.println("  You entered an incorrect password. If you want to specify a new password, select \"y\" or \"n\" ");
            passwordReset=inp.nextLine();

            if( passwordReset.equals("n")){
                System.out.println(" Login terminated");}

            else if (passwordReset.equals("y")) {
                System.out.println(" Type your new password ");
                newPasspord=inp.nextLine();

                if( newPasspord.equals("perfections")|| newPasspord.equals(password)){
                    System.out.println("Incorrect entry try again ");
                }
                else{
                    System.out.println(" your password has been successfully reset ");

                }

            }
            else{
                System.out.println(" you made the wrong choice ");

            }

        }
    }


}
