
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
                    case 2:
                        Exercise2();
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
    public static void Exercise2(){
        int max = Integer.MIN_VALUE;
        int num;
        System.out.println("Enter any number of integers, stop feeding integers by pressing non number, at end the program will print the largest integer");
        while(true){
            var scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            try{
                num = scan.nextInt();
                if (num > max){
                    max = num;
                }
            }
            catch(Exception e){
                break;
            }
        }
        System.out.println("The largest integer is: " + max);
    }

    public static void Exercise1(){
        var scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter a integer for num1:");
        try{
            num1 = scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Non valid integer, exiting program");
            System.exit(0);
        }
        System.out.println("Enter a integer for num2:");
        try{
            num2 = scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Non valid integer, exiting program");
            System.exit(0);
        }
        System.out.println(num1 + "!.. .." + num2 + "!:");
        for (int i = num1; i <= num2; i++){
            System.out.println(i + "! = " + Factorial.fac(i));
        }

    }
}