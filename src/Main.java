
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
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
                    case 3:
                        Exercise3();
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
    public static void Exercise3() throws IOException {
        System.out.println("In this program Im reading the file Exercise3.txt and finding out the percentage of commented lines.");
        var instream = new BufferedReader(new FileReader("src/Exercise3.txt"));
        //C:\Users\jarit\Lexicon Växjö\JavaStreaming\StreamingJavaBookExercises\src\TextForExe3.java
        //File file = new File("findingFilePathForExercise3.txt");
        //System.out.println(file.getAbsoluteFile());
        //file.createNewFile();
        int rowNr = 0;
        int rowsWithComment = 0;
        while(true){
            String row = instream.readLine();
            if (row == null){
                break;
            }
            if (row.contains("//")){
                rowsWithComment++;
            }
            rowNr++;
        }
        double amount = 100 / rowNr * rowsWithComment;
        System.out.println("Rows: " + rowNr + ", Rows with comment: " + rowsWithComment + ", percentage: " + amount + "%.");
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