import java.util.Scanner;

public class SaturdayClass {
    public static void main(String[] args) {


        System.out.println("Please enter your height in iniches");

        Scanner scanner = new scanner(System.in);

        int input = scanner.nextInt();

        if (input < 60){
            System.out.println("You are classifed as short");
        } else if( input > 60 && input <72){
            System.out.println("You are Medium height");
        } else{
            System.out.println("You are tall");
        }






    }
}
