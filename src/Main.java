import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while(true){
            int num;
            System.out.println("Which exercise do you want to run 1-xx? (exit program with a non integer)?");
            try{
                num = scan.nextInt();
                switch(num){
                    case 1:
                        Exercise1();
                    default:
                        System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Recieved non integer input, exiting program");
                System.exit(0);
            }
        }
    }
    public static void Exercise1(){
        System.out.println("Heluuu");
    }
}